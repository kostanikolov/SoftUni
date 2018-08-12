package wild_farm.abstract_classes;

public abstract class Animal {

    private String name;
    private String type;
    private double weight;
    private int foodEaten;

    public abstract void makeSound();

    public abstract void eat(Food food);

    public Animal(String name, String type, double weight, int foodEaten) {
        this.setName(name);
        this.setType(type);
        this.setWeight(weight);
        this.setFoodEaten(foodEaten);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
