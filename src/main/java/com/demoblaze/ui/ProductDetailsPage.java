package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;


public class ProductDetailsPage {
    public static final Target ADD_BUTTON = Target.the("Add to cart").locatedBy("//div[@id='tbodyid']//a[text()='Add to cart']");
    public static final Target CART_BUTTON = Target.the("Add to cart").locatedBy("//a[text()='Cart']");
}
