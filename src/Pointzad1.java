import java.util.Scanner;

public class Pointzad1 {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;

    // Конструкторы
    public Pointzad1(){
        this.x = 0;
        this.y = 0;
    }

    public Pointzad1(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Геттеры, сеттеры
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }

}
