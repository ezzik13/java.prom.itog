package toys;

import java.util.Random;

public class Soft_toys extends Toys{
    protected static final String TYPE = "Soft_toy";
    protected int id=new Random().nextInt(1000000000);;
    String[] models = {"Cheburashka", "Rabbit", "Fox", "Bear", "Dog", "Owl", "Kitten", "Dinosaur"};
    String name = models[new Random().nextInt(models.length)];
    protected  int weight = 40;

    public Soft_toys(String name) {
        super(name);
        this.id = id;
        this.weight = weight;
        id++;
    }
    public Soft_toys() {
        this.name=name;
        this.id = id;
        this.weight = weight;
        id++;
    }
    public String getType() {
        return TYPE;
    }
    @Override
    public String toString() {
        return "{" + "`name class`:`".replace('`', '"') + TYPE + "`,`name toy`:`".replace('`', '"') +name +"`,`id`:".replace('`', '"') +id +"}";
    }

}