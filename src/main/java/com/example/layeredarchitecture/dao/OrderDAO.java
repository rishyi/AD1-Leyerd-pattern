package com.example.layeredarchitecture.dao;

import java.sql.SQLException;

public interface OrderDAO {
    public String getCurrentId() throws SQLException, ClassNotFoundException;
}
