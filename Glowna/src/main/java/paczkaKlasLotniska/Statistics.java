package paczkaKlasLotniska;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistics
{
    private Flights flights;
    private Ofdelays ofdelays;
    private Minutesdelayed minutesdelayed;

}
