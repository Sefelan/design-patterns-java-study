package innerclasses;

import java.util.Stack;

public class TriangleCaretaker {

    private final Triangle triangle;
    private final Stack<Triangle.Memento> undoHistory;
    private final Stack<Triangle.Memento> redoHistory;

    private Triangle.Memento maxSquareMemento;
    private float maxSquare = 0;

    public TriangleCaretaker(Triangle triangle) {
        this.triangle = triangle;
        undoHistory = new Stack<>();
        redoHistory = new Stack<>();
        checkMaxSquare();
    }

    public void setA(float a) {
        undoHistory.push(triangle.save());
        redoHistory.clear();
        triangle.setA(a);
        checkMaxSquare();
    }

    public void setB(float b) {
        undoHistory.push(triangle.save());
        redoHistory.clear();
        triangle.setB(b);
        checkMaxSquare();
    }

    public void setC(float c) {
        undoHistory.push(triangle.save());
        redoHistory.clear();
        triangle.setC(c);
        checkMaxSquare();
    }

    public void undo(){
        if (!undoHistory.empty()){
            redoHistory.push(triangle.save());
            triangle.restore(undoHistory.pop());
        }
    }

    public void redo(){
        if (!redoHistory.empty()){
            undoHistory.push(triangle.save());
            triangle.restore(redoHistory.pop());
        }
    }

    public float perimeter() {
        return triangle.perimeter();
    }

    public float square() {
        return triangle.square();
    }

    private void checkMaxSquare() {
        if (square() > maxSquare) {
            maxSquare = square();
            maxSquareMemento = triangle.save();
        }
    }

    public void restoreMaxSquare() {
        triangle.restore(maxSquareMemento);
    }

    @Override
    public String toString() {
        return triangle.toString();
    }
}