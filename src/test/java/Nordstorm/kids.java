package Nordstorm;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class kids extends TestDatas{
	
	public static void main(String[] args) throws Throwable {
		launchChromeBrowser();
		loadUrl("https://shop.nordstrom.com/");
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\url.png");

//mouse overactions to Signin
		Thread.sleep(2000);

WebElement Signin = driver.findElement(By.xpath("(//span[text()='Sign In'])[2]"));

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





Thread.sleep(3000);
//click kidsbutton

WebElement Kidsbtn = driver.findElement(By.xpath("(//button[@class='_1VRWd _3CU6a _1sMDh _2PDR1'])[4]"));
Kidsbtn.click();
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\kids.png");
Thread.sleep(2000);



//click Designer button
WebElement Designerbtn = driver.findElement(By.xpath("(//a[text()='Designer'])[2]"));
Designerbtn.click();
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\Designerbtn.png");
Thread.sleep(2000);

//scrollup ,scroll down
JavascriptExecutor js = (JavascriptExecutor)driver;
//scrolldown
WebElement scrolldownservices = driver.findElement(By.xpath("//span[text()='Services']"));

js.executeScript("arguments[0].scrollIntoView(true)",scrolldownservices);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\scrolldown.png");

//scrollup
WebElement scrollupkids = driver.findElement(By.xpath("//button[text()='Kids']"));

js.executeScript("arguments[0].scrollIntoView(false)",scrollupkids);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\scrollup.png");


Thread.sleep(5000);


//selecting the dress
//right click the dress,open in new tab by using actions class


WebElement dressbtn = driver.findElement(By.xpath("//a[@title='Comme des Garçons PLAY Stripe T-Shirt (Toddler & Little Kid), Image']"));
		Actions acc = new Actions(driver);
		acc.contextClick(dressbtn).perform();
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\rightclick.png");

		
		//Robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\dress in newtab.png");

		//windows Handling
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String x : allwindows) {
			if(!Parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
		
		//dropdown the textbox for size
		WebElement sizetextbox = driver.findElement(By.xpath("(//div[@class='_16F8V'])[1]"));
		sizetextbox.click();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
WebElement colourtextbox = driver.findElement(By.xpath("(//div[@class='_16F8V'])[9]"));
colourtextbox.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\sizecolour.png");

Thread.sleep(1000);

		//add to bag
		WebElement buttonaddtobag = driver.findElement(By.xpath("//span[text()='Add to Bag']"));
		buttonaddtobag.click();
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\addtobag.png");

		//span[text()='Add to Bag']
		
		
		Thread.sleep(5000);

		//gettext of product name and product price
		WebElement text = driver.findElement(By.xpath("//h1[text()='Stripe T-Shirt']"));
		String pdtName = text.getText();
		System.out.println(pdtName);
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\pdtname.png");

		Thread.sleep(5000);

		WebElement text3 = driver.findElement(By.xpath("//span[text()='INR 6898.57']"));
		String pdtPrice = text3.getText();
		System.out.println(pdtPrice);
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\pdtprice.png");


		
		GetStringData.printPdtNamePrice(pdtName, pdtPrice);

		Thread.sleep(3000);

		
		//in yourbag
		//a[@class='_1y3qY _1hcrA _2xKC5 _28KZY']
		//WebElement InurBagbutton = driver.findElement(By.xpath("//a[@class='_1y3qY _1hcrA _2xKC5 _28KZY']"));
		//InurBagbutton.click();
		
		//checkout
		WebElement checkoutbtn = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
		checkoutbtn.click();
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\checkout.png");

		Thread.sleep(2000);

		//deliverydetails
		
		WebElement email = driver.findElement(By.id("shipping-email"));
		email.sendKeys(getData(1,2));
		
		WebElement firstname = driver.findElement(By.id("shipping-first-name"));
		firstname.sendKeys(getData(1,0));
		
		WebElement lastname = driver.findElement(By.id("shipping-last-name"));
		lastname.sendKeys(getData(1,1));
		WebElement address = driver.findElement(By.id("shipping-address-line1"));
		address.sendKeys(getData(1,4));
		WebElement postalcode = driver.findElement(By.id("shipping-postal-code"));
		postalcode.sendKeys(getData(1,5));
		WebElement city = driver.findElement(By.id("shipping-city"));
		city.sendKeys(getData(1,6));
		WebElement phone = driver.findElement(By.id("shipping-tel"));
		phone.sendKeys(getData(1,7));
		
		WebElement location= driver.findElement(By.id("shipping-country"));
		Select l = new Select(location);
		l.selectByIndex(5);

		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\shipmentdetails.png");

		
		WebElement continuebtn= driver.findElement(By.id("continue-btn-left"));
		continuebtn.click();
		screenShot(driver,"C:\\Users\\GAWTHAM HANISH\\Documents\\Selineum&java\\projectscreenshots\\paymentdetails.png");

	}
}

	
