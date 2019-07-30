/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegrambot;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.methods.send.SendDocument;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;




public class Bot extends TelegramLongPollingBot{

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        ApiContextInitializer.init();
//        TelegramBotsApi telegramBosApi= new TelegramBotsApi();
//        // TODO code application logic here
//        try {
//            telegramBosApi.registerBot(new TelegramBot());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//        
//        
//        
//    }
    Currency newC = new Currency();
    

    @Override
    public String getBotToken() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "687164916:AAEwKkpdzdGmXASRO9KEfuskjRkL9H-Sa9s";
    }

    @Override
    public void  onUpdateReceived(Update update)  {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        String Til=null;
        String Shahar;
        
        
        String lang1 = "UZB";
        String country1 = "UZB";
        
        String lang2 = "RUS";
        String country2 = "RUS";
        
        Locale l1 = new Locale(lang1, country1);
        ResourceBundle r = ResourceBundle.getBundle("telegrambot/lanRus",l1);
    //chooseLang = r.getString(Til+"_xush");
        String chooseLang;
        
        //String eng = r.getString(lang1+"_wish");
       //ystem.out.println(eng);
      
        Message message =update.getMessage();
      SendMessage sendMessage2 = new SendMessage();
    // sendMessage.enableMarkdown(true);
    
    sendMessage2.setChatId(message.getChatId().toString()).setText("Xizmat turini tanlang/Выберите тип услуги");
   
          

    
    
    
    if(message != null && message.hasText()){
        // sendMag(message, "welcome to Agrobank " + message.getFrom().getFirstName()+ " our services for you  ");
        
       if(message.getText().equals("/start") || message.getText().equals("🇸🇱🇷🇺Tilni O'zgartirish")|| message.getText().equals("🇸🇱🇷🇺Изменить язык") || message.getText().equals("🔄перезагружать")||message.getText().equals("🔄перезагружать")||message.getText().equals("🔄Qayta yuklash")){
         ReplyKeyboardMarkup keyboardLang =new ReplyKeyboardMarkup();
    List<KeyboardRow> keyboardL = new ArrayList<>();
    KeyboardRow rowLan = new KeyboardRow();
    
    rowLan.add("uzb");
    keyboardL.add(rowLan);
    
    rowLan = new KeyboardRow();
    rowLan.add("rus");
    keyboardL.add(rowLan);
    
     
    
         keyboardLang.setKeyboard(keyboardL);
       
             sendMessage2.setReplyMarkup(keyboardLang);
    try {
        sendMessage(sendMessage2); // Sending our message object to user
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }}
    if (message.getText().equals("rus")){
    Til = "rus";
    Shahar = "Rus";
    l1 = new Locale(Til, Shahar);
        r = ResourceBundle.getBundle("telegrambot/lanRus",l1);
         //chooseLang = r.getString(Til+"_xush");
        //  System.out.println(r.getString("_Biz_X"));
        ChooseLang chhose = new ChooseLang();
     chhose.lang(Til, Shahar);
    }
    if (message.getText().equals("uzb"))
    {
     Til = "uzb";
    Shahar = "Uzb";
 l1 = new Locale(Til, Shahar);
       r = ResourceBundle.getBundle("telegrambot/lanUzb",l1);
    //chooseLang = r.getString(Til+"_xush");
    // System.out.println(r.getString("_J_SH"));
     ChooseLang chhose = new ChooseLang();
     chhose.lang(Til, Shahar);
 }
     ChooseLang chhose2 = new ChooseLang();
    Til = chhose2.getLan11();
    Shahar = chhose2.getShah();
    l1 = new Locale(Til, Shahar);
       r = ResourceBundle.getBundle("telegrambot/lan"+Shahar,l1);
    
   // System.out.println(Til+"asd");
        // System.out.println(Shahar+"asd1122");

        if(message.getText().equals(Til) || message.getText().equals(r.getString("_Bosh_Sahifa"))){
      //  System.out.println(r.getString("_Biz_X"));
        
        
      sendMag(message, r.getString("_xush") + message.getFrom().getFirstName()+ ". "
                + r.getString("_xizmat"));
      
            
        SendDocument snd = new SendDocument()
                        .setChatId(message.getChatId().toString())
                            .setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/Filiallar.xlsx")).
                                setCaption(r.getString("_F_R"));
        
            SendPhoto msg = new SendPhoto()
                        .setChatId(message.getChatId().toString())
                        .setNewPhoto(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/Xodimlar.jpg"))
                        .setCaption(r.getString("_Ishla"));
                try {
                   // sendMag(message, "https://en.wikipedia.org/wiki/"+message.getText());
                    sendPhoto(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
        
        
        
        
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();  
       
        // creating the list of keyboard
        List<KeyboardRow> keyboard = new ArrayList<>();
        //create keyboard row 
        KeyboardRow row = new KeyboardRow();
        row.add(r.getString("_Biz_X"));
        row.add(r.getString("_J_SH"));
      //  row.add("row 1,3 ");
         
        keyboard.add(row);
           
         row = new KeyboardRow();
        //create second row and adding 
        row.add(r.getString("_Y_SH"));
        row.add(r.getString("_A_v_I"));
        //row.add("row2,3");
        keyboard.add(row);
        
        row= new KeyboardRow();
        row.add(r.getString("_I_X"));
        row.add(r.getString("_KURS_V"));
        keyboard.add(row);
        
        
        row = new KeyboardRow();
        row.add(r.getString("_Change_Lang"));
        row.add(r.getString("_Bog'lan"));
        keyboard.add(row);
        
        row = new KeyboardRow();
        row.add(r.getString("_Qayta_Yuklash"));
        keyboard.add(row);
        
        keyboardMarkup.setKeyboard(keyboard);
       
             sendMessage2.setReplyMarkup(keyboardMarkup);
    try {
        sendMessage(sendMessage2); // Sending our message object to user
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }
        
        
        
        
        //System.out.println(r.getString("_Biz_X"));
        
        
            
        }
//        if(message.getText().equals("/code")){
//            sendMag(message, "your promo kod: "+Code.CodeCreate(8));
//        }
//         if(message.getText().equals("/kimbot")){
//            sendMag(message, "Kim razoda baraga qarwi oynagan bosa owada albatta, e Saidakbar latta )) ");
//            
//            
//        }
//        if(message.getText().equals("/creator")){
//            sendMag(message, "the creator is Great Shohruh if want to know");
//        }


//        if(message.getText().equals(message.getText()))
//        { //Message message2 =update.getMessage();
//            //sendMag(message, "Your name is : " + update.getMessage().getFrom().getFirstName());
//            // sendImageFromUrl("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg?resize=640%2C426","@SmthDifferentBot");
//            //sendMag(message, " Enter any name you want to search ");
//            SendPhoto msg = new SendPhoto()
//                        .setChatId(message.getChatId().toString())
//                        .setPhoto("https://www.instagram.com/"+message.getText()+"/?hl=ru")
//                        .setCaption("Photo");
//                try {
//                    sendMag(message, "https://en.wikipedia.org/wiki/"+message.getText());
//                    sendPhoto(msg); // Call method to send the photo
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//        
//        }


       
        if(message.getText().equals(r.getString("_Biz_X")) ){
          //  System.out.println("12");
//            sendMag(message, "Bank missiyasi - iqtisodiyotning agrar sektorini yanada barqaror rivojlantirish, qishloq xo'jaligida iqtisodiy islohotlarni izchillik bilan chuqurlashtirib borish, fermerlik harakatini qo'llab-quvvatlash, uning moddiy va moliyaviy bazasini mustahkamlash, qishloq xo'jalik mahsulotlarini chuqur qayta ishlovchi, zamonaviy raqobatbardosh mahsulotlarni ishlab chiqarish bo'yicha ilg'or texnika va texnologiyalarni amaliyotga tatbiq qilish hamda ichki bozorni mahalliy oziq-ovqat tovarlari bilan to'ldirishga yo'naltirilgan keng turdagi bank xizmatlarini ko'rsatishdir.  ");
//            sendMag(message,"koproq ma'lumot ucuun wu saytga tawrif buyuring 👉 " + "https://agrobank.uz/uz/aboutbank/index" );
            
            ReplyKeyboardMarkup keyboardmarkup3 = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard3 = new ArrayList<>();
            
            
            KeyboardRow keyForMenu1 = new KeyboardRow();
                    keyForMenu1.add(r.getString("_Bank_Missi"));
            keyboard3.add(keyForMenu1);
            
            keyForMenu1 = new KeyboardRow();
            keyForMenu1.add(r.getString("_Bank_Bowqar"));
            keyboard3.add(keyForMenu1);
            
            
            keyForMenu1 = new KeyboardRow();
             keyForMenu1.add(r.getString("_Bank_Filiallari"));
             keyboard3.add(keyForMenu1);
             
             keyForMenu1 = new KeyboardRow();
            keyForMenu1.add(r.getString("_Bosh_Sahifa"));
            keyboard3.add(keyForMenu1);
            
            keyboardmarkup3.setKeyboard(keyboard3);
            sendMessage2.setReplyMarkup(keyboardmarkup3);
            
             try {
        sendMessage(sendMessage2); // Sending our message object to user
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }
            
            
        }
        if(message.getText().equals(r.getString("_Bank_Missi"))){
             sendMag(message, r.getString("_Bank_Missiyasi"));
            sendMag(message,r.getString("_Batafsil_ma'lumot") + "https://agrobank.uz/uz/aboutbank/index" );
            
            }
            if(message.getText().equals(r.getString("_Bank_Bowqar"))){
             SendDocument sndBowqarma = new SendDocument()
                        .setChatId(message.getChatId().toString())
                            .setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/Boshqaruv.docx")).
                                setCaption(r.getString("_Boshqarma_Xodim"));
                            try {
                   // sendMag(message, "https://en.wikipedia.org/wiki/"+message.getText());
                    sendDocument(sndBowqarma); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if(message.getText().equals(r.getString("_Bank_Filiallari"))){
            SendDocument sndFilial = new SendDocument().setChatId(message.getChatId().toString())
                    .setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/Filiallar.xlsx"))
                    .setCaption(r.getString("_F_R"));
            
                try {
                    sendDocument(sndFilial);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            
            }
            
        if(message.getText().equals(r.getString("_Y_SH"))){
            sendMag(message, r.getString("_Y_SH_Ma'lumot"));
            sendMag(message, r.getString("_Y_SH_Korsatiladigan_Xiz_reg"));
            sendMag(message,r.getString("_Batafsil_ma'lumot") + "https://agrobank.uz/uz/page/corp" );
           
            // clearWebhook();
            
         
        }
        if(message.getText().equals(r.getString("_J_SH")) || message.getText().equals(r.getString("_Ortga"))){
            sendMag(message, r.getString("_J_SH_Ma'lumot"));
            sendMag(message,r.getString("_Batafsil_ma'lumot") + "https://agrobank.uz/uz/page/individuals" );
            ReplyKeyboardMarkup keyboardMarkup2 = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard2 = new ArrayList<>();
            
            
            KeyboardRow another = new KeyboardRow();
            another.add(r.getString("_Omonatlar"));
            another.add(r.getString("_Kredit_Ma"));
            keyboard2.add(another);
             
            another= new KeyboardRow();
            another.add(r.getString("_Tolov_Ka"));
            another.add(r.getString("_Pul_Otkaz"));
            keyboard2.add(another);
            
            another = new KeyboardRow();
            another.add(r.getString("_Komunal_T"));
            another.add(r.getString("_Depoz_Seyf"));
            keyboard2.add(another);
            
            another= new KeyboardRow();
            another.add(r.getString("_Kollej_B_O"));
            another.add(r.getString("_Valyuta_A"));
            keyboard2.add(another);
            
            another = new KeyboardRow();
            another.add(r.getString("_Bosh_Sahifa"));
            keyboard2.add(another); 
            keyboardMarkup2.setKeyboard(keyboard2);
             sendMessage2.setReplyMarkup(keyboardMarkup2);
    try {
        sendMessage(sendMessage2); // Sending our message object to user
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }
       }// menues for Jismoniy shaxslar 
        if(message.getText().equals(r.getString("_Omonatlar"))){
        
            sendMag(message,r.getString("_Omonatlar_Ma'lumot"));
        
       SendDocument sndOmonat = new SendDocument().setChatId(message.getChatId().toString()).
                setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/omonatlar.pdf")).
               setCaption(r.getString("_Yuklab_Olish_M"));
        
            try {
                sendDocument(sndOmonat);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        }
        if(message.getText().equals(r.getString("_Kredit_Ma"))){
            sendMag(message, r.getString("_Kredit_berish"));
            sendMag(message, r.getString("_Batafsil_ma'lumot") +
                    " https://agrobank.uz/uz/page/loans");
        }
        if(message.getText().equals(r.getString("_Tolov_Ka"))){
            
            SendDocument sndTolKarta = new SendDocument().setChatId(message.getChatId().toString()).
                    setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/bank_to'lov_kartalari.pdf")).setCaption(r.getString("_Yuklab_Olish_M"));
            
            ReplyKeyboardMarkup keyboardTolov = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardTolovKarta = new ArrayList<>();
            KeyboardRow keyboardForTolov = new KeyboardRow();
            keyboardForTolov.add(r.getString("_A_Som_Plas_Kart"));
            keyboardTolovKarta.add(keyboardForTolov);
            
            keyboardForTolov = new KeyboardRow();
            keyboardForTolov.add(r.getString("_Visa_X_Kart"));
            keyboardTolovKarta.add(keyboardForTolov);
            
            keyboardForTolov = new KeyboardRow();
            keyboardForTolov.add(r.getString("_Ortga"));
            keyboardTolovKarta.add(keyboardForTolov);
            
            keyboardForTolov = new KeyboardRow();
            keyboardForTolov.add(r.getString("_Bosh_Sahifa"));
            keyboardTolovKarta.add(keyboardForTolov);
            
            keyboardTolov.setKeyboard(keyboardTolovKarta);
                 sendMessage2.setReplyMarkup(keyboardTolov);
    try {
        sendMessage(sendMessage2); // Sending our message object to user
        sendDocument(sndTolKarta);
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }
        }// sub menu for Tolov kontraktlari 
        if(message.getText().equals(r.getString("_A_Som_Plas_Kart"))){
            sendMag(message, r.getString("_A_Som_Plas_Kart")+"\n" +
r.getString("_A_Som_Plas_Kart_Ma'lumot"));
        }
        if(message.getText().equals(r.getString("_Visa_X_Kart"))){
            sendMag(message, r.getString("_Visa_X_Kart_Ma'lumot"));
            
            SendDocument sndVisa = new SendDocument().setChatId(message.getChatId().toString()).
                    setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/VISA_kartalari.pdf"));
            try {
                sendDocument(sndVisa);
            } catch (TelegramApiException e) {
            e.printStackTrace();
            }
            
        }
        if(message.getText().equals(r.getString("_Pul_Otkaz"))){
            sendMag(message, r.getString("Pul_Otkaz_Ma'lumot"));
           
            //System.out.println(Currency.getCurrency());
            SendDocument sndc = new SendDocument().setChatId(message.getChatId().toString()).
                    setNewDocument(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/money_transfers.pdf"));
            
            try {
                // sendMag(message, newC.Curency2());
                sendDocument(sndc);
            } catch (TelegramApiException e) {
            e.printStackTrace();
            } catch (Exception ex) {
                Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(message.getText().equals(r.getString("_Komunal_T"))){
            sendMag(message, r.getString("_Komunal_Tolov_Ma"));
            sendMag(message, r.getString("_Batafsil_ma'lumot") + "https://agrobank.uz/uz/page/pay_bill");
        }
        if(message.getText().equals(r.getString("_Depoz_Seyf"))){
            sendMag(message, r.getString("_Batafsil_ma'lumot")+": https://agrobank.uz/uz/page/deposit_cells");
        }
        if(message.getText().equals(r.getString("_Kollej_B_O"))){
            sendMag(message, r.getString("K-K_Bitiruvchilar_Mikro"));
            sendMag(message, r.getString("_Batafsil_ma'lumot")+" https://agrobank.uz/uz/page/bitiruvchi_oynasi");
        }
        if(message.getText().equals(r.getString("_Valyuta_A"))){
            sendMag(message, r.getString("_Valyuta_Ayr_Ma"));
        }
         if(message.getText().equals(r.getString("_A_v_I"))){
             sendMag(message, r.getString("_A_v_I_Ma'lumot"));
            sendMag(message, r.getString("_Batafsil_ma'lumot") + "https://agrobank.uz/uz/page/partners_media" );
             sendMag(message, r.getString("_Muhim_Faktlar") + "https://agrobank.uz/uz/page/important_facts_uz\n"+
                     r.getString("_Bank_Reytengi")+"  https://agrobank.uz/uz/page/ratings\n" +
                     r.getString("_Moliyaviy_Hiso")+" https://agrobank.uz/uz/page/fin_report\n"+
                     r.getString("_Korres_Bank") + "  https://agrobank.uz/uz/page/corresponding_banks_uz\n"+
                     r.getString("_Xalqar_Munosobat")+"https://agrobank.uz/uz/page/intereconom");
            // clearWebhook();
            
         
        }
            if(message.getText().equals(r.getString("_I_X"))){
                sendMag(message, r.getString("_I_X_Ma'lumot"));
           // sendMag(message,"koproq ma'lumot ucuun wu saytga tawrif buyuring 👉 " + "https://agrobank.uz/uz/page/interactive_services" );
                sendMag(message,  r.getString("_Bank_Joriy_Int_X")+"\n "+
                        r.getString("_Ag_Mobile")+"https://agrobank.uz/uz/page/agro_mobile\n"
                +r.getString("_M_Savdo")+"https://agrobank.uz/uz/page/mobile_trade_uz\n"+
                        r.getString("_Online_Xiz")+ "https://agrobank.uz/uz/page/online_services\n"+
                        r.getString("_Online_Ariza")+"https://agrobank.uz/uz/page/online_enquiry\n"+
                        r.getString("_Ariza_Blankalari")+ "https://agrobank.uz/uz/page/forms\n"+
                        r.getString("_B_X_B_Tariflar")+"https://agrobank.uz/uz/page/tariffs\n"+
                r.getString("_Bank_Qonunch")+ " https://agrobank.uz/uz/page/regulations\n"
                +r.getString("_Fuqarolar_Mur")+" https://agrobank.uz/uz/page/murojaatlar\n"
                +r.getString("_Tez_tez_U_S") + "https://agrobank.uz/uz/page/FAQ\n");
            // clearWebhook();
            
         
        }
            if (message.getText().equals(r.getString("_KURS_V"))){
                
               // sendMag(message, "Hozirgi vaqtdagi pul birliklari");
            try {
                sendMag(message,r.getString("_Hoz_V_P_B") + " \n"+"1 USD = "+ newC.Curency2()+"\n"+"1 EUR = "+newC.Curency3()
                +"\n"+"1 RUB = "+newC.CurencyRub()+
                        "\n"+"1 JPY = "+newC.CurencyJPY()+
                        "\n"+"1 CHF = " + newC.CurencyCHF()+
                        "\n"+ "1 GBP =  "+ newC.CurencyGBP());
            } catch (Exception ex) {
                Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
//            if(message.getText().equals("Boglanish")){
//            
//            sendMag(message,"koproq ma'lumot ucuun wu saytga tawrif buyuring 👉 " + "https://agrobank.uz/uz/site/contact" );
//        
//            
//           
//        
//    try {
//        sendMessage(sendMessage2); // Sending our message object to user
//    } catch (TelegramApiException e) {
//        e.printStackTrace();
//    }
//            // clearWebhook();
//                
//        }
      
           if(message.getText().equals(r.getString("_Bog'lan"))){
              
               sendMag(message, r.getString("_Manzil"));
                SendPhoto msg = new SendPhoto()
                        .setChatId(message.getChatId().toString())
                        .setNewPhoto(new File("C://Users/Shokhukh/Documents/NetBeansProjects/TelegramBot/Botlocation.jpg"))
                        .setCaption("Location");
                 SendPhoto msg2 = new SendPhoto()
                        .setChatId(message.getChatId().toString())
                        .setPhoto("https://www.google.com/maps/place/Agrobank/@41.2939377,69.2152662,16z/data=!4m5!3m4!1s0x0:0x414bc29a14aa377f!8m2!3d41.2936606!4d69.2196319")
                        .setCaption(r.getString("_Bosh_Ofis"));
                try {
                   // sendMag(message, "https://en.wikipedia.org/wiki/"+message.getText());
                    sendPhoto(msg); // Call method to send the photo from laptop 
                    sendPhoto(msg2); // call method to send the photo from web
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
               
           }
     
           
//                        else
//            sendMag(message,"Working now ");
    }
    
    
    }

    @Override
    public String getBotUsername() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "@AgrobankTelegramBot";
    }

    private void sendMag(Message message, String s) {
       // throw new UnsupportedOperatiwonException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    SendMessage sendMessage = new SendMessage();
    // sendMessage.enableMarkdown(true);
    sendMessage.setChatId(message.getChatId().toString());
   // sendMessage.setReplyToMessageId(message.getMessageId());
    sendMessage.setText(s);
    
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
     }
    
    public void sendImageFromUrl(String url, String chatId) {
    SendPhoto sendPhotoRequest = new SendPhoto();
    sendPhotoRequest.setChatId(chatId);
    sendPhotoRequest.setPhoto("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg?resize=640%2C426");
    try {
        sendPhoto(sendPhotoRequest);
    } catch (TelegramApiException e) {
        e.printStackTrace();
    }
}
    
    
}
