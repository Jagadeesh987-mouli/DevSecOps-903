package com.jm.upi;

public class UPIPaymentService
{
     public String sendMoney(String srcAcNo, String destAcNo, double amount)
     {
    	 //if(srcAcNo.equals(""))
    	 return "Rs. "+amount+" sent to Account No : "+destAcNo;
     }
}
