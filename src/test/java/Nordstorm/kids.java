package Nordstorm;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class kids extends TestDatas{
	public static void main(String[] args) throws Throwable {
		launchChromeBrowser();
		loadUrl("https://shop.nordstrom.com/");
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\url.png");

//mouse overactions to Signin
		Thread.sleep(1000);

WebElement Signin = driver.findElement(By.xpath("//span[text()='Sign In']"));

Action1(Signin);

Thread.sleep(1000);

WebElement Signin1 = driver.findElement(By.xpath("(//span[text()='Sign In'])[1]"));
Signin1.click();
//buttonclick(Signin1);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\signin1.png");

//createaccount

WebElement CreateAccount = driver.findElement(By.xpath("(//span[@class='_3MTTT _1IsgD'])[1]"));
CreateAccount.click();
//buttonclick(CreateAccount);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\createaccount.png");


WebElement FirstNametxtbox = driver.findElement(By.name("firstName"));
fill(FirstNametxtbox,(getData(1,0)));
//FirstNametxtbox.sendKeys(getData(1,0));
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\Firstname.png");

WebElement LastNametxtbox = driver.findElement(By.name("lastName"));
LastNametxtbox.sendKeys(getData(1,1));
//fill(LastNametxtbox,(getData(1,1)));

screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\lastname.png");


WebElement Emailtxtbox = driver.findElement(By.name("email"));
Emailtxtbox.sendKeys(getData(1,2));
//fill(Emailtxtbox,(getData(1,1)));

screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\email.png");

WebElement Passwordtxtbox = driver.findElement(By.name("password"));
Passwordtxtbox.sendKeys(getData(1,3));
//fill(Passwordtxtbox,(getData(1,1)));

screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\password.png");

WebElement CreateAccountbttn = driver.findElement(By.xpath("(//span[text()='Create Account'])[1]"));
CreateAccountbttn.click();
//buttonclick(CreateAccountbttn);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\createaccountbutton.png");

Thread.sleep(7000);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\shop.png");


//click Shopnow button
WebElement Shopnow = driver.findElement(By.xpath("//span[text()='Shop Now']"));
Shopnow.click();
//buttonclick(Shopnow);


Thread.sleep(1000);
//click kidsbutton

WebElement Kidsbtn = driver.findElement(By.xpath("(//button[@class='_1VRWd _3CU6a _1sMDh _2PDR1'])[4]"));
Kidsbtn.click();
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\kids.png");

//click Designer button
WebElement Designerbtn = driver.findElement(By.xpath("(//a[text()='Designer'])[2]"));
Designerbtn.click();
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\Designerbtn.png");

Thread.sleep(5000);

//selecting the dress

WebElement fourthdressbtn = driver.findElement(By.xpath("//a[@title='Burberry Leon Stripe Down Hooded Vest (Toddler Boys), Image']"));
		fourthdressbtn.click();
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\fourthdress.png");

		Thread.sleep(5000);

		//gettext of product name and product price
		WebElement text = driver.findElement(By.xpath("//h1[text()='Leon Stripe Down Hooded Vest']"));
		String pdtName = text.getText();
		System.out.println(pdtName);
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\pdtname.png");

		Thread.sleep(5000);

		WebElement text3 = driver.findElement(By.xpath("//span[@class='_3p7kp']"));
		String pdtPrice = text3.getText();
		System.out.println(pdtPrice);
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\pdtprice.png");


		
		GetStringData.printPdtNamePrice(pdtName, pdtPrice);


	}
}

	
