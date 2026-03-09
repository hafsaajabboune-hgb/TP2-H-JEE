package com.example.dao;

import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        return 700.0;
    }
}