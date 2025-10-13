public class Linezad2 {
        private Pointzad1 start;
        private Pointzad1 end;

        // Конструкторы
        public Linezad2(Pointzad1 start, Pointzad1 end) {
            this.start = start;
            this.end = end;
        }

        public Linezad2(int startX, int startY, int endX, int endY) {
            this.start = new Pointzad1(startX, startY);
            this.end = new Pointzad1(endX, endY);
        }

        // Геттеры и сеттеры
        public Pointzad1 getStart() {
            return start;
        }

        public void setStart(Pointzad1 start) {
            this.start = start;
        }

        public Pointzad1 getEnd() {
            return end;
        }

        public void setEnd(Pointzad1 end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Линия от " + start + " до " + end;
        }
    }


