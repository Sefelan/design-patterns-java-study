public class Main {
    public static void main(String[] args) {
        String string1 = new MyStringBuilder()
                .add("hello world ")
                .build();

        String string2 = new MyStringBuilder()
                .add("bye Britain ")
                .build();

        String string3 = new MyStringBuilder()
                .add("bad ")
                .build();


        String string4 = new MyStringBuilder()
                .add(string1)
                .insert(string3, 6)
                .build();

        String string5 = new MyStringBuilder()
                .add(string2)
                .insert(string4,0)
                .build();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);
    }
}
