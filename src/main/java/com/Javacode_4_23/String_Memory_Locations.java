package com.Javacode_4_23;

public class String_Memory_Locations {
	
	//Heap memory - String Constant Pool or String Literal Pool(SCP/SLP)
	//Stack memory
	//PC Register
	//Method Area
	//Native Method Area
	
	//whenever you create an Object using new keyword, the object is stored in Heap Memory

	public static void main(String[] args) {
	
     String S1 = new String();
    String S2 = new String("Java"); //literal gets stored in SLP/SCP area
    //2 objects will get created. 1 due to new keyword and another 1 due to literal passed
    
    String S3 = new String  ("Python"); 
    
    String S4 = new String ("Java");
    
    String S5 = "Java";// no object will be created in this
    
	}

}
