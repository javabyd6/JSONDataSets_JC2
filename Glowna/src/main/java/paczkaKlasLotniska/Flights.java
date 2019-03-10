package paczkaKlasLotniska;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flights
{
    private int cancelled;
    private int timet;
    private int total;
    private int delayed;
    private int diverted;



}
