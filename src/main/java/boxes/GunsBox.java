package boxes;

import java.util.ArrayList;
import java.util.Scanner;

import toys.Guns;


public class GunsBox {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Guns> guns;



    public GunsBox() {
        this.guns = new ArrayList<Guns>();
    }

    public GunsBox(ArrayList<Guns> cars) {
        this.guns = cars;
    }

    public void addCar(GunsBox gunsBox, Guns car){
        guns.add(car);
        }
    

    public Guns remuveGuns() {
        if (guns.isEmpty()) {
            System.out.println("Оружия в коробке нет");
            return null;
        } else {
            int randomCarsToGet = (int) (Math.random() * (this.guns.size()));
            Guns randomCars = this.guns.get(randomCarsToGet);
            this.guns.remove(randomCars);
            return randomCars;
        }
    }

}