public class Alien {
    private final String name;
    private final Float height;
    private final Float weight;

    public Alien(String name, Float height, Float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
