package com.jm.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jm.config.AppConfig;
import com.jm.upi.UPIPaymentService;

public class PaymentTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner s = new Scanner(System.in);
		try(s;ctx;){
			
			UPIPaymentService upi = ctx.getBean("upi", UPIPaymentService.class);
			System.out.println("Enter the Source account number : ");
			String sAcNo = s.nextLine();
			System.out.println("Enter the Destination account number : ");
			String dAcNo = s.nextLine();
			System.out.println("Enter the amount to be transferred :  ");
			double amt = s.nextDouble(); 
			String msg = upi.sendMoney(sAcNo, dAcNo, amt);
			System.out.println(msg);
		}
	}
}
