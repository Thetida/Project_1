package sort;
import com.Utils;
import models.Vehicle;

import java.util.*;

/**
 * Created by thetida on 9/26/17.
 */
public class Alphanumeric {
    public void sorting (List<Vehicle> vehicles) {

        List<String> plates = new ArrayList<String>();

        for(int i=0; i<vehicles.size(); i++){
            Vehicle currentVehicle = vehicles.get(i);
            plates.add(currentVehicle.getPlate());
        }
        Collections.sort(plates);

        int i=0;
        for(String temp: plates){
            System.out.println("plates " + ++i + " : " + temp);
        }

    }
}