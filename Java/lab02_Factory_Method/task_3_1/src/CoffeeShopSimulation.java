import CoffeShopLib.*;

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        CreatorAmericano creatorAmericano = new CreatorAmericano();
        CreatorCappuccino creatorCappuccino = new CreatorCappuccino();
        CreatorEspresso creatorEspresso = new CreatorEspresso();
        CreatorLatte creatorLatte = new CreatorLatte();


        creatorAmericano.setPrices(20.0f, 25.0f);
        creatorCappuccino.setPrices(22.0f, 45.0f);
        creatorEspresso.setPrices(18.0f, 20.0f);
        creatorLatte.setPrices(25.0f, 50.0f);

        CreatorBanana creatorBanana = new CreatorBanana();
        creatorBanana.setPrices(15.0f,1.0f);

        CoffeeShop coffeeShop = new CoffeeShop();

        coffeeShop.sellProduct(creatorEspresso);
        coffeeShop.sellProduct(creatorBanana);
        coffeeShop.sellProduct(creatorLatte);
        coffeeShop.sellProduct(creatorCappuccino);
        coffeeShop.sellProduct(creatorLatte);
        coffeeShop.sellProduct(creatorAmericano);
        coffeeShop.sellProduct(creatorEspresso);
        coffeeShop.sellProduct(creatorLatte);
        coffeeShop.sellProduct(creatorAmericano);
        coffeeShop.sellProduct(creatorEspresso);
        coffeeShop.sellProduct(creatorBanana);
        coffeeShop.sellProduct(creatorAmericano);


        coffeeShop.getTotal();
    }
}
