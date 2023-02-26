import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        Amphibian axolotl = new Axolotl();
        Amphibian caecilian = new Caecilian();
        Zookeeper zookeeper = new Zookeeper();

        zookeeper.showAmphibian(frog);
        zookeeper.showAmphibian(axolotl);
        zookeeper.showAmphibian(caecilian);
    }
}