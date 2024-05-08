package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.page.TodosPage;
import com.todos.utils.Setup;

public class AddTodosTest extends Setup {

	public AddTodosTest() throws IOException {
		super();
	}
	
	TodosPage todoPage;
	
	@Test
	public void iCanAddTodos() throws IOException {
		
		todoPage = new TodosPage();
		
		//verify using is displayed on TodosPage
		boolean fieldTodo = todoPage.isElementDisplayed(TodosPage.inputText);
		Assert.assertTrue(fieldTodo);
		
		todoPage.submitTodo(prop.getProperty("todo1"));
	
		String textTodo = todoPage.checkElementContains(TodosPage.todosText);
		Assert.assertTrue(textTodo.contains(prop.getProperty("todo1")));
		
		boolean checkBox = todoPage.isCheckBoxSelected(TodosPage.checkBoxTodos);
		Assert.assertFalse(checkBox);
	}

}
