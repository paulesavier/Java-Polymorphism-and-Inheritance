public class Zookeeper {

    public void showAmphibian(Amphibian amphibian) {
        System.out.println("Я смотритель зоопарка, и сейчас я покажу вам наших амфибий. Это " + amphibian.getName() + ".");
        amphibian.move();
        amphibian.breathe();
    }
}
