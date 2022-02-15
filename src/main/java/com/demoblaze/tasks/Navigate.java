package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Navigate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.demoblaze.com/"));
    }

    public static Navigate toTheEcommerce() {
        return Tasks.instrumented(Navigate.class);
    }

}
