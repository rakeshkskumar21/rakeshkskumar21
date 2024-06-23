package com.assignmnet;

import java.awt.AWTException;
import java.io.IOException;

public class App 
{  
    public static void main( String[] args ) throws InterruptedException, IOException, AWTException 
    {
       /* automate a=new automate();
        a.takeInputs(
        "https://www.getcalley.com/",
        "https://www.getcalley.com/calley-call-from-browser/",
        "https://www.getcalley.com/calley-pro-features/",
        "https://www.getcalley.com/best-auto-dialer-app/",
        "desktop_device", "mobile_device",
        1980, 1080,
        1366,768,
        1536,764,
        360,640,
        414,896,
        375,667
        );
        a.main_chrome_urls_function();
        a.main_firefox_urls_function();
        a.main_safari_urls_function(); */ 
        

        uploadfile up=new uploadfile();
        up.main_run();
        
        

    }
}
        