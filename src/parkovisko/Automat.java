package parkovisko;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.HOURS;
import java.util.ArrayList;
import java.util.HashMap;

public class Automat {
    private String nazov;
    private ArrayList<Auto> zoznam = new ArrayList(); 
    final int miesta = 100;
    private int obsadene = 0;
    private HashMap<String, Auto> hm = new HashMap<>();
    
    public Automat(String nazov) {
       this.nazov = nazov; 
    }
    
    
    void vyparkuj(String SPZ) {
        if(hm.containsKey(SPZ)) {
            Auto a = hm.get(SPZ);
            long hodiny = a.getCasZaparkovania().until(LocalDateTime.now(), HOURS);
            if(hodiny > 24) System.out.println("Prosím zaplaťte pokutu 50!");
            else if (hodiny <= 1) System.out.println("Prosím zaplaťte 2€ za začatú hodinu parkovania.");
            else System.out.println("Prosím zaplaťte " + hodiny * 2 + "€ za " + hodiny + "hod parkovania.");
            zoznam.remove(a);
            obsadene--;
        } else System.out.println("Auto na parkovisku nenájdené!");
    }
    
    void zaparkuj(Auto a) {
        hm.put(a.getSPZ(), a);
        zoznam.add(a);
        obsadene++;
        System.out.println("Prosím zaparkuje svoje auto s ŠPZ " + a.getSPZ());
    }
    
    public void volneMiesta() {
        System.out.println("Na parkovisku je " + (miesta-obsadene) + " voľných miest.");
    }
}
