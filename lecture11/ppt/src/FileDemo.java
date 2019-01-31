import java.io.*;
import java.util.*;
class FileDemo
{
	public static void main(String[] args) {
		File f =null;
		try {
            f = new File("file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner scan = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(scan.hasNext()){
               bout.write(scan.nextLine());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
                              
       // if any I/O error occurs
    	e.printStackTrace();
      }   
	}
}