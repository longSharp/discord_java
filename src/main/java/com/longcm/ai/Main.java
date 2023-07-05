package com.longcm.ai;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        final String  TOKEN = System.getenv("DIS");
        JDA jda = JDABuilder.createDefault(TOKEN).build().awaitReady();
    }
}
