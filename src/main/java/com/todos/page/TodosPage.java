package com.todos.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodosPage extends BasePage {

	public TodosPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputText;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Addopter de bonnes pratiques de test']")
	public static WebElement todosText;

	@FindBy(how = How.XPATH, using = "//input[@class='toggle']")
	public static WebElement checkBoxTodos;

	public void submitTodo (String todo) {
		inputText.sendKeys(todo);	
		inputText.sendKeys(Keys.ENTER);
	}
	//Verify using is displayed
	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;

	}

	public String checkElementContains(WebElement element) {
		String fieldTodos = element.getText();
		return fieldTodos;
	}
	
	public Boolean isCheckBoxSelected(WebElement element) {
		Boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;

	} 
	
}
