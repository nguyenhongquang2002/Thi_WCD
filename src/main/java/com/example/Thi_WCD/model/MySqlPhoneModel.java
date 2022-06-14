package com.example.Thi_WCD.model;

import com.example.Thi_WCD.constant.SqlConstant;
import com.example.Thi_WCD.entity.Phone;
import com.example.Thi_WCD.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlPhoneModel implements PhoneModel{
    @Override
    public boolean save(Phone phone) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PHONE_INSERT);
            preparedStatement.setString(1,phone.getName());
            preparedStatement.setString(2,phone.getBrand().toString());
            preparedStatement.setDouble(3,phone.getPrice());
            preparedStatement.setString(4,phone.getDescription().toString());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Phone phone) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Phone> findByAll() {
        return null;
    }

    @Override
    public Phone findById(int id) {
        return null;
    }
}
