package com.company.webDriverTasks;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        String pageUrl ="https://en.wikipedia.org/wiki/Main_Page";//Url that is required for tasks 1-3
        String urlLogin = "http://www.diary.ru/\n"; //Url that is required for task 4
        String url = "https://www.google.com.ua/"; //Url that is required for task 5

        //Run all tasks for webdriver
        Tasks.task1(pageUrl);
        Tasks.task2(pageUrl);
        Tasks.task3(pageUrl);
        Tasks.task4(urlLogin);
        Tasks.task5_1(url);
        Tasks.task5_2(url);
        Tasks.task5_3(url);
    }

}