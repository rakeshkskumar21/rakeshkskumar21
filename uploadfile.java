package com.assignmnet;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebElement;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;
import com.google.common.io.Files;
import java.util.Date;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.bouncycastle.util.Iterable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import java.io.File;
import java.io.IOException;
import java.util.Iterator; 
import java.util.Set;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class uploadfile {
    void main_run()throws InterruptedException, AWTException, IOException{
        
    WebDriver chromedriver = new ChromeDriver();
    chromedriver.manage().window().maximize();
    chromedriver.get("https://demo.dealsdray.com/");
    String parent=chromedriver.getWindowHandle();
    chromedriver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
    chromedriver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
    chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button")).click();
    
   Set <String>s = chromedriver.getWindowHandles();
    Iterator<String> itr=s.iterator();
    while(itr.hasNext()){
        String child=itr.next();
        if(!parent.equals(child))
            {chromedriver.switchTo().window(child);}}
        Thread.sleep(3000); 
    chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button")).click();//order dropdown
    chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button")).click(); //orders
    Thread.sleep(1000);

    Set<String> window1 = chromedriver.getWindowHandles(); 
    for (String window2 : window1) 
        { chromedriver.switchTo().window(window2);}
    chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button")).click(); //Add bulk button
    Thread.sleep(1000);

    Set<String> window2 = chromedriver.getWindowHandles(); 
    for (String window3 : window2) 
        { chromedriver.switchTo().window(window3);}
        Thread.sleep(1000);

    //WebElement chooseFile = chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div"));
    //chooseFile.click();//choose file button
    //Thread.sleep(3000);
    //File file=new File("/Users/rakeshks/Downloads/demo_data.xlsx");
    //chooseFile.sendKeys(file.getAbsolutePath());

    WebElement chooseFile = chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div"));
    chooseFile.click();
    Robot rb= new Robot();
    //StringSelection strsl= new StringSelection("d");
    //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsl, null); 

    rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    Actions act=new Actions(chromedriver);
    act.click().perform();
    rb.keyPress(KeyEvent.VK_D); 
    rb.keyRelease(KeyEvent.VK_D); 
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);  
    Thread.sleep(1000); 
    rb.keyPress(KeyEvent.VK_1); 
    rb.keyRelease(KeyEvent.VK_1); 
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);  
    Thread.sleep(1000); 
    rb.keyPress(KeyEvent.VK_D); 
    rb.keyRelease(KeyEvent.VK_D); 
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER); 
    chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button")).click();
    Set<String> window3 = chromedriver.getWindowHandles(); 
    for (String window4 : window3) 
        { chromedriver.switchTo().window(window4);}
        Thread.sleep(1000);
        chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(3000);
        rb.keyPress(KeyEvent.VK_ESCAPE); 
        rb.keyRelease(KeyEvent.VK_ESCAPE); 
        Thread.sleep(2000);
         
     /*    JavascriptExecutor js = (JavascriptExecutor)chromedriver; 
        js.executeScript("document.getElementById('gvLocationHorizontalRail').scrollRight += 250", ""); */

        //submit button
        chromedriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button")).click();
       Thread.sleep(2000);
       rb.keyPress(KeyEvent.VK_ESCAPE); 
        rb.keyRelease(KeyEvent.VK_ESCAPE); 
        String finalOutputpage =chromedriver.getTitle();
        
             File f=((TakesScreenshot)chromedriver).getScreenshotAs(OutputType.FILE);
            Date date = new Date();
            Files.copy(f,new File("/Users/rakeshks/Desktop/assign_ui_project/"+finalOutputpage+"-"+date +".png"));
        
    }

}
