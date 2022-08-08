package Task3part2;

public class Jellybean extends Sweets{
    private String fruit;

    public Jellybean(){};

    public Jellybean(String name, double weight, double price, String fruit) {
        super(name, weight, price);
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return super.toString() + ", фруктовый вкус = " + fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
