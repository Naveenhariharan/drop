package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace 1\\DropDown\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://output.jsbin.com/osebed/2");
	driver.manage().window().maximize();
	
	WebElement drop = driver.findElement(By.id("fruits"));
	Select s = new Select(drop);
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	s.deselectAll();
	
}
}
