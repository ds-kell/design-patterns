package builder_pattern;

import builder_pattern.enum_type.BreadType;
import builder_pattern.enum_type.OrderType;
import builder_pattern.enum_type.SauceType;
import builder_pattern.enum_type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();

}