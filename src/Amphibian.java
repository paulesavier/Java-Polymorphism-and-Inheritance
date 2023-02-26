public abstract class Amphibian {
    protected String name;
    abstract void move();

    public Amphibian(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void breathe() {
        System.out.println("Я " + name + ", и я умею дышать как под водой, так и на суше.");
    }
}
