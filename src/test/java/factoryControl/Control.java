package factoryControl;

import driverManager.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Eynar
 */
public class Control {

    private By searchCriteria;
    private WebElement control;

    public Control(By searchCriteria){
        this.searchCriteria=searchCriteria;
    }

    private WebElement findElement(){
          WebDriverWait wait = new WebDriverWait(Driver.getCurrentSession().getDriver(), 5);
          wait.until(ExpectedConditions.elementToBeClickable(searchCriteria));
          wait.until(ExpectedConditions.visibilityOfElementLocated(searchCriteria));
          Driver.getCurrentSession().getDriver().findElement(searchCriteria).isDisplayed();
          Driver.getCurrentSession().getDriver().findElement(searchCriteria).isEnabled();
          Driver.getCurrentSession().getDriver().findElement(searchCriteria).isSelected();
          control=  Driver.getCurrentSession().getDriver().findElement(searchCriteria);;
          return control;

   }

   public void click(){
        findElement();
        control.click();
   }

   public void type(String value){
        findElement();
        control.sendKeys(value);
   }



}
