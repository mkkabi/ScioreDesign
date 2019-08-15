package scioredesign;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncryptDecryptMy {
    
    File source, encrypt, decrypted;
    
    public static void encrypt(File source, File encrypt) throws FileNotFoundException, IOException{
        int offset = 64;
        InputStream in = new FileInputStream(source);
        BufferedWriter bw = new BufferedWriter(new FileWriter(encrypt));
        int read = 0;
        while(read >= 0){
           read = in.read();
            System.out.print((char)read);
            bw.append((char) (read + offset));
        }
        bw.flush();
        bw.close();
    }
    
    public static void decrypt(File source, File encrypt) throws FileNotFoundException, IOException{
        int offset = 64;
        InputStream in = new FileInputStream(source);
        BufferedWriter bw = new BufferedWriter(new FileWriter(encrypt));
        int read = 0;
        while(read >= 0){
           read = in.read();
           System.out.print((char)read-64);
            bw.append((char) (read - offset));
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) {
        File in = new File("C:\\in.txt");
        File out = new File("C:\\out.txt");
        File decripted = new File("C:\\decripted.txt");
        
        try {
            EncryptDecryptMy.encrypt(in, out);
            EncryptDecryptMy.decrypt(out, decripted);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    

}
