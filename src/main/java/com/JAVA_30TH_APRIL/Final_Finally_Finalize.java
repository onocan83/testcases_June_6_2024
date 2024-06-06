package com.JAVA_30TH_APRIL;

public class Final_Finally_Finalize {

	int i ;
	
	public Final_Finally_Finalize(int i) {
		this.i = i;
	}
	
	
	public static void main(String[] args){
		Final_Finally_Finalize obj = new Final_Finally_Finalize(10);
		obj = null;
		
		//Execute Garbage Collection 
		System.gc();
		}
	
	public void finalize() throws Throwable {
		System.out.println(this.i);
	
	super.finalize();
	
	}
	
	}
