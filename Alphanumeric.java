package sort;
import models.Vehicle;

import java.util.*;

/**
 * Created by thetida on 9/26/17.
 */
public class Alphanumeric {
    public void sorting (List<Vehicle> vehicles) {

        Collections.sort(vehicles);
        for (int x = 1; x < vehicles.size(); x++) {
            for (int y = 0; y < vehicles.size() - x; y++) {
                if (vehicles.get(y).compareTo(vehicles.get(y + 1)) > 0) {
                    Vehicle temp = vehicles.get(y);
                    vehicles.set(y , vehicles.get(y + 1));
                    vehicles.set(y + 1,  temp);

                }
            }
        }
    }
}