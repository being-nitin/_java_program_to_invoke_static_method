package com.nitincodes;
// java program to invoke static method by the name of class
class calculator{
    static int powerInt(int num1, int num2){
        int pow = (int) Math.pow(num1,num2);
        return pow;
    }
    static double powerDouble(double num1,double num2){
        double pow2 = Math.pow(num1, num2);
        return pow2;
    }
}
// in this you don't need to create objects:
public class Main {
    public static void main(String[] args){
        System.out.println(calculator.powerInt(3,5));
        System.out.println(calculator.powerDouble(4.5,7.2));
    }
}
