public abstract class Product {
    private String name;
    private int count;
    private int price;

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price += price;
    }

    public void setCount(Integer count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return name;
    }
}
