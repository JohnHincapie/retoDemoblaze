package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target CATEGORY = Target.the("Name of category").locatedBy("//div[@id='contcont']//a[text()='{0}']");
}
