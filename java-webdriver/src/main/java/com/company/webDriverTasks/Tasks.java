package com.company.webDriverTasks;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by Anna_Arkhipova on 9/18/2016.
 */
public  class Tasks {
    //Path to save craeted screenshots
    static String path ="D:/Java/Java AT MP Task5/";

    //Separate method for Task1: initializing IE and counting links on the page in IE browser
    public static void task1(String pageUrl) throws InterruptedException {

        System.out.println("\n Task1: init IE and count links");
        CoreFunctions pageIE = new CoreFunctions(DriverInit.initializeIE());
        pageIE.countLinksOnPage(pageUrl);
    }
    //Separate method for Task2: initializing Chrome and counting links on the page in Chrome browser
    public static void task2(String pageUrl) throws InterruptedException {
        System.out.println("\n Task2: init Chrome and count links");
        CoreFunctions pageChrome = new CoreFunctions(DriverInit.initializeChrome());
        pageChrome.countLinksOnPage(pageUrl);
    }
    //Separate method for Task3: initialize FireFox and count link on the page in FireFox browser
    public static void task3(String pageUrl) throws InterruptedException {
        System.out.println("\n Task3: init Firefox and count links");
        WebDriver driver = DriverInit.initializeFirefox();
        CoreFunctions pageFirefox = new CoreFunctions(driver);
        pageFirefox.countLinksOnPage("https://en.wikipedia.org/wiki/Main_Page");
    }
    //Separate method for Task4:
    // - Launch new IE, http://www.diary.ru/.
    // - Enter login and password and close browser
    public static void task4(String pageUrl) throws InterruptedException {
        System.out.println("\n"+"\n"+"Task4: Login IE");
        WebDriver driver = DriverInit.initializeIE();
        CoreFunctions loginPage = new CoreFunctions(DriverInit.initializeIE());
        driver.get(pageUrl);
        loginPage.typeLoginPaswd(pageUrl);
    }

    //Task 5_1: search for url that is located on the first page in google
    public static void task5_1(String url) throws InterruptedException, IOException {

        CoreFunctions googleSearch = new CoreFunctions(DriverInit.initializeChrome());

        System.out.println("\n" + "\n" + "Task5.1: Search for seleniumhq.org ");
        googleSearch.searchByQuery(url, "selenium automation testing");

        boolean found = googleSearch.findAndGetResult("seleniumhq.org", path);
        if (!found) {
            System.out.println("Error: seleniumhq.org is not found.");
        } else {
            System.out.println("Google Search test PASSED!");
        }
    }

    //Task 5_2: search for url that is located  further then 10th page in google
    public static void task5_2(String url) throws InterruptedException, IOException {
        CoreFunctions googleSearch = new CoreFunctions(DriverInit.initializeChrome());

        System.out.println("\n" + "\n" + "Task5.2: Search for vit.ua ");
        googleSearch.searchByQuery(url, "осциллограф");
        boolean found = googleSearch.findAndGetResult("vit.ua", path);
        if (!found) {
            System.out.println("Error: vit.ua is not found.");
        } else {
            System.out.println("Google Search test PASSED!");
        }
    }

    //Task 5_3: search for url that is  not in the search results in google
    public static void task5_3(String url) throws InterruptedException, IOException {
        CoreFunctions googleSearch = new CoreFunctions(DriverInit.initializeChrome());
        System.out.println("\n" + "\n" + "Task5.3: Search for kpi.ua");
        googleSearch.searchByQuery(url, "x300ty");
        boolean found = googleSearch.findAndGetResult("kpi.ua", path);
        if (!found) {
            System.out.println("Error: kpi.ua is not found.");
        } else {
            System.out.println("Google Search test PASSED!");
        }

    }



}
