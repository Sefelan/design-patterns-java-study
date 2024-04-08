package strictencapsulation;


public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker();

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };
        caretaker.push(triangle.save());
        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    caretaker.push(triangle.save());
                    break;
                case "b":
                    triangle.setB(values[index]);
                    caretaker.push(triangle.save());
                    break;
                case "c":
                    triangle.setC(values[index]);
                    caretaker.push(triangle.save());
                    break;
            }
            System.out.println(triangle);
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("\n=========TESTING=========\n");
        System.out.println(triangle);
        caretaker.undo();
        System.out.println(triangle);
        caretaker.undo();
        System.out.println(triangle);
        caretaker.redo();
        System.out.println(triangle);
        caretaker.push(triangle.save());
        triangle.setA(5);
        System.out.println(triangle);
        caretaker.redo();
        System.out.println(triangle);

//        triangle.restoreMaxSquare();
//        System.out.println("\nMax volume = "+ triangle.square());
//        System.out.println("for " + triangle);

    }

}
