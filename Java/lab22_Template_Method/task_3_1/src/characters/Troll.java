package characters;

/**
 * Троль
 */
public class Troll extends GameCharacter {

    /**
     * Виявити ворога для троля
     */
    @Override
    protected void spotEnemy() {
        System.out.println("Grrr! Enemy spotted in the woods!");
    }

    /**
     * Отримати накази для троля
     */
    @Override
    protected void receiveOrders() {
        System.out.println("The tribe's chief grunted a command:");
    }


    /**
     * Підняти булаву
     */
    @Override
    public void pickUpWeapon() {
        System.out.println("Pick up club!");
    }

    /**
     * Захищатися за допомогою булави
     */
    @Override
    public void defenseAction() {
        System.out.println("Defend with club!");
    }

    /**
     * Повернутися в безпечне місце в горах
     */
    @Override
    public void moveToSafety() {
        System.out.println("Return to the mountain!");
    }
}
