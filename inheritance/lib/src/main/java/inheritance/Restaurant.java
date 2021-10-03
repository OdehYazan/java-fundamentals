package inheritance;

public class Restaurant {
    private String name;
    private int starts;
    private String price;

    public Restaurant(String name, int starts, String price) {
        this.name = name;
        this.starts = starts;
        this.price = price;
    }

    @Override
    public String toString() {

        return "Restaurant{" +
                "name='" + name + '\'' +
                ", starts=" + starts +
                ", price='" + price + '\'' +
                '}';
    }
}
