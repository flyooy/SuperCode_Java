/**
 * SuperHero
 */
public class SuperHero {

    private String name;
    private int powerLevel;
    private int speed;
    private Category category;
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SuperHero(String name, int powerLevel, int speed, Category category) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.speed = speed;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SuperHero [name=" + name + ", powerLevel=" + powerLevel + ", speed=" + speed + ", category=" + category
                + "]";
    }

   
    
}