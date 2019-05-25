package pages;

import factoryControl.Link;
import org.openqa.selenium.By;

public class MainPage {

    public Link loginLink;

    public MainPage(){
        loginLink = new Link(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
    }


}
