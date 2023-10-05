package constructors;

public class Pen {
    private String name;
    int inkLevel;

    Pen(String name, int inkLevel) {
        this.name = name;
        this.inkLevel = inkLevel;
    }

    // Copy Constructor
    Pen(Pen otherPen) {
        this.name = otherPen.name;
        this.inkLevel = otherPen.inkLevel;
    }
}
