public class Linezad4 {
    private Pointzad4 start;
    private Pointzad4 end;

    public Linezad4(Pointzad4 start, Pointzad4 end) {
        this.start = start;
        this.end = end;
    }

    public Linezad4(int startX, int startY, int endX, int endY) {
        this.start = new Pointzad4(startX, startY);
        this.end = new Pointzad4(endX, endY);
    }

    public Pointzad4 getStart() {
        return start;
    }

    public Pointzad4 getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
