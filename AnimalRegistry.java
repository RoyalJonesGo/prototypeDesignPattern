public class AnimalRegistry{
    private Animal sheepPrototype;
    private Animal cowPrototype;
    private Animal colorPrototype;

    public AnimalRegistry(){
        sheepPrototype = new Sheep(4, "Baa!", "Grass", "Sheep");
        cowPrototype = new Cow(4, "Moo!", "Grass");
        colorPrototype = new Color(0, "None", "None", "White");
    }
    public Animal createSheep(String name){
        Sheep newSheep = (Sheep) sheepPrototype.clone();
        newSheep.name = name;
        return newSheep;
    }
    public Animal createCow(){
        return cowPrototype.clone();
    }
    public Animal createColor(String color){
        Color newColor = (Color) colorPrototype.clone();
        newColor.color = color;
        return newColor;
    }
}
