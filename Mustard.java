//Принцип единственной ответственности - каждый делает только то, для чего он предназначен
public class Mustard extends Product implements Food{
    //Правило Magic: не используй числа и строки напрямую в коде
    private final String name = "Mustard";
    private final int price = 2;
    private  int count;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("It may be eaten!");
    }

    @Override
    public String toString() {
        return  "name='" + name + ", price=" + price;
    }
}
