package oop;

public class PenDriver {

    public static void main(String[] args) {
        Pen pen = new Pen("Cello", "Blue", 15.00, 10);
        pen.displayPen();
        pen.ink.displayInk();
    }
}
