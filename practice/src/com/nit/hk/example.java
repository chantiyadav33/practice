package com.nit.hk;

import java.util.Scanner;

public class example {
public static void main(String[] args) {
	// printing 1 to 100 numbers in ascending order
	for(int i =1 ;i<=100; i++) {
		System.out.println(i);
	}

	// print 100 to 1 number in descending order
for(int i=100; i>=1;i--) {
	System.out.println(i);
}
 // print A to Z alphabits order
     char c='a';
	 while(c<'z'){
		 System.out.println(c);
		  c++;
	  }
	 char c1='z';
	 while(c1>='a') {
		 System.out.println(c1);
		 c1--;
	 }
	 //print even numbers 
	 for(int i =1; i<=100;i++) {
		 if(i%2==0) {
System.out.println(i);			 
		 }
	 }
Scanner scn =new Scanner(System.in);
System.out.println(" enter the number::");
int number = scn.nextInt();
 long  factoral =1;
 for(int i= 1; i<=number;i++) {
	 factoral*=i;
 }
 System.out.println(factoral);
	 
}
}
