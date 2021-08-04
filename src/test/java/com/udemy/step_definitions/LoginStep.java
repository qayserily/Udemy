package com.udemy.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class LoginStep {
    @Given("I navigate to the login page")
    public void ıNavigateToTheLoginPage() {
        System.out.println("I should see userform page");
    }

    @And("I enter the username as admin and password as admin")
    public void ıEnterTheUsernameAsAdminAndPasswordAsAdmin() {
        System.out.println("Navigate Login Page");
    }

    @And("I click login button")
    public void ıClickLoginButton() {
        System.out.println("Enter user name and password");
    }

    @Then("I should see the userform page")
    public void ıShouldSeeTheUserformPage() {
        System.out.println("Click login button");
    }


    @And("I enter the following for Login")
    public void ıEnterTheFollowingForLogin(DataTable table) throws Throwable {

    }
}
