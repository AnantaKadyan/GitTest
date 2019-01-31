import java.io.File;

public class FileDemo2 {
   
   public static void main(String[] args) {
      File f = null;
      String strs = "file.txt";
      try {
            // create new file
            f = new File(strs);
            String a = f.getAbsolutePath(); 
            boolean c = f.canRead();
            
            // prints absolute path and length
 	     System.out.print("\n absolute path is "+a);
            System.out.print("\nLength =" +f.length());
            
         } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}
