//Принцип единственной ответственности - каждый делает только то, для чего он предназначен
//Принцип сегрегации (разделения) интерфейса - разделяй большие интерфейсы на маленькие
//Dependency Inversion Principle - не зависим от их общей функциональности
public class Milk extends Product implements Drink, Food {
    //Правило Magic: не используй числа и строки напрямую в коде
    private final String name = "Milk";
    private final int price = 1;
    private int count;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void drink() {
        System.out.println("It may be drank!");
    }

    @Override
    public void eat() {
        System.out.println("It may be eaten!");
    }

    @Override
    public String toString() {
        return "name='" + name + ", price=" + price;
    }
}
