package constructors;

public class Main {
    public static void main(String[] args) {
        Pen pilot = new Pen("Pilot", 10);
        System.out.println(pilot.inkLevel);

        // Pen pilotCopy = new Pen(pilot.name, pilot.inkLevel);

        Pen pilotCopy = new Pen(pilot);
        pilotCopy.inkLevel--;

        System.out.println(pilotCopy.inkLevel);

        Shop shop1 = new Shop(pilot, "ABC");

        Shop shop2 = new Shop(shop1);

        System.out.println(shop1);

        shop1.pen.inkLevel--;
        System.out.println(shop2);

    }
}
