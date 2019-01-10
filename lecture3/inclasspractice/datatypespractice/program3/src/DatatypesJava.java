/* Author: Ananta
version: 1.0.0
Purpose: to display the datatypes of java in tabular form*/
 class DatatypesJava {
 	public static void main(String[] args) {
 		
 		int counter = 1 ; // declaration and initialisation of counter variable

 		System.out.println("s No."+"\t"+"Data Type"+"\t"+"Size"+"\t"+"Min Value"+"\t"+"Max Value");


 		System.out.println((counter++) + "\t"+"Char"+"\t"+Character.TYPE+"\t"+Character.SIZE+"\t"+(int)Character.MIN_VALUE+"\t"+(int)Character.MAX_VALUE);
 		
 		System.out.println((counter++) + "\t"+"Int"+"\t"+Integer.TYPE+"\t"+Integer.SIZE+"\t"+Integer.MIN_VALUE+"\t"+Integer.MAX_VALUE);
 		
 		System.out.println((counter++) + "\t"+"Byte"+"\t"+Byte.TYPE+"\t"+Byte.SIZE+"\t"+Byte.MIN_VALUE+"\t"+Byte.MAX_VALUE);
 		
 		System.out.println((counter++) + "\t"+"Double"+"\t"+Double.TYPE+"\t"+Double.SIZE+"\t"+Double.MIN_VALUE+"\t"+Double.MAX_VALUE);
 		
 		System.out.println((counter++) + "\t"+"Float"+"\t"+Float.TYPE+"\t"+Float.SIZE+"\t"+Float.MIN_VALUE+"\t"+Float.MAX_VALUE);
 		
 		System.out.println((counter++) + "\t"+"Long"+"\t"+Long.TYPE+"\t"+Long.SIZE+"\t"+Long.MIN_VALUE+"\t"+Long.MAX_VALUE);
 		
 	   // all the datatypes are printed in the desired format

 	}
 }