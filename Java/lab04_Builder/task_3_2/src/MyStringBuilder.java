public class MyStringBuilder {
    private String myString = "";

    public MyStringBuilder add (String otherString) {
        myString += otherString;
        return this;
    }

    public  MyStringBuilder insert(String insertString, int position) {
        if (position < 0 || position > myString.length()) {
            throw new IndexOutOfBoundsException("Position " + position + " is out of bounds");
        }
        String start = myString.substring(0, position);
        String end = myString.substring(position);
        myString =  start + insertString + end;
        return this;
    }

    public String build() {
        return myString;
    }
}

