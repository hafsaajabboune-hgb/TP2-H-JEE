package com.example.dao;

import org.springframework.stereotype.Component;

@Component("dao4")
public class DaoImpl4 implements IDao {
    @Override
    public double getValue() {
        return 700.0;
    }
}