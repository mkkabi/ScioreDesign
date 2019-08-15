package scioredesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EncryptDecrypt {
public static void main(String[] args) throws IOException {
      int offset = 26;  // any value will do
      encrypt("C:\\TD.txt", "C:\\out.txt", offset);
      encrypt("C:\\out.txt", "C:\\decripted.txt", -offset);
      
      readByte("C:\\decripted.txt");
      
   }
   private static void encrypt(String source, String output, int offset) throws IOException {
      try ( InputStream  is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(output) ) {
         int x;
         while ((x = is.read()) >= 0) {
//            byte b = (byte) x;
//            b += offset;
            os.write((byte) (x + offset));
         }
      }
   }
   
   private static void readByte(String source) throws FileNotFoundException, IOException{
       try(InputStream in = new FileInputStream(source)){
           int x;
           while((x=in.read()) >= 0){
               System.out.print((char)x);
           }
       }
   }
}
