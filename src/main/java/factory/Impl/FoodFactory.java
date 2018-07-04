package factory.Impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import factory.Factory;
import product.Impl.FoodProduct;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class FoodFactory extends Factory {

    private Config config = ConfigFactory.load();
    private List<Product> products = new ArrayList<Product>();

    @Override
    protected Product createProduct(String name) {
        //例外処理を書きたいよ
        int n = config.getInt(name + ".stock.number");
        return new FoodProduct(name, n);
    }

    @Override
    protected void registerProduct(Product p) {
        products.add(p);
    }
}
