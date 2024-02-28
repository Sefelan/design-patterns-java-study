public class ConcreteCreator1 extends Creator {
    @Override
    public Product createProduct() {
        super.createProduct();
        return new Product1();
    }
}
