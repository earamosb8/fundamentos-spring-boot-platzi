package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {

    @Override
    public void print() {
        System.out.println("mensaje desde el bean");
    }
}
