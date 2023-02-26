public class Caecilian extends Amphibian {
    @Override
    void move() {
        System.out.println("Я червяга. Я умею плавать и ползать.");
    }

    Caecilian() {
        super("червяга");
    }
}
