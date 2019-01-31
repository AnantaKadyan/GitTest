import java.io.*;
import java.util.*;
class FileDemo
{
	public static void main(String[] args) {
		File f =null;
		try {
            f = new File("data.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner scan = new Scanner(System.in);
       boolean flag =true;
             
 	     while(flag){
        System.out.println(" enter s.no:");
               bout.write(Integer.toString(scan.nextInt()));
               bout.write(' ');
        System.out.println("enter the name:");
              bout.write(scan.next());
              bout.write(' ');
        System.out.println("enter the CGPA :");
              bout.write(Float.toString(scan.nextFloat()));
              bout.write(' ');
        System.out.println("enter the grade:");
              bout.write(scan.next().charAt(0));

              bout.newLine();
              System.out.println("do you want to continue ?");
              char c = scan.next().charAt(0); 
              if(c == 'n')
              flag = false; 
          }   
            bout.close();


               FileReader fin = new FileReader(f);
        BufferedReader bin= new BufferedReader(fin);
        String sr;
        System.out.println("The contents of the file are: "); 
     while((sr=bin.readLine())!=null)
     {
          String[] strs = sr.split(" ");
           System.out.println(strs[0] +" "+strs[1] +" "+ strs[2]+" "+strs[3]);                 
        }
}         
    catch (Exception e) {
                              
       // if any I/O error occurs
    	e.printStackTrace();
      } 


      
	}
}