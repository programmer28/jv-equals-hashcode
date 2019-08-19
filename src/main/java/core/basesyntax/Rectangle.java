package core.basesyntax;

/**
 * Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей a и b, а hashCode() был бы согласованным с
 * реализацией equals().
 */
public class Rectangle {
    private Integer a;
    private Integer b;
    private String color;

    public Rectangle(Integer a, Integer b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public String getColor() {
        return color;
    }
}
