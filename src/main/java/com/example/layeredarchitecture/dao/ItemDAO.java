package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> allItemLoadImpl() throws SQLException, ClassNotFoundException;

    public void deleteImpl(String code) throws SQLException, ClassNotFoundException;

    public void saveImpl(String code,String description,BigDecimal unitPrice,int qtyOnHand) throws SQLException, ClassNotFoundException;

    public void updateImpl(String description,BigDecimal unitPrice,int qtyOnHand,String code) throws SQLException, ClassNotFoundException;

    public boolean existImpl(String code) throws SQLException, ClassNotFoundException;

    public String getCurrentId() throws SQLException, ClassNotFoundException;

    public ItemDTO getItem(String code) throws SQLException, ClassNotFoundException;

    public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
