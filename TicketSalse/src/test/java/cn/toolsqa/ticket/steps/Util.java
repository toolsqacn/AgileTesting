package cn.toolsqa.ticket.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util{
	public static String BASE_URL="http://www.toolsqa.cn/demon";

	public static boolean waitForElement(final By elementLocator,SharedDriver driver) {

	        try {
	            WebDriverWait driverWait = (WebDriverWait) new WebDriverWait(driver, 30, 500).ignoring(
	                    StaleElementReferenceException.class).withMessage("元素在30秒内没有出现!");
	            return driverWait.until(new ExpectedCondition<Boolean>() {

	                public Boolean apply(WebDriver driver) {

	                    try {
	                        if (driver.findElement(elementLocator).isDisplayed()) {
	                            return false;
	                        }
	                    } catch (IndexOutOfBoundsException e) {
	                    } catch (NoSuchElementException e) {
	                    }

	                    return true;
	                }
	            });
	        } catch (Exception e) {
	            return false;
	        }

	    }
}
