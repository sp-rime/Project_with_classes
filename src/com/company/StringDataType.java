package com.company;

import com.company.DataType;

public class StringDataType <T> implements DataType<T> {
    @Override
    public void addition(T a, T b) {
        System.out.println("Adding two strings");
        System.out.format("The result is: {%s}",a.toString()+b.toString());
        System.out.println();
    }

    @Override
    public void subtraction(T a, T b) {
        System.out.println("cant perfrom this operation on strings");
    }

    @Override
    public void multiplication(T a, T b) {
        System.out.println("cant perfrom this operation on strings");
    }

    @Override
    public void performAll(T a, T b) {
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
    }
}
