public class TestAnimal{
    public static void main(String[] args){
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Sheepie");
        Animal cow1 = registry.createCow();
        Animal color1 = registry.createColor("Black");

        sheep1.makeSound();
        System.out.println("Sheep name: " + ((Sheep) sheep1).name);

        cow1.makeSound();
        System.out.println("Cow type: " + cow1.getType());

        color1.makeSound();
        System.out.println("Color: " + ((Color) color1).color);
    }
}
