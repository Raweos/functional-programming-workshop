package vattenfall.intro.ex2;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ProductFilterSpec {

    @Test
    void shouldAcceptProductWithGivenCategoryAndPrice10() {
        assertTrue(ProductFilter.checkCategory.apply(new Product("Cauliflower", "Food", BigDecimal.TEN), "Food"));
    }
}