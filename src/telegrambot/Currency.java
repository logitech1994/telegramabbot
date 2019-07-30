/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegrambot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Shokhukh
 */
public class Currency {
    
      /**
     * @param args the command line arguments
     */
   //static String cur;
     static String price= "not found ";
    String Curency2() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 USD   ") ){
    System.out.println(line);
    int target = line.indexOf("1 USD   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+50, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }
     String Curency3() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 EUR   ") ){
    System.out.println(line);
    int target = line.indexOf("1 EUR   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+43, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }

   
     String CurencyRub() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 RUB   ") ){
    System.out.println(line);
    int target = line.indexOf("1 RUB   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+51, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }

     
     String CurencyJPY() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 JPY   ") ){
    System.out.println(line);
    int target = line.indexOf("1 JPY   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+52, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }

     
     String CurencyCHF() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 CHF   ") ){
    System.out.println(line);
    int target = line.indexOf("1 CHF   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+56, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }

    
     String CurencyGBP() throws Exception {
        // TODO code application logic here
    final String SYN = "KO";
    URL url = new URL("http://cbu.uz/uzc/");
    URLConnection urlcon = url.openConnection();
    InputStreamReader inStream = new InputStreamReader(urlcon.getInputStream());
    BufferedReader buff = new BufferedReader(inStream);
    String line = buff.readLine();
    //String price= "not found ";
    while(line != null){
    //System.out.println(line);
    //line = buff.readLine();
    //int i = 0 ;
   
      // i++;
       // System.out.println(line);
    
   if (line.contains("1 GBP   ") ){
    System.out.println(line);
    int target = line.indexOf("1 GBP   ");
    int deci = line.indexOf(".", target);
    int start= deci;
    while (line.charAt(start) != '<'){
    start--;
    }
    price= line.substring(start+60, deci +5);
    
   }
   line = buff.readLine();
    //}
    // System.out.println(line);
   
    }
    //System.out.println(price);
  //  cur=price;
         return price;
    
        
    }

    
    
}
