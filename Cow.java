public class Cow implements Animal {
    int legs;
    String sound;
    String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Cow(this.legs, this.sound, this.food);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}
