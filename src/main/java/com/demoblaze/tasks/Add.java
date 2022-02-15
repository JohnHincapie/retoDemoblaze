package com.demoblaze.tasks;




import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static com.demoblaze.ui.ProductDetailsPage.*;



public class Add implements Task {
    @Managed
    WebDriver driver;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADD_BUTTON));
        BrowseTheWeb.as(actor).getAlert().accept();
        actor.attemptsTo(Click.on(CART_BUTTON));
    }

    public static Add theProductToCart() {
        return Tasks.instrumented(Add.class);
    }
}
