public abstract class Creator {
    public void someOperation(){
        Product p = createProduct();
        p.doSomething();
    }
    public Product createProduct(){
        return null;
    }
}
