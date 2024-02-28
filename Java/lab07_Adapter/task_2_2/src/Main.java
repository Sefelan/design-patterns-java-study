import phones.*;

public class Main {


    public static void main(String[] args) {

        HtcOneM8 htc = new HtcOneM8();
        Charger charger = new Charger(5.0f, 1.0f);

//        System.out.println("\n============= MicroUsb ==============\n");
//        System.out.printf("Current power status = %s%n", htc.getChargingPercent());
//        htc.charge(20);
//        htc.pluginCharger(charger);
//        htc.charge(20);
//        htc.unplugCharger();
//        System.out.printf("Current power status = %s%n", htc.getChargingPercent());


        SamsungGalaxyS24Ultra samsung = new SamsungGalaxyS24Ultra();
//        FastCharger fastCharger = new FastCharger(18);
//
//        System.out.println("\n============= Type-C ==============\n");
//        printBatteryStatus(samsung);
//        samsung.makeCall();
//        samsung.charge(10);
//        samsung.pluginCharger(fastCharger);
//        samsung.charge(30);
//        samsung.unplugCharger();
//        printBatteryStatus(samsung);
//        samsung.makeCall();
//        printBatteryStatus(samsung);


//        TODO: implement and use adapter USB => Type-C
//        samsung.pluginCharger(charger);  // Fixme: implement adapter

        System.out.println("\n============== Charging throughout adapter ==============\n");
//        ChargerTypeC adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(charger); // адаптер через агрегацію
        ChargerTypeC adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeCInheritance(5.0f, 1.0f); // адаптер через наслідування
        samsung.pluginCharger(adapterMicroUsbToTypeC);
        printBatteryStatus(samsung);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);



    }

    private static void printBatteryStatus(SamsungGalaxyS24Ultra phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}
