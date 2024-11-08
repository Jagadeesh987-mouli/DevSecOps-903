package com.jm.main;


public class App {
	public int sum(int x, int y) {
		return x+y;
	}
    public static void main(String[] args) {
    	App a = new App();
    	System.out.println("Sum : "+a.sum(10, 20));
    }
}
