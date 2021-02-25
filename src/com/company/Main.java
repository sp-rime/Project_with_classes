package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringDataType<String> obj = new StringDataType<String>();
        obj.performAll("sahi","welcome");
        NumericDataType<Integer> obj1 = new NumericDataType<Integer>();
        obj1.performAll(20,10);
        NumericDataType<Double> obj2 = new NumericDataType<Double>();
        obj2.performAll(3.75,2.64);
    }
}
