package wild_farm.abstract_classes;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    public Mammal(String name, String type, double weight, int foodEaten) {
        super(name, type, weight, foodEaten);
        this.setLivingRegion(livingRegion);
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                super.getType(),
                super.getName(),
                super.getName(),
                df.format(super.getWeight()),
                this.getLivingRegion(),
                super.getFoodEaten());
    }
}
