package basics;

public class Main {
        public static void main(String[] args) {
            String greeting = "Welcome to my Java program.";
            System.out.println(greeting);

            int x = 7;
            float f = 42.3f;
            double d = 42.3;

            // execute the function called "loopTo" and pass 10 as a parameter
            loopTo(10);

            int four = 4;
            int result = multiplyByTwo(four);
            System.out.println(four + " doubled is " + result);
        }

        // Functions that return nothing have a return type of "void"
        public static void loopTo(int max) {
            for (int i = 0; i < max; i++) {
                System.out.println("Loop #" + i);
            }
        }

        // This function has a return type of "int"
        public static int multiplyByTwo(int n) {
            return n * 2;
        }

        public static void pluralize(String word, int value) {
            if (value < 0) {
                return word;
            } else {
                return word + "s";
            }
        }

        public static void flipNHeads(int n) {
            for (int i = 0;i < n; i++) {
                if (Math.random() < 0.5) {
                    System.out.println("tails")
                } else {
                    System.out.println("heads";)
                }
            }
        }
    }

