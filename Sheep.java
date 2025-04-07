public class Sheep implements Animal {
    int legs;
    String sound;
    String food;
    String name;
    
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
