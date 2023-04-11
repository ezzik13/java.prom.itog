package boxes;

import java.util.ArrayList;
import java.util.Scanner;

import toys.Soft_toys;


public class SoftToysBox {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Soft_toys> soft_toys;



    public SoftToysBox() {
        this.soft_toys = new ArrayList<Soft_toys>();
    }

    public SoftToysBox(ArrayList<Soft_toys> soft_toys) {
        this.soft_toys = soft_toys;
    }

    public void addSoftToy(SoftToysBox softToysBox, Soft_toys soft_toy){
        soft_toys.add(soft_toy);
        }
    

    public Soft_toys remuveSoft_toys() {
        if (soft_toys.isEmpty()) {
            System.out.println("Машин в коробке нет");
            return null;
        } else {
            int randomSoft_toyToGet = (int) (Math.random() * (this.soft_toys.size()));
            Soft_toys randomSoft_toy = this.soft_toys.get(randomSoft_toyToGet);
            this.soft_toys.remove(randomSoft_toy);
            return randomSoft_toy;
        }
    }

}