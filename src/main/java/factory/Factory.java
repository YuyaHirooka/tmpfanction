package factory;

import product.Product;

public abstract class Factory {

    private Product p;

    //共通の処理である、作成、登録はすべてのプロダクトで行う。そのためスーパークラスで定義
    //定義されている抽象クラスを呼び出すことで、具体的にな処理はサブクラスに任せる。
    public Product create(String name) {
        //作成
        this.p = createProduct(name);

        //登録
        registerProduct(p);

        return p;
    }

    protected abstract Product createProduct(String name);
    protected abstract void registerProduct(Product p);
}
