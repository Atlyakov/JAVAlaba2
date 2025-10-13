public class Studentzad3 {
    private String name;
    private int[] grades;

    // Конструкторы
    public Studentzad3(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public Studentzad3(String name) {
        this.name = name;
        this.grades = new int[0];
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Метод для копирования оценок без ссылки на массив
    public int[] copyGrades() {
        int[] copy = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            copy[i] = grades[i];
        }
        return copy;
    }

    // Текстовое представление
    @Override
    public String toString() {
        String result = name + ": [";
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
            if (i < grades.length - 1) result += ", ";
        }
        return result + "]";
    }
}
