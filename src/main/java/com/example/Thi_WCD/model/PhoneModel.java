package com.example.Thi_WCD.model;

import com.example.Thi_WCD.entity.Phone;

import java.util.List;

public interface PhoneModel {
    boolean save(Phone phone);
    boolean update(int id ,Phone phone);
    boolean delete(int id);
    List<Phone> findByAll();
    Phone findById(int id);
}
