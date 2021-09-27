package homework9.animals;

public abstract class Animal {
    private String food;
    private String location;
    private String name;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;

    }

    public abstract String makeNoise();

    public abstract String eat();

    public void sleep() {
        System.out.println("Animal sleeps");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
