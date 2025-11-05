package Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cars implements Serializable {
    private String make;
    private int year;
    public Cars(String make, int year) {
        this.make = make;
        this.year = year;
    }
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cars toyota = new Cars("Toyota", 2021);
        Cars honda = new Cars("Honda", 2020);
        FileOutputStream  fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream (fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);
System.out.println("The file Serialization done!");
    }
}