public class AlienVerifierDemo {

    public static void main(String[] args) {

        System.out.println(createAlien("dfgfdghfd", 192f, 100f));
    }

    public static Alien createAlien(String name, Float height, Float weight){
        if (height == null || weight == null || name == null)
            throw new IllegalArgumentException("Dont stuff null into this method!!!");
        if (height < 30)
            throw new IllegalArgumentException("Aliens must be at least 30 cm high");
        if (weight < 20)
            throw new IllegalArgumentException("Aliens must weigh at least 20 kg");
        if (name.isBlank()){
            throw new IllegalArgumentException("The string is empty");
        }
        return new Alien(name, height, weight);

    }
}
