package com.jm.main;


public class Arithmetic {
	public int sum(int x, int y) {
		return x+y;
	}
    public static void main(String[] args) {
    	Arithmetic a = new Arithmetic();
    	System.out.println("Dev1 :: Sum : "+a.sum(10, 20));
    	System.out.println("TL :: Sum : "+a.sum(10, 20));
    }
}
