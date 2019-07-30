/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegrambot;

import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 *
 * @author Shokhukh
 */
public class Main {
    
       public static void main(String[] args) throws Exception {
          // Currency newC= new Currency();
          // System.out.println(newC.Curency2());
          
          
        
          
  
          
          
          
          
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi= new TelegramBotsApi();
        // TODO code application logic here
        try {

            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
}
