public class Pointzad4 {
    private int x;
    private int y;

    // Единственный конструктор - требует обе координаты
    public Pointzad4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Текстовое представление
    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }
}
