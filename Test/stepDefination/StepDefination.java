package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
    
    @Given("^To calculate the arthemitic operations$")
    public void to_calculate_the_arthemitic_operations()  {
        System.out.println("To calculate arthemitic operations of given integers");
       
    }

    @When("^Take any two non negative integers$")
    public void take_any_two_non_negative_integers()  {
        
        int a; int b;
     
    }

    @Then("^calculate sum of int(\\d+), int(\\d+)$")
    public void calculate_sum_of_int_int(int arg1, int arg2)  {
        int arg3=arg1+arg2;
       
    }

    @Then("^calculate minus of int(\\d+), int(\\d+)$")
    public void calculate_minus_of_int_int(int arg1, int arg2)  {
       
    }

    @Then("^calculate into of int(\\d+), int(\\d+)$")
    public void calculate_into_of_int_int(int arg1, int arg2)  {
        
    }

    @Then("^calculate divided of int(\\d+), int(\\d+)$")
    public void calculate_divided_of_int_int(int arg1, int arg2)  {
        
    }
    
    @Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_preconditionasfasd() throws Throwable {
        System.out.println("Case Passed");

    }


}
