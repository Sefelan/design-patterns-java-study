import coffee.*;
import krups.CoffeeFactoryKrups;
import philips.CoffeeFactoryPhilips;
import siemens.CoffeeFactorySiemens;

import java.util.ArrayList;

public class Main {
    public static String KRUPS_COFFEE = "KRUPS";
    public static String PHILIPS_COFFEE = "PHILIPS";
    public static String SIEMENS_COFFEE = "SIEMENS";

    public static void main(String[] args) {

        String currentCoffeeMachineManufacturer = PHILIPS_COFFEE;
        CoffeeFactory CF;
        int investmentCost;

        if (currentCoffeeMachineManufacturer.equals(KRUPS_COFFEE)) {
            CF = new CoffeeFactoryKrups();
            investmentCost = 150_000;

        } else if (currentCoffeeMachineManufacturer.equals(PHILIPS_COFFEE)) {
            CF = new CoffeeFactoryPhilips();
            investmentCost = 100_000;
        } else {
            CF = new CoffeeFactorySiemens();
            investmentCost = 120_000;
        }

        System.out.println("We are testing " + currentCoffeeMachineManufacturer + " coffee machine!");

        ArrayList<Americano> americanos = new ArrayList<>();
        ArrayList<Cappuccino> cappuccinos = new ArrayList<>();
        ArrayList<Espresso> espressos = new ArrayList<>();
        ArrayList<Latte> lattes = new ArrayList<>();

        Americano americano;
        Cappuccino cappuccino;
        Espresso espresso;
        Latte latte;

        final int A = 8;            // продаємо A американо в день
        final int C = 13;           // продаємо C капучино в день
        final int E = 9;           // продаємо E Еспресо в день
        final int L = 5;      // продаємо L Лате в день

        int earnings = -investmentCost;
        int days = 0;
        while (investmentCost > earnings) {
            days = days + 1;
            System.out.println("\nday " + days + "\n");

            for (int i = 0; i < A; i++) {
                americano = CF.createAmericano();
                americanos.add(americano);
                earnings += americano.getProfit();
                americano.flashTheCash();
            }

            for (int i = 0; i < C; i++) {
                cappuccino = CF.createCappuccino();
                cappuccinos.add(cappuccino);
                earnings += cappuccino.getProfit();
                cappuccino.flashTheCash();
            }

            for (int i = 0; i < E; i++) {
                espresso = CF.createEspresso();
                espressos.add(espresso);
                earnings += espresso.getProfit();
                espresso.flashTheCash();
            }

            for (int i = 0; i < L; i++) {
                latte = CF.createlatte();
                lattes.add(latte);
                earnings += latte.getProfit();
                latte.flashTheCash();
                if (days % 4 == 0) {
                    System.out.println("Got tipped " + lattes.size());
                    earnings += lattes.size();
                }
            }
        }

        System.out.println("\nWe spent " + investmentCost + " on " + currentCoffeeMachineManufacturer);
        System.out.println("We broke even in " + days + " days");
        System.out.println("In " + days + " days, we earned " + earnings);
    }
}
