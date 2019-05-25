package pages;

import factoryControl.Button;
import factoryControl.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

  public TextBox emailField;
  public TextBox passwordField;
  public Button loginButton;

  public LoginModal(){
      emailField= new TextBox(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_TextBoxEmail']"));
      passwordField= new TextBox(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_TextBoxPassword']"));
      loginButton= new Button(By.xpath("//*[@id='ctl00_MainContent_LoginControl1_ButtonLogin']"));
  }
}
