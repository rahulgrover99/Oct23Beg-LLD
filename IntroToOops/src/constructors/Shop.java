package constructors;

public class Shop {
    Pen pen;
    String name;

    Shop(Pen pen, String name) {
        this.pen = pen;
        this.name = name;
    }

    Shop(Shop otherShop) {
        this.pen = otherShop.pen;
        this.name = otherShop.name;
    }
}
