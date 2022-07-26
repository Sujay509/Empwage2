package com.bridgelabz;

public class Uc4casestatement {
public static final int isfulltime=2;
public static final int ispartime=1;
public static final int emprateperhour=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emphrs=0;
	     int empwage=0;
	     int empCheck = (int) Math.floor(Math.random()*10)%3;
	     switch (empCheck)
	     {
	     case ispartime:
	     emphrs=4;
	     break;
	     case isfulltime:
	    	 emphrs=8;
	    	 break;
	    	 default:
	    		 emphrs=0;
	    		 empwage=emphrs*emprateperhour;
	    	     System.out.println("emp wage : "+empwage);
	    	     
	     }
	}

}
