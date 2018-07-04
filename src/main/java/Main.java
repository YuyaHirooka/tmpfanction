import factory.Factory;
import factory.Impl.FoodFactory;
import product.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new FoodFactory();

        Product beef = factory.create("beef");

        System.out.println("在庫個数：" + beef.getStockNumber());
        beef.consume();
        System.out.println("在庫個数：" + beef.getStockNumber());

    }
}
