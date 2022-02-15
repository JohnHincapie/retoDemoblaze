package com.demoblaze.questions;

import com.demoblaze.ui.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;


public class IsAdded implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(CartPage.PRODUCT_NAME).hasText(actor.recall("product"));

        return true;
    }

    public static IsAdded theProduct() {
        return new IsAdded();
    }

}
