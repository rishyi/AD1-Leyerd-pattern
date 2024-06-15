package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;

    public void CustomerSaveImpl(String id,String name,String address)throws SQLException, ClassNotFoundException;

    public boolean ExistCustomerImpl(String id) throws SQLException, ClassNotFoundException;

    public void DeleteImpl(String id) throws SQLException, ClassNotFoundException;

    public void updateImpl(String name,String address,String id) throws SQLException, ClassNotFoundException;

    public String getCurrentId() throws SQLException, ClassNotFoundException;

    public CustomerDTO getCustomer (String newValue ) throws SQLException, ClassNotFoundException;
}
