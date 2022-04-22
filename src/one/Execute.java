package one;

public class Execute {
    public static void main(String[] args) {

        Sum sum = new Sum(5, 3);
        System.out.println(sum.sum());
    }

    static class Sum {

        private int x;
        private int y;

        public Sum(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int sum() {
            return x + y;
        }
    }
}

