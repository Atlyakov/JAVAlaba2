public class LenghtLine {
    private Pointzad4 start;
    private Pointzad4 end;

    // Конструктор с точками
    public LenghtLine(Pointzad4 start, Pointzad4 end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор с координатами
    public LenghtLine(int startX, int startY, int endX, int endY) {
        this.start = new Pointzad4(startX, startY);
        this.end = new Pointzad4(endX, endY);
    }

    // Геттеры
    public Pointzad4 getStart() {
        return start;
    }

    public Pointzad4 getEnd() {
        return end;
    }

    // Метод для вычисления длины линии (целое число)
    public int getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        // Используем теорему Пифагора и округляем до целого
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    // Текстовое представление
    @Override
    public String toString() {
        return "Линия от " + start + " до " + end + " (длина: " + getLength() + ")";
    }
}
