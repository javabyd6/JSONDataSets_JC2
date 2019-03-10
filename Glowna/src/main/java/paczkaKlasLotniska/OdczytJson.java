package paczkaKlasLotniska;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class OdczytJson
{


    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Glowna[] dane =  mapper.readValue(new File("airlines.json"),Glowna[].class);
            System.out.println("Plik odczytano");

            System.out.println(dane.length);
            System.out.println(Arrays.toString(dane));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
