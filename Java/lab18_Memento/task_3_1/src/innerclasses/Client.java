package innerclasses;

public class Client {

    public static void main(String[] args) {
        Triangle basicTriangle = new Triangle(3, 3, 3);
        TriangleCaretaker triangle = new TriangleCaretaker(basicTriangle);

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

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }
            System.out.println(triangle);
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("\n=========TESTING=========\n");
        System.out.println(triangle);
        triangle.undo();
        System.out.println(triangle);
        triangle.undo();
        System.out.println(triangle);
        triangle.redo();
        System.out.println(triangle);
        triangle.setA(5);
        System.out.println(triangle);
        triangle.redo();
        System.out.println(triangle);

        triangle.restoreMaxSquare();
        System.out.println("\nMax volume = "+ triangle.square());
        System.out.println("for " + triangle);

    }

}
