/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author laptop
 */
public class Utilidades {
    static Date FechaSystem = new Date();
    static SimpleDateFormat fechaformato = new SimpleDateFormat("EEEEEEEEE dd/MM/yyyy HH:mm:ss");
    public static String FfechaSystem = fechaformato.format(FechaSystem);

    public static void setFfechaSystem(String ffechaSystem) {
        FfechaSystem = ffechaSystem;
    }

    public static String getFfechaSystem() {
        return FfechaSystem;
    } 
    public String Encriptar(String texto) {
 
        String secretKey = "alejandroSuarez"; //llave para encriptar datos
        String base64EncryptedString = "";
 
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
 
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
 
            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
 
    public  String Desencriptar(String textoEncriptado) throws Exception {
 
        String secretKey = "alejandroSuarez"; //llave para encriptar datos
        String base64EncryptedString = "";
 
        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
 
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
 
            byte[] plainText = decipher.doFinal(message);
 
            base64EncryptedString = new String(plainText, "UTF-8");
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }
    
    public boolean write(String saludo) {
        String fileName = String.valueOf("0303456");
        try {
            File archivo=new File(fileName);
            FileWriter escribir=new FileWriter(archivo,true);
            escribir.write(Encriptar(saludo));
            escribir.close();
            return true;
        } catch(Exception e) {
            System.out.println("Error al escribir");
            return false;
        }
    }
    
     public boolean register() {
        String fileName = String.valueOf("0303456");
        try {
            File archivo=new File(fileName);
            archivo.delete();
            write("REGISTRADO");
            return true;
        } catch(Exception e) {
            System.out.println("Error al escribir");
            return false;
        }
    }
    
    public boolean read() throws IOException {
        String texto="";
        String dTexto = "";
        try
        {
            FileReader lector=new FileReader("0303456");
            BufferedReader contenido=new BufferedReader(lector);
            
            while((texto=contenido.readLine())!=null) {
                System.out.println("Encriptado: "+texto);
                 dTexto = Desencriptar(texto);
                System.out.println("Desencriptado: "+dTexto);
            }
            if (dTexto.equals("REGISTRADO")) {
                lector.close();
                return true;
            }
            lector.close();
            File fichero = new File("0303456");
            fichero.delete();
            String sub = dTexto.substring(0,4);
            if (sub.equals("DEMO")) {
                String subString = dTexto.substring(5);
                int contador = Integer.parseInt(subString);
                if (contador < 100) {
                    ++contador;
                    write("DEMO "+contador);
                    return true;
                } else {
                    return false;
                }
            } 
        } catch(Exception e) {
           /* String saludo="sFHPBSjZ3E8=";
        
            String fileName = String.valueOf("0303456");
            File archivo=new File(fileName);
            FileWriter escribir=new FileWriter(archivo,true);
            escribir.write(saludo);
            escribir.close();*/
            return false;
        }
        return false;
    }
    
}
