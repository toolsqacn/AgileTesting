package cn.toolsqa.ticket.steps;

import static org.junit.Assert.*;
import java.util.List;
import cucumber.api.java8.En;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.而且;
import cucumber.api.java.zh_cn.那么;
import cucumber.api.PendingException;
import cucumber.api.DataTable;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitBugStepdefs implements En{

	  private SharedDriver driver;
	  private String  baseUrl=Util.BASE_URL;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private String bugTitle;
	  public SubmitBugStepdefs(SharedDriver driver) {
	       this.driver = driver; 
	       
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	      
	  }
	  
	
	  @假如("^测试人员正在执行一个用户故事的测试任务：$")
	  public void 测试人员正在执行一个用户故事的测试任务(DataTable storyTable) throws Throwable {

		  List<List<String>> bugs=storyTable.raw();
		  
	  }

	  @当("^测试人员发现缺陷并提交缺陷单：$")
	  public void 测试人员发现缺陷并提交缺陷单(DataTable bugTable) throws Throwable {

		  
		  List<List<String>> bugs=bugTable.raw(); 

		  
		 
	  }

	  @那么("^返回的缺陷列表中有刚提交的缺陷缺陷单：$")
	  public void 返回的缺陷列表中有刚提交的缺陷缺陷单(DataTable resultTable) throws Throwable {

		  List<List<String>> bugsTitles=resultTable.raw();
		  
	  }
	  

}
