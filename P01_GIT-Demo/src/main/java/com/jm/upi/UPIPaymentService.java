package com.jm.upi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("upi")
public class UPIPaymentService
{
	@Value("${bank.srcAcNo}")
	private String oSrcAcNo;   //original source acc no
	@Value("${bank.destAcNo}")   //original destination acc no
	private String oDestAcNo;
     public String sendMoney(String srcAcNo, String destAcNo, double amount)
     {
    	 System.out.println(oDestAcNo+"     "+oSrcAcNo);
    	 if(srcAcNo.equals(oSrcAcNo) && destAcNo.equals(oDestAcNo)) {
    		 return "Rs. "+amount+" sent to Account No : "+destAcNo; 
    	 }
    	 else {
    		 return "Error in sending Rs. "+amount+" to Account No : "+destAcNo; 
    	 }
     }
}
