package paczkaKlasLotniska;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Minutesdelayed
{
    private int lateaircraft;
    private int weather;
    private int carrier;
    private int security;
    private int total;
    private int nationalaviationsystem;




}
