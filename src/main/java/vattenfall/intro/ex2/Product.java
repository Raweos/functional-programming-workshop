package vattenfall.intro.ex2;

import java.math.BigDecimal;

class Product {
    private final String name;
    private final String category;
    private final BigDecimal price;

    Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getCategory() {
        return category;
    }

    BigDecimal getPrice() {
        return price;
    }
}
