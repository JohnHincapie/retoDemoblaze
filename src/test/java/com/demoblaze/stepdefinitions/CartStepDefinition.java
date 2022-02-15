package com.demoblaze.stepdefinitions;

import com.demoblaze.questions.IsAdded;
import com.demoblaze.tasks.Add;
import com.demoblaze.tasks.Navigate;
import com.demoblaze.tasks.Select;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CartStepDefinition {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened the ecommerce")
    public void thatUserHasOpenedTheEcommerce(String actor) {
        theActorCalled(actor).wasAbleTo(Navigate.toTheEcommerce());
    }

    @When("he selects the product from the following section")
    public void heSelectsTheProductFromTheFollowingSection(DataTable data) {
        theActorInTheSpotlight().attemptsTo(Select.theProductWith(data));
    }

    @When("he adds the product to the cart")
    public void heAddsTheProductToTheCart() {
        theActorInTheSpotlight().attemptsTo(Add.theProductToCart());
    }

    @Then("he should see the added product in the cart")
    public void heShouldSeeTheAddedProductInTheCart() {
        theActorInTheSpotlight().should(seeThat(IsAdded.theProduct()));
    }
}
