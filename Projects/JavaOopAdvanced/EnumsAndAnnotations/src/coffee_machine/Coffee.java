package coffee_machine;

import coffee_machine.enums.CoffeeSize;
import coffee_machine.enums.CoffeeType;

public class Coffee {

    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }

    public int getPrice() {
        return this.size.getPrice();
    }

    @Override
    public String toString() {
        return String.format("\"%s %s\" sold", this.size, this.type);
    }
}
