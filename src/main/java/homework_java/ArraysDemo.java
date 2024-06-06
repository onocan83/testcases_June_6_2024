package homework_java;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
	  int arr[];
	  arr = new int[10];
	  arr[1]= 100;
	  arr[2]=200;
	  arr[5]=500;
	  
	  for(int i = 0; i < arr.length ; i++) {
	  System.out.println(arr[i]);
	  }
	  
	  int x[]= {1 , 2, 3, 4};
	  System.out.println(x.length);
	  System.out.println(Arrays.toString(x));
	  System.out.println(x[1]);
	  System.out.println();
	  
	  //for(int a=0; a<x.length; a++);
	  //System.out.println();
	  
	  for (int b:x) {//enhanced for loop
		  System.out.println(b);
		  
	  }
	  }
	  }
	


