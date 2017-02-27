public class greeting {
        public static void main(String[] args) {
                int time = Integer.parseInt(args[0]);
                greet(time);
        }

        public static void greet(int t) {
                if(t > 2 && t < 12) {
                        System.out.print("Good morning");
                }

                else if(t >= 12 && t < 15) {
                        System.out.print("Good afternoon");
                }

                else if(t >= 15 && t < 21) {
                        System.out.print("Good evening");
                }

                else
                        System.out.print("Good night");
        }
}
