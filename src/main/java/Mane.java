import boxes.CarBox;
import boxes.GunsBox;
import boxes.SoftToysBox;
import boxes.Surprise;
import toys.Cars;
import toys.Guns;
import toys.Soft_toys;
import java.util.ArrayList;

public class Mane {


    public static void main(String[] args) {
        ArrayList<Cars> cars = new ArrayList<>();
        ArrayList<Guns> guns = new ArrayList<>();
        ArrayList<Soft_toys> soft_toys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cars.add(new Cars());
            guns.add(new Guns());
            soft_toys.add(new Soft_toys());
        }
        CarBox carBox = new CarBox(cars);
        GunsBox gunsBox = new GunsBox(guns);
        SoftToysBox softToysBox = new SoftToysBox(soft_toys);
        Surprise surprise = new Surprise();
        surprise.priz(surprise.surpriseToy(carBox, softToysBox, gunsBox));
        surprise.prizToChild();
    }


}