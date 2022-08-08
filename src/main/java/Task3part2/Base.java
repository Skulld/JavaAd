package Task3part2;

public class Base {
    public static void main(String[] args) {
        double totalWgh=0;
        double totalVal=0;
        Chocolate milkchoco = new Chocolate("Молочный",0.1,75.5,65);
        Chocolate darkchoco = new Chocolate("Темный",0.12,88.7,35);
        Jellybean straw = new Jellybean("Ичиго",0.025,10,"Клубника");
        Candy eskimo = new Candy("Эскимо", 0.73, 51,"есть");
        Sweets [] chocoBox = {milkchoco,darkchoco, straw, eskimo};

        for (Sweets item : chocoBox) {
            totalWgh=totalWgh+item.getWeight();
            totalVal=totalVal+item.getPrice();
        }
        System.out.println("Общий вес: "+totalWgh);
        System.out.println("Общий стоимость: "+totalVal);

        for (Sweets item : chocoBox) {
            System.out.println(item.toString());
        }
    }
}

