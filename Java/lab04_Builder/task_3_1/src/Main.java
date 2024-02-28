public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        Car corsa = carDirector.createCorsa();
        Car rav4 = carDirector.createRAV4();
        Car teslaM3 = carDirector.createTeslaM3();

        System.out.println(corsa);
        System.out.println(rav4);
        System.out.println(teslaM3);
    }
}
