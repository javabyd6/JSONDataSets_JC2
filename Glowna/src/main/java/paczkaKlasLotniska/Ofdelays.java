package paczkaKlasLotniska;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ofdelays
{
    private int lateaircraft;
    private int weather;
    private int security;
    private int nationalaviationsystem;
    private int carrier;
}
