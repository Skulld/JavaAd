package Task3part2;

public class Candy extends Sweets{
    private String glaze;

    public Candy(){};

    public Candy(String name, double weight, double price, String glaze) {
        super(name, weight, price);
        this.glaze = glaze;
    }

    public String getGlaze() {
        return glaze;
    }

    public void setGlaze(String glaze) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие глазури = " + glaze;
    }
}
