package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers {
    public WebDriver driver;
    public ShippingAddressPage(WebDriver driver){
        this.driver = driver;
    }

    public By countryDropdown = By.cssSelector("select[name='shipping_country']");
    public By shippingState = By.cssSelector("select[name='shipping_state']");

    public void selectByIndex(int index, By dropdownLocator){
        Select select = new Select(returnElement(dropdownLocator));
        select.selectByIndex(index);
    }
    public String getSelectedOption(By dropdownLocator){
        Select select = new Select(returnElement(dropdownLocator));
        return select.getFirstSelectedOption().getText();
    }

    public void selectByValue(String value, By dropdownLocator){
        Select select = new Select(returnElement(dropdownLocator));
        select.selectByValue(value);
    }


}
