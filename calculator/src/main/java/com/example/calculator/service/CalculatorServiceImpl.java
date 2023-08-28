/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.calculator.service;

import org.springframework.stereotype.Service;
/**
 *
 * @author seizr
 */
@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        if (b==0) {
            throw new IllegalArgumentException("Tidak terdefinisi, tidak bisa dibagi dengan nol!");
        }
        return a/b;
    }
    
}
