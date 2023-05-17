package com.sebastian_daschner.coffee.frontend;

import com.sebastian_daschner.UiTest;
import com.sebastian_daschner.coffee.frontend.views.IndexView;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexUiIT {

    private final CoffeeShopUI coffeeShop = new CoffeeShopUI();

    @BeforeEach
    void setUp() {
        coffeeShop.init();
    }

    @Test
    @AllureId("61")
    @UiTest
    @Feature("Frontend")
    @Owner("janedoe")
    void check_headline_message() {
        IndexView index = coffeeShop.index();
        index.assertPageHeader("Welcome!");
    }

}
