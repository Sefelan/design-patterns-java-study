package CoffeShopLib;

abstract public class Creator {
    protected float costPrice;
    protected float salePrice;

    protected abstract Product createProduct();

    public void setPrices(float costPrice,float salePrice){
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }
}
