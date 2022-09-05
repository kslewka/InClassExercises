public class InClassExercises {
        public static void main(String[] args) {
            upperHex();
            bottomHex();
            line();
            upperHex();
            stop();
            bottomHex();
            upperHex();
            line();

            nums();

            top();
            upper();
            lower();
            top();

            line(77);
            box(12, 4);
        }

        public static void line(int num) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        public static void box(int width, int height) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == height-1 || j == 0 || j == width-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void top() {
            System.out.println("#================#");
        }

        public static void upper() {
            for (int i = 0; i < 4; i++) {
                System.out.print("|");
                for (int space = 6; space > i*2; space--) {
                    System.out.print(" ");
                }
                System.out.print("<>");
                for (int dot = 0; dot < (i*4); dot++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int space = 6; space > i*2; space--) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }

        public static void lower() {
            for (int i = 3; i >= 0; i--) {
                System.out.print("|");
                for (int space = 6; space > i*2; space--) {
                    System.out.print(" ");
                }
                System.out.print("<>");
                for (int dot = 0; dot < i*4; dot++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int space = 6; space > i*2; space--) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }

        public static void nums() {
            for (int line = 1; line <= 5; line++) { //modified code on slide 27
                for (int j = 1; j <= (-1 * line + 5); j++) {
                    System.out.print(".");
                }
                System.out.print(line);
                for (int k = 1; k < line; k++) {
                    System.out.print(".");
                }
                System.out.println();
            }
        }

        public static void upperHex() {
            System.out.println("  ----------  ");
            System.out.println(" /          \\ ");
            System.out.println("/            \\");
        }

        public static void bottomHex() {
            System.out.println("\\            /");
            System.out.println(" \\          / ");
            System.out.println("  ----------  ");
        }

        public static void line() {
            System.out.println("______________");
        }

        public static void stop() {
            System.out.println("|    STOP    |");

        }

}
