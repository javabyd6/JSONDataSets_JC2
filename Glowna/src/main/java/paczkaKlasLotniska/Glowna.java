package paczkaKlasLotniska;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Glowna
{
    private Airport airport;
    private Statistics statistics;
    private Timet timet;
    private Carrier carrier;

}
