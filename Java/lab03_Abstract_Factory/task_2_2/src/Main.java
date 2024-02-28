import transport.*;
import volvo.TransportFactoryVolvo;
import skoda.TransportFactorySkoda;
import hyundai.TransportFactoryHyundai;

import java.util.ArrayList;

public class Main {
    public static String VOLVO_FACTORY = "VOLVO";
    public static String SKODA_FACTORY = "SKODA";
    public static String HYUDAI_FACTORY = "HYUDAI";

    public static void main(String[] args) {

        String currentFactory = VOLVO_FACTORY;
        TransportFactory TF;

        if (currentFactory.equals(VOLVO_FACTORY)) {
            TF = new TransportFactoryVolvo();
        } else if (currentFactory.equals(SKODA_FACTORY)) {
            TF = new TransportFactorySkoda();
        } else {
            TF = new TransportFactoryHyundai();
        }

        System.out.println("We are testing " + currentFactory + " factory!");

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Tram> trams = new ArrayList<>();
        ArrayList<TrolleyBus> trolleybuses = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        for (int i = 0; i < A; i++) {
            buses.add(TF.createBus());
        }

        for (int i = 0; i < T; i++) {
            trams.add(TF.createTram());
        }

        for (int i = 0; i < Tr; i++) {
            trolleybuses.add(TF.createTrolleybus());
        }

        int finalCostContract = 0;
        for (Bus bus : buses) {
            bus.goByWay();
            finalCostContract += bus.getCost() + bus.getUsageCost() * N;
        }

        for (Tram tram : trams) {
            tram.goByRails();
            finalCostContract += tram.getCost() + tram.getUsageCost() * N;
        }

        for (TrolleyBus trolleybus : trolleybuses) {
            trolleybus.goByContactNetwork();
            finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * N;
        }

        System.out.println(finalCostContract);
    }
}

