package com.company;

public class NumericDataType <T> implements DataType<T>{
    @Override
    public void addition(T a, T b) {

        System.out.println("Adding two generic instances");
        if(a.getClass() == Integer.class){
            System.out.format("The result is: {%.2f}",(double)(((Integer) a).intValue())+(double)(((Integer) b).intValue()));
        }
        else{
            System.out.format("The result is: {%.2f}",((Double) a).doubleValue()+((Double) b).doubleValue());
        }
        System.out.println();
    }

    @Override
    public void subtraction(T a, T b) {
        System.out.println("subtracting two generic instances");
        //System.out.format("The result is: {%.2f}",(double)(((Integer) a).intValue())-(double)(((Integer) b).intValue()));
        if(a.getClass() == Integer.class){
            System.out.format("The result is: {%.2f}",(double)(((Integer) a).intValue())-(double)(((Integer) b).intValue()));
        }
        else{
            System.out.format("The result is: {%.2f}",((Double) a).doubleValue()-((Double) b).doubleValue());
        }
        System.out.println();
    }

    @Override
    public void multiplication(T a, T b) {
        System.out.println("multiplying two generic instances");
        //System.out.format("The result is: {%.2f}",(double)(((Integer) a).intValue())*(double)(((Integer) b).intValue()));
        if(a.getClass() == Integer.class){
            System.out.format("The result is: {%.2f}",(double)(((Integer) a).intValue())*(double)(((Integer) b).intValue()));
        }
        else{
            System.out.format("The result is: {%.2f}",((Double) a).doubleValue()*((Double) b).doubleValue());
        }
        System.out.println();
    }

    @Override
    public void performAll(T a, T b) {
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
    }
}
