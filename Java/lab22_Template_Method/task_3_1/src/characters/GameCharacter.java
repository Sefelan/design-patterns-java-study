package characters;

public abstract class GameCharacter {
    /**
     * Стратегія захисту та відступу
     */
    public final void defendAgainstAttack() {
        spotEnemy();
        receiveOrders();
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    /**
     * Виявити ворога
     */
    protected void spotEnemy() {
        System.out.println("Enemy spotted!");
    }

    /**
     * Отримати наказ
     */
    protected void receiveOrders() {
        System.out.println("Orders received:");
    }

    /**
     * Підняти зброю для захисту
     */
    abstract protected void pickUpWeapon();

    /**
     * Захист
     */
    abstract protected void defenseAction();

    /**
     * Повернення героя в безпечне місце
     */
    abstract protected void moveToSafety();
}
