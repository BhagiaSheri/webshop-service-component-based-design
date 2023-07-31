package webshop.product.domain;

public class Stock {
    private int noInStock;
    private String locationCode;

    public Stock(int noInStock, String locationCode) {
        this.noInStock = noInStock;
        this.locationCode = locationCode;
    }

    public int getNoInStock() {
        return noInStock;
    }

    public String getLocationCode() {
        return locationCode;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "noInStock=" + noInStock +
                ", locationCode='" + locationCode + '\'' +
                '}';
    }
}
