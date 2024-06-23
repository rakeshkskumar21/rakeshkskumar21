package com.assignmnet;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.google.common.io.Files;
import java.util.Date;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import java.io.File;
import java.io.IOException;

public class automate {
    String link;
    String url1, url2, url3, url4;
    String path1, path2;
    String devices;
    int width1, height1, width2, height2, width3, height3, width4, height4,width5, height5, width6, height6;
    int dimension1, dimension2;
    String mkfoldresname;
    String web;
    String browserName;;
   
void takeInputs( 
        String url1,String url2,String url3,String url4,
        String path1, String path2,
        int width1,int height1,int width2,int height2,
        int width3,int height3,int width4,int height4,
        int width5,int height5,int width6,int height6 )
    { 
       this.url1=url1; this.url2=url2; this.url3=url3; this.url4=url4; 
       this.path1=path1; this.path2=path2;   
       this.width1=width1; this.height1=height1;this.width2=width2;
       this.height2=height2;this.width3=width3;  this.height3=height3;
       this.width4=width4; this.height4=height4; this.width5=width5;  
       this.height5=height5; this.width6=width6;  this.height6=height6;
       mkfoldresname= dimension1 +"x"+ dimension2;
    }

    /* =======functions called and calling */
void main_chrome_urls_function() throws InterruptedException, IOException{
    chromefunction(url1,path1,width1,height1);chromefunction(url2,path1,width1,height1);
    chromefunction(url3,path1,width1,height1);chromefunction(url4,path1,width1,height1);
    chromefunction(url1,path1,width2,height2);chromefunction(url2,path1,width2,height2);
    chromefunction(url3,path1,width2,height2);chromefunction(url4,path1,width2,height2);
    chromefunction(url1,path1,width3,height3);chromefunction(url2,path1,width3,height3);
    chromefunction(url3,path1,width3,height3);chromefunction(url4,path1,width3,height3);

    chromefunction(url1,path2,width4,height4);chromefunction(url2,path2,width4,height4);
    chromefunction(url3,path2,width4,height4);chromefunction(url4,path2,width4,height4);
    chromefunction(url1,path2,width5,height5);chromefunction(url2,path2,width5,height5);
    chromefunction(url3,path2,width5,height5);chromefunction(url4,path2,width5,height5);
    chromefunction(url1,path2,width6,height6);chromefunction(url2,path2,width6,height6);
    chromefunction(url3,path2,width6,height6);chromefunction(url4,path2,width6,height6);

}
void main_firefox_urls_function() throws InterruptedException, IOException{
    firefoxfunction(url1,path1,width1,height1);firefoxfunction(url2,path1,width1,height1);
    firefoxfunction(url3,path1,width1,height1);firefoxfunction(url4,path1,width1,height1);
    firefoxfunction(url1,path1,width2,height2);firefoxfunction(url2,path1,width2,height2);
    firefoxfunction(url3,path1,width2,height2);firefoxfunction(url4,path1,width2,height2);
    firefoxfunction(url1,path1,width3,height3);firefoxfunction(url2,path1,width3,height3);
    firefoxfunction(url3,path1,width3,height3);firefoxfunction(url4,path1,width3,height3);

    firefoxfunction(url1,path2,width4,height4);firefoxfunction(url2,path2,width4,height4);
    firefoxfunction(url3,path2,width4,height4);firefoxfunction(url4,path2,width4,height4);
    firefoxfunction(url1,path2,width5,height5);firefoxfunction(url2,path2,width5,height5);
    firefoxfunction(url3,path2,width5,height5);firefoxfunction(url4,path2,width5,height5);
    firefoxfunction(url1,path2,width6,height6);firefoxfunction(url2,path2,width6,height6);
    firefoxfunction(url3,path2,width6,height6);firefoxfunction(url4,path2,width6,height6);
}
void main_safari_urls_function() throws InterruptedException, IOException{
    safarifunction(url1,path1,width1,height1);safarifunction(url2,path1,width1,height1);
    safarifunction(url3,path1,width1,height1);safarifunction(url4,path1,width1,height1);
    safarifunction(url1,path1,width2,height2);safarifunction(url2,path1,width2,height2);
    safarifunction(url3,path1,width2,height2);safarifunction(url4,path1,width2,height2);
    safarifunction(url1,path1,width3,height3);safarifunction(url2,path1,width3,height3);
    safarifunction(url3,path1,width3,height3);safarifunction(url4,path1,width3,height3);

    safarifunction(url1,path2,width4,height4);safarifunction(url2,path2,width4,height4);
    safarifunction(url3,path2,width4,height4);safarifunction(url4,path2,width4,height4);
    safarifunction(url1,path2,width5,height5);safarifunction(url2,path2,width5,height5);
    safarifunction(url3,path2,width5,height5);safarifunction(url4,path2,width5,height5);
    safarifunction(url1,path2,width6,height6);safarifunction(url2,path2,width6,height6);
    safarifunction(url3,path2,width6,height6);safarifunction(url4,path2,width6,height6);
}
 /*=========================Browsers================ */
/* -----chrome function------ */
void chromefunction(
String link, String devices,
int dimension1,int dimension2)throws InterruptedException,IOException{
    this.link=link;
    this.devices=devices;
    this.dimension1=dimension1;
    this.dimension2=dimension2;
    mkfoldresname= dimension1 +"x"+ dimension2;
    WebDriver chromedriver = new ChromeDriver();
    chromedriver.get(link);
    //Thread.sleep(1000);
    chromedriver.manage().window().setSize(new Dimension(dimension1, dimension2));
    web= chromedriver.getTitle();
    makefolder_website(chromedriver, web);
    makefolder_device(chromedriver, devices);
    makefolder_resolution(chromedriver,mkfoldresname);
    org.openqa.selenium.Capabilities cap = ((RemoteWebDriver) chromedriver).getCapabilities();
    String browserName = cap.getBrowserName();
    capture_in_folder(chromedriver,browserName);
    chromedriver.close();
}
    /* -----firefox function------ */
void firefoxfunction(String link, String devices,
int dimension1,int dimension2) throws InterruptedException, IOException{
    this.link=link;
    this.devices=devices;
    this.dimension1=dimension1;
    this.dimension2=dimension2;
    mkfoldresname= dimension1 +"x"+ dimension2;
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get(link);
       // Thread.sleep(1000);
        firefoxdriver.manage().window().setSize(new Dimension(dimension1, dimension2));
        web= firefoxdriver.getTitle();
        makefolder_website(firefoxdriver, web);
        makefolder_device(firefoxdriver, devices);
        makefolder_resolution(firefoxdriver,mkfoldresname);
        org.openqa.selenium.Capabilities cap = ((RemoteWebDriver) firefoxdriver).getCapabilities();
        String browserName = cap.getBrowserName();
        capture_in_folder(firefoxdriver,browserName);
        firefoxdriver.close();
        }
    /* -----safari function------ */
void safarifunction(String link, String devices,
int dimension1,int dimension2) throws InterruptedException, IOException{
    this.link=link;
    this.devices=devices;
    this.dimension1=dimension1;
    this.dimension2=dimension2;
    mkfoldresname= dimension1 +"x"+ dimension2;
        WebDriver safaridriver = new SafariDriver();
        safaridriver.switchTo().newWindow(WindowType.TAB);
        safaridriver.get(link);
        //Thread.sleep(1000);
        safaridriver.manage().window().setSize(new Dimension(dimension1, dimension2));
        web= safaridriver.getTitle();
        makefolder_website(safaridriver, web);
        makefolder_device(safaridriver, devices);
        makefolder_resolution(safaridriver,mkfoldresname);
        org.openqa.selenium.Capabilities cap = ((RemoteWebDriver) safaridriver).getCapabilities();
        String browserName = cap.getBrowserName();
        capture_in_folder(safaridriver,browserName);
        safaridriver.close();
        }    
/*=========================folders and screenshots================ */
    /* -----makefolder page title function------ */
void makefolder_website(WebDriver driver, String web){
        File folder1=new File("/Users/rakeshks/Desktop/assign_ui_project/" +web);
        if(!folder1.exists()){
            folder1.mkdir();}  
        } 
    /* -----makefolder device function------ */
void makefolder_device(WebDriver driver, String path){
        File folder2=new File("/Users/rakeshks/Desktop/assign_ui_project/"+ web+"/"+path);
        folder2.mkdir();      
    } 
    /* -----makefolder resolution function------ */
void makefolder_resolution(WebDriver driver, String mkfoldresname){
        File folder3=new File("/Users/rakeshks/Desktop/assign_ui_project/"+ web+"/"+devices+"/"+mkfoldresname);
        folder3.mkdir();
    }
    /* -----makefolder browser+screenshot capture function------ */
void capture_in_folder(WebDriver driver, String browserName) throws IOException{
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        Files.copy(f,new File("/Users/rakeshks/Desktop/assign_ui_project/"+ web+"/"+devices+"/"+mkfoldresname+"/"+browserName+"-"+date +".png"));
    }
}

