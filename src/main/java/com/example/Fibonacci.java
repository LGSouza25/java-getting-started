package com.example;


public class Fibonacci{
    public Fibonacci(){

    }
    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    public double soma(double v1, double v2){
    	
    	double a=0, b=0, soma=0;
    	
    	soma= a+b;
    	return(soma);
    	
    }
}