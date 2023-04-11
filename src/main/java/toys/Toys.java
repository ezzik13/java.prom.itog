package toys;


public abstract class Toys{
    protected static final String TYPE = "Toy";
    protected int id;
    protected String name;
    protected String type;
    protected int weight;

    public Toys(String name){
        this.name = name;
    }
    public Toys(){
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType(){
        return type;
    }
    public String toString() {
        return "{" + "`name class`:`".replace('`', '"') + TYPE + "`,`name toy`:`".replace('`', '"') +name +"`,`id`:".replace('`', '"') +id +"}";
    }
}