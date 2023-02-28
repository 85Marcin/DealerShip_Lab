package dealershipManagment.CarComponents;

public abstract class CarComponent {

    private double price;

    public CarComponent(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
