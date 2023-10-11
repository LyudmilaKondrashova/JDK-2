import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int tempInt = rand.nextInt(1, 51);
        for (int i = 0; i < tempInt; i++) {
            Developer developer;
            if (rand.nextBoolean()) {
                developer = new FrontEndDeveloper();
            } else {
                developer = new BackEndDeveloper();
            }
            if (developer instanceof FrontEndDeveloper) {
                ((FrontEndDeveloper) developer).developGUI();
            } else {
                System.out.println("Create GUI is impossible!");
            }
        }
    }

}