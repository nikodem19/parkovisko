package parkovisko;

import java.time.LocalDateTime;

public class Parkovisko {

    public static void main(String[] args) {
        Automat a = new Automat("Europa");
        a.zaparkuj(new Auto("BB745AD", LocalDateTime.of(2018, 1, 15, 4, 28)));
        a.volneMiesta();
        a.zaparkuj(new Auto("PD826ZS", LocalDateTime.of(2018, 1, 15, 6, 0)));
        a.zaparkuj(new Auto("BR633LL", LocalDateTime.of(2018, 1, 15, 7, 0)));
        a.volneMiesta();
        
        System.out.println();
        
        a.vyparkuj("PD826ZS");
        a.volneMiesta();
        a.vyparkuj("BR633LL");
        a.vyparkuj("BB745AD");
        a.vyparkuj("B745ADB");
    }
    
}
