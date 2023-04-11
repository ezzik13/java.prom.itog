package boxes;

import java.util.ArrayList;
import java.util.Scanner;

import toys.Cars;


public class CarBox {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Cars> cars;



    public CarBox() {
        this.cars = new ArrayList<Cars>();
    }

    public CarBox(ArrayList<Cars> cars) {
        this.cars = cars;
    }

    public void addCar(CarBox carBox, Cars car){
            cars.add(car);
        }


    public  Cars remuveCar() {
        if (cars.isEmpty()) {
            System.out.println("Машин в коробке нет");
            return null;
        } else {
            int randomCarsToGet = (int) (Math.random() * (this.cars.size()));
            Cars randomCars = this.cars.get(randomCarsToGet);
            this.cars.remove(randomCars);
            return randomCars;
        }
    }

}