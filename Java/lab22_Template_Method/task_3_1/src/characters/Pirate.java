package characters;

/**
 * Пірат
 */
public class Pirate extends GameCharacter {

    /**
     * Виявити ворога - для пірата
     */
    @Override
    protected void spotEnemy() {
        System.out.println("Arrr! Enemy ahoy!");
    }

    /**
     * Отримати накази - для пірата
     */
    @Override
    protected void receiveOrders() {
        System.out.println("The captain roared an order:");
    }

    /**
     * Підняти зброю для захисту - оголити меч
     */
    @Override
    public void pickUpWeapon() {
        System.out.println("Pick up sword!");
    }

    /**
     * Захист
     */
    @Override
    public void defenseAction() {
        System.out.println("Defend with sword!");
    }

    /**
     * Повернення героя в безпечне місце
     */
    @Override
    public void moveToSafety() {
        System.out.println("Return to the ship!");
    }
}
