package com.company;

public class Car implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new Exception("Car is closing");
    }
    public void drive() throws Exception {
        System.out.println("Car is driving");
    }

}
