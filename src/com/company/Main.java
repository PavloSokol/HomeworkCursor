package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int a = 10;
        int w = 5;
        int b = 25;
        int e = 2;

        double result1 = x+y-a/2*(x+w);
        double result2 = a*(x+x)/y-a*3;
        double result3 = a+b/x-y;
        double result4 = x-e/2%e+1;

        System.out.println("Результат №1: "+result1+ "\n" +"Результат №2: "+result2+ "\n" +"Результат №3: "+result3+ "\n" +"Результат №4: "+result4+"\n");

    }
}
