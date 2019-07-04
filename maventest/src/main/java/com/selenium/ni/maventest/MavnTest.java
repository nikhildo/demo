package com.selenium.ni.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavnTest {
public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium file\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		System.out.println("hello");
}
}