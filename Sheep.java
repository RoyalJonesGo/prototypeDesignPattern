public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }
    public String getName() {
        return name;
    }

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.legs, this.sound, this.food, this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}
