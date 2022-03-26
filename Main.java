package com.metanit;

import java.util.Scanner;

class formylException extends Exception{

    private double y;
    public double getY(){
        return y;
    }
    public formylException(String massage, double y){
        super(massage);
        this.y = y;
    }
}

class calculation{
    public static double getCalculation(double x, double y) throws formylException{
        double result;
        if(y == -1) throw new  formylException("if you enter -1 then division by zero occurs", y);
        result = (x + y)/(y + 1);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите значение x:");
        Scanner ix = new Scanner(System.in);
        int x = ix.nextInt();

        System.out.println("Введите значение y:");
        Scanner iy = new Scanner(System.in);
        int y = iy.nextInt();

        try{
            double result = calculation.getCalculation(x, y);
            System.out.printf("x+y/y+1 = %f",result);
        }
        catch (formylException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getY());
        }
    }
}