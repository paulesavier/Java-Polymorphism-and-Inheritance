public class Frog extends Amphibian {

    @Override
    void move() {
        System.out.println("Я лягушка, и я передвигаюсь прыжками.");
    }

    Frog() {
        super("лягушка");
    }
}
