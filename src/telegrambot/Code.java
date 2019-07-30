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
public class Code {
    public static String CodeCreate(int length) {
        String symbols = "687164916:AAEwKkpdzdGmXASRO9KEfuskjRkL9H-Sa9s";
        String pCode="";
        int max=symbols.length()-1;
        for(int i=0; i < max;i++){
        int position = (int) Math.floor(Math.random()*max);
        pCode = pCode+ symbols.substring(position,position+1);
        }
    return pCode; 
    }
    
}
