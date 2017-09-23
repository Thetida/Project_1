package models;

/**
 * Created by thetida on 9/22/17.
 */
public class Vehicle {
    private String id;
    private String plate;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void fromCsvRow(String[] csvRow){
        this.id= csvRow[0];
        this.plate=csvRow[1];
        this.date=csvRow[2];

    }

}
