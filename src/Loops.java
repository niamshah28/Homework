

public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();

    }//main method

    public Loops() {
        nestedLoop();        //call counting methods in here
    }

    public void countUp() {
        for (int x = 1; x <= 5; x = x + 1) {
            System.out.println(x);
        }
        System.out.println();
    }

    public void countByThrees() {
        System.out.println("Count By Threes");
        for (int x = 3; x <= 15; x += 3) {
            System.out.print(x);
        }
        System.out.println("");
    }

    public void countDown() {
        System.out.println("Count Down");
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }
        System.out.println("Happy New Year!!!!! ;)");

    }

    public void nestedLoop() {
        for (int y = 0; y < 6; y = y + 1) {
            for (int x = 0; x < y; x = x + 1) {
                System.out.print(y);

            }
            System.out.println("\n");

        }

    }
}
