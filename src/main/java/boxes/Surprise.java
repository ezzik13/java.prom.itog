package boxes;

import boxes.CarBox;
import boxes.GunsBox;
import boxes.SoftToysBox;
import org.json.simple.parser.ParseException;
import toys.Toys;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Surprise {
    public Toys surpriseToy(CarBox carBox, SoftToysBox softToysBox, GunsBox gunsBox) {
        int random = new Random().nextInt(10);
        if (random < 3) return carBox.remuveCar();
        else if (random > 2 && random < 6) return gunsBox.remuveGuns();
        else return softToysBox.remuveSoft_toys();
    }

    public void priz(Toys toy) {
        Object ob = null;
        try {
            ob = new JSONParser().parse(new FileReader("toys_for_prize.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONArray toysForPrize = (JSONArray) ob;

        toysForPrize.add(toysForPrize.size(), toy);

        try (FileWriter file = new FileWriter("toys_for_prize.json")) {
            file.write(toysForPrize.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void prizToChild() {
        Object ob = null;
        try {
            ob = new JSONParser().parse(new FileReader("toys_for_prize.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONArray toysForPrize = (JSONArray) ob;

        String toys = toysForPrize.get(0).toString();
        toysForPrize.remove(0);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("prizes.txt", true);
            fileWriter.write(toys+ "\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileWriter file = new FileWriter("toys_for_prize.json")) {
            file.write(toysForPrize.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
