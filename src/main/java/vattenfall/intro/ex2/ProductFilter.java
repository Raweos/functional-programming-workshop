package vattenfall.intro.ex2;

import java.math.BigDecimal;
import java.util.function.BiFunction;

class ProductFilter {
    static BiFunction<Product, String, Boolean> checkCategory = (product, s) -> false;

}
