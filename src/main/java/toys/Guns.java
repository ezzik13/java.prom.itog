package toys;

import java.util.Random;

public class Guns extends Toys{
    protected static final String TYPE = "Gun";
    protected int id=new Random().nextInt(1000000000);;
    String[] models = {"Submachine", "Gun", "Knife", "Sword", "Bow and arrow", "Scimitar", "Saber"};
    String name = models[new Random().nextInt(models.length)];
    protected  int weight = 30;

    public Guns(String name) {
        super(name);
        this.id = id;
        this.weight = weight;
        id++;
    }

    public Guns() {
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
