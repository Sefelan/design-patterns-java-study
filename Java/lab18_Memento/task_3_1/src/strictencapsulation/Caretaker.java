package strictencapsulation;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> undoHistory;
    private final Stack<Memento> redoHistory;

    public Caretaker() {
        this.undoHistory = new Stack<>();;
        this.redoHistory = new Stack<>();
    }

    public void push(Memento memento) {
        undoHistory.push(memento);
        redoHistory.clear();
    }

    public void undo(){
        if (!undoHistory.empty()){
            final Memento memento = undoHistory.pop();
            redoHistory.push(memento);
            memento.restore();
        }
    }

    public void redo(){
        if (!redoHistory.empty()){
            final Memento memento = redoHistory.pop();
            undoHistory.push(memento);
            memento.restore();
        }
    }

//    private void checkMaxSquare() {
//        if (square() > maxSquare) {
//            maxSquare = square();
//            maxSquareMemento = triangle.save();
//        }
//    }
//
//    public void restoreMaxSquare() {
//        triangle.restore(maxSquareMemento);
//    }

}
