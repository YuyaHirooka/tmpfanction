package product.Impl;

import product.Product;

public class FoodProduct extends Product {


    private int stockNumber;
    private String name;

    public FoodProduct(String name, int stockNumber) {
        this.stockNumber = stockNumber;
        this.name = name;

    }

    @Override
    public void consume() {
        if (stockNumber > 0) {
            stockNumber--;
            System.out.println(name + "を食べる");
        } else {
            System.out.println(name + "がない!!!!");
        }
    }

    @Override
    public int getStockNumber() {
        return stockNumber;
    }

    @Override
    public String getProductName() {
        return name;
    }
}
