package org.qachallenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDashboardPage extends BasePage {

    public LoginDashboardPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    // Locators Login
    @FindBy(css = "input[placeholder='Username']")
    private WebElement usernameInput;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordInput;

    @FindBy(css = "button")
    private WebElement loginButton;

    @FindBy(css = "h2")
    private WebElement loginTitle;

    @FindBy(css = "p")
    private WebElement replyMessage;

    // Locators Dashboard
    @FindBy(css = "h2")
    private WebElement dashboardTitle;

    @FindBy(css = "p")
    private WebElement dashboardWelcome;

    // Login methods

    public void setUsername(String username) {
        this.usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        this.passwordInput.sendKeys(password);
    }

    public String getLoginTitle() {
        return this.loginTitle.getText();
    }

    public String getUsername() {
        return this.usernameInput.getAttribute("placeholder");
    }

    public String getPassword() {
        return this.passwordInput.getAttribute("placeholder");
    }

    public String getReplyMessage() {
        return this.replyMessage.getText();
    }

    public String getButtonName() {
        return this.loginButton.getText();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void clearFields() {
        this.usernameInput.clear();
        this.passwordInput.clear();
    }


    // Dashboard methods

    public String getDashTitle() {
        return this.dashboardTitle.getText();
    }

    public String getDashWelcome() {
        return this.dashboardWelcome.getText();
    }


}
