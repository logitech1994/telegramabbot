/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegrambot;

/**
 *
 * @author Shokhukh
 */
public class ChooseLang {
   static String lang11;
   static String shahar11;
   
    public static void lang (String Lang, String Shahar){
     lang11 = Lang;
    shahar11=Shahar;    
 
    
    }
    void setlan11(String lan){
    lan=lang11;
    }
    String getLan11(){
    return lang11;
    }
    void setShah(String Shah){
Shah = shahar11;    
}
String getShah(){
return shahar11;
}
}
