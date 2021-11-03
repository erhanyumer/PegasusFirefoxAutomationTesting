import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import java.util.List;


public class Pegasus_Firefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flypgs.com/en");

        driver.manage().window().maximize();//maximize window

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.id("nxm2CookieSubmitButton")).click();//cookie submit button

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.className("col-sm-3")).click();//click to "from" button

        driver.findElement(By.className("select2-search__field")).sendKeys("ank");

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.className("select2-results__options")).click();//click ankara

        driver.findElement(By.cssSelector("span.nxm2_select-nereye > span:nth-child(1) > span:nth-child(1)")).click();//click to "to" button

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.className("select2-search__field")).sendKeys("lon");

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }


        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.DOWN);//down to london

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);//select london

        driver.findElement(By.id("dp1")).click();//click departure date

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[1]/div/div[2]/div/div[2]/div/a")).click();//click next month button

        driver.findElement(By.cssSelector("#search-flight-datepicker-departure > div:nth-child(1) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(4) > a:nth-child(1)")).click();//selecting 8 of December

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("#search-flight-datepicker-arrival > div:nth-child(1) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(4) > a:nth-child(1)")).click();//selecting 15 of December

        driver.findElement(By.cssSelector("div.col-sm-3:nth-child(3) > div:nth-child(1) > div:nth-child(1)")).click();//click selecting passengers

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        int i = 0;
        while (i < 2) {
            driver.findElement(By.cssSelector(".opened > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(2) > a:nth-child(3) > i:nth-child(1)")).click(); //click "+" sign on passenger count
            i++;
        }

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        int j = 0;
        while (j < 2) {
            driver.findElement(By.cssSelector(".opened > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(2) > a:nth-child(1) > i:nth-child(1)")).click(); //click "-" sign on passenger count
            j++;
        }

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".opened > div:nth-child(4) > a:nth-child(4)")).click();//click "Done"

        driver.findElement(By.cssSelector(".adultSoldierSelection")).click();//click submit

        driver.findElement(By.cssSelector(".binder-go")).click();//click "I Agree"

        driver.findElement(By.cssSelector("div.availability-list:nth-child(3) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();//select flight

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".expanded > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1)")).click();//select price

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.availability-list-item:nth-child(2) > button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();//select return flight

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".expanded > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();//select return flight price

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.button:nth-child(2) > div:nth-child(1)")).click();//proceed

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".bundle-upgrade-modal-continue")).click();//continue without upgrading


        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[3]/div/div[1]/div/div/form/div/div/div[1]/div/div/div/input")).sendKeys("Erhan");//name

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".surname > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("YUMER");//surname

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.date-text-input-item:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("10");//birthday

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.date-text-input-item:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("04");//birth month

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.date-text-input-item:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("1998");//birth year

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".passenger-gender-field > label:nth-child(2) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")).click();//gender

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".phone-container > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("507");//phone

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".phone-container > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("5322398");//phone continue

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.MuiFormGroup-root:nth-child(2) > label:nth-child(1) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")).click();//nationality

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".tckn > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("12345678910");//id number

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.accordion:nth-child(2) > button:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)")).click();//contact details



        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div[2]/div/div[2]/div/form/div/div[2]/div[4]/div/div/div/input")).sendKeys("eryumer@gmail.com");//email

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.check-container:nth-child(1) > label:nth-child(1) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")).click();//sms checkbox


        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//continue

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to next flight

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button")).click();//proceed to next flight

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button")).click();//proceed to next flight

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button")).click();//proceed to next flight

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to meal selection

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".horizontal-button-list-item > div:nth-child(1)\n")).click();//continue

        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed next flight

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.button:nth-child(2) > div:nth-child(1)")).click();//select same seats

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.button:nth-child(2) > div:nth-child(1)")).click();//continue to meal selection

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.ssr-meal-tab-item:nth-child(3) > div:nth-child(1) > img:nth-child(1)")).click();//select tuna sandwich

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ssr-meal-select-confirm-button")).click();//approve

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to next flight

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.ssr-meal-tab-item:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click();//select chicken sandwich

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ssr-meal-select-confirm-button > div:nth-child(1)")).click();//approve

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to next flight

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.ssr-meal-tab-item:nth-child(2) > div:nth-child(1) > img:nth-child(1)")).click();//select ham sandwich

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ssr-meal-select-confirm-button > div:nth-child(1)")).click();//approve

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to next flight

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button.ssr-meal-tab-item:nth-child(7) > div:nth-child(1) > img:nth-child(1)")).click();//wrap selected

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ssr-meal-select-confirm-button > div:nth-child(1)")).click();//approve

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to baggage

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".sub-title")).click();//increase baggage

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".baggage-displayed-text")).click();//increase baggage dropdown

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.menu-item:nth-child(5) > div:nth-child(1) > div:nth-child(2)")).click();//30kg selected

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to next flight

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".baggage-displayed-text")).click();//increase baggage dropdown

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("div.menu-item:nth-child(4) > div:nth-child(1) > div:nth-child(1)")).click();//20kg selected

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to entertainment

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ife-submit-button > div:nth-child(1)")).click();//proceed to extra travel services

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".submit-button > div:nth-child(1)")).click();//proceed to payment

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/input")).sendKeys("1234657890");//card number

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/input")).sendKeys("Erhan YUMER");//card holder name

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[1]/div/div/input")).sendKeys("11");//month

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/input")).sendKeys("24");//year

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[4]/div[1]/div/div/input")).sendKeys("123");//cvv

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".MuiCheckbox-root > span:nth-child(1) > input:nth-child(1)")).click();//i have read checkbox

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".button-container")).click();//buy now

    }
    }