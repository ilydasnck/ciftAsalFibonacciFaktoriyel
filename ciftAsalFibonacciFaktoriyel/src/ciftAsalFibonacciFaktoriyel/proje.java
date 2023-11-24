//Kullanıcıdan sayı alır
//Sayı çift mi
//Çiftse sayıyı yazdırır
//Tekse asal mı 
//Asalsa fibonaccisini yazdırır
//Asal değilse Faktoriyelini yazdırır
//24/11/23




package ciftAsalFibonacciFaktoriyel;

import java.util.Scanner;

public class proje {
    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	System.out.println("Sayi giriniz:");
    	//Kullanıcıdan sayı alma
    	long sayi=input.nextLong();
    	
    	//Çift mi tek mi
    	if(sayi%2==0) {
    		System.out.println(sayi); //Çiftse
    		
    	}
    	
    	else { //Tekse
    		boolean asalMi=true;  //asal mı
    	    for(int i=2;i<=(sayi/2);i++) {
    		if(sayi%i==0) { //asal değil
    			asalMi=false;
    			break;
    		}
    		
    	}
    	    
    	 if(asalMi) { //faktoriyel					
    		 int fakt=1;
    		 for(int i=1;i<=sayi;i++) {
    			 fakt=fakt*i;
    			 
    			 
    		 }//for
    		 
    		System.out.println("Faktoriyel: "+ fakt); 
    		 
    	 }  
    	    
    	 else {//Fibonacci
    		 long a=0;
    		 long b=1;
    		 long fibo=0;
    		 System.out.print("0,1");
    		 for(int i=1; i<=sayi;i++) {
    			 fibo=a+b;
    			 a=b;
    			 b=fibo;
    			 System.out.print(","+fibo);
    			 
    		 }
    		 
    		 
    		 
    		 
    	 }
    	 
    	
    	
    	}//Teksenin elsesi
    	    	
    
    }//main
}//class