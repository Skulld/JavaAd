package Task3part2;

public class Chocolate extends Sweets {
    private int milk;

    public Chocolate(){};

    public Chocolate(String name, double weight, double price, int milk) {
        super(name, weight, price);
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return super.toString() + ", содержание молока в % = " + milk;
    }
}
