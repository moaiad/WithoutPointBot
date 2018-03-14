package com.moaiad.reflex;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ApiContextInitializer.init();
        TelegramBotsApi api =new TelegramBotsApi();
        try{
            api.registerBot(new withoutpointbot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
