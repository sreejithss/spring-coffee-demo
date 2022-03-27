package com.sebastian_daschner.coffee.frontend;

import com.sebastian_daschner.coffee.frontend.views.IndexView;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexUiIT {

    private final CoffeeShopUI coffeeShop = new CoffeeShopUI();

    @BeforeEach
    void setUp() {
        coffeeShop.init();
    }

    @Test
    @AllureId("52")
    void check_headline() {
        IndexView index = coffeeShop.index();
        index.assertPageHeader("Welcome!");
    }

}
