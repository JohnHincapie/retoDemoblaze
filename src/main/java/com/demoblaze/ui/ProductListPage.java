package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target PRODUCT = Target.the("Name of product").locatedBy("//div[@id='tbodyid']//a[text()='{0}']");
}
