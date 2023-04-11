package toys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Cars extends Toys{
    protected static final String TYPE = "Cars";
    protected int id=new Random().nextInt(1000000000);
    String[] models = {"BMW", "Lada", "UAZ", "Audi", "Cadillac", "Lifan", "Toyota"};
    String name = models[new Random().nextInt(models.length)];
    protected  int weight = 30;
    public Cars(String name) {
        super(name);
        this.id = id;
        this.weight = weight;
        id++;
    }

    public Cars() {
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