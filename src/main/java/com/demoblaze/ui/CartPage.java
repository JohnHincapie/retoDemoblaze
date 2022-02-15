package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PRODUCT_NAME = Target.the("Add to cart").locatedBy("//tbody[@id='tbodyid']//td[text()='Samsung galaxy s6']");
}
