package com.moaiad.reflex;

import com.pengrad.telegrambot.response.BaseResponse;
import org.telegram.telegrambots.api.methods.AnswerInlineQuery;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.inlinequery.InlineQuery;
import org.telegram.telegrambots.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.api.objects.inlinequery.result.InlineQueryResultArticle;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.api.objects.inlinequery.*;
import java.util.LinkedList;
import java.util.List;
//org.telegram.api.engine.storage.AbsApiState
import static com.sun.deploy.ref.AppRef.Type.HTML;

public class withoutpointbot extends  TelegramLongPollingBot {
    long chat_id;

    @Override
    public void onUpdateReceived(Update update) {
        chat_id = update.getMessage().getChatId();


        if (update.hasMessage() && update.getMessage().hasText()) {
            String massege_text = update.getMessage().getText();
           // InlineQuery i =  update;

            //String s = i.getQuery();
            System.out.println();

            int n = Integer.parseInt(String.valueOf(chat_id));
            if (update.getInlineQuery() != null) {

                InlineQueryResult r1 = new InlineQueryResultArticle();
                InlineQueryResult r2;
                r2 = new InlineQueryResultArticle( ) {
                };

                AnswerInlineQuery response =

                                new AnswerInlineQuery(
                                      ).setCacheTime(0);


            String  nw;
            nw =massege_text.replace('أ','ا')
                             .replace('إ','ا')
                             .replace('ئ','ى')
                             .replace('ب' ,'ٮ')
                             .replace('ت' ,'ٮ')
                             .replace('ث' ,'ٮ')
                             .replace('ج' ,'ح')
                             .replace('خ' ,'ح')
                             .replace('ذ' ,'د')
                             .replace('ز' ,'ر')
                             .replace('ش' ,'س')
                             .replace('ض' ,'ص')
                             .replace('ظ' ,'ط')
                             .replace('غ' ,'ع')
                             .replace('ف' ,'ڡ')
                             .replace('ق' ,'ٯ')
                             .replace('ن' ,'ں')
                             .replace('ة' ,'ه')
                             .replace('ؤ' ,'و')
                             .replace('ي' ,'ى');


            SendMessage message = new SendMessage();
            message.setChatId(chat_id);
           message.setText(nw);



            try {




                sendMessage(message);

                // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }


        }}}

        @Override
        public String getBotUsername () {
            return "WithoutPoints_bot";
        }

        @Override
        public String getBotToken () {
            return "500688434:AAHpO_WUznMxg84GL9GsfQ7RCHx3WKrxZEU";
        }
    }
