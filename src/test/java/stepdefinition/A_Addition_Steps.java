package stepdefinition;

import java.util.List;
import java.util.Map;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Addition_Steps
{   
	int a , b , sum;
	
    @Given("I have two numbers as {string} & {string}")
	public void i_have_two_numbers_as(String num1, String num2) 
	{
	    a = Integer.parseInt(num1);                                
	    b = Integer.parseInt(num2);
	}
    
    @Given("I have two numbers as below List")
	public void i_have_two_numbers_as_below_List(List<String> numbers) 
	{
	    a = Integer.parseInt(numbers.get(0));                                
	    b = Integer.parseInt(numbers.get(1));
	}
    
    @Given("I have two numbers as below Map")
	public void i_have_two_numbers_as_below_Map(io.cucumber.datatable.DataTable dataTable) {
	   Map<String,String> data=dataTable.asMap(String.class, String.class);
	   a= Integer.parseInt(data.get("num2"));
		b= Integer.parseInt(data.get("num1"));
	   
	}
  
    

    @When("I do Addition")
	public void i_do_addition()
	{
	    sum = a+b;                                                 
	}
	
	@Then("Result should display in console")
    public void result_should_display_in_console() 
	{
	    System.out.println("Sum is: " + sum);                  
	}

}
