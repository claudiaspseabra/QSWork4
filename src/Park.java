import java.time.LocalTime;

/**
 * Class Park to describe the park attributes such as price, discount, capacity and time
 */

public class Park {
    private int time;
    private double price;
    private int capacity;
    private double discount;
    private int default_time = 15;
    private double default_price = 0.1;
    private int default_capacity = 500;
    private double default_discount = 0.1;



    /**
     * Constructor with parameters
     */

    public Park(int time, double price, int capacity, double discount) {
        this.time = time;
        this.price = price;
        this.capacity = capacity;
        this.discount = discount;
    }

    /**
     * Empty constructor
     */

    public Park(){
        this.time = default_time;
        this.price = default_price;
        this.capacity = default_capacity;
        this.discount = default_discount;
    }

    /**
     * Getters and setters methods
     */


    public int getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



    /**
     * ToString method
     */

    @Override
    public String toString() {
        return "Park{" +
                "time=" + time +
                ", price=" + price +
                ", capacity=" + capacity +
                ", discount=" + discount +
                '}';
    }
}