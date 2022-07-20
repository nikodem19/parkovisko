package parkovisko;

import java.time.LocalDateTime;

public class Auto {
    private final String SPZ;
    private final LocalDateTime casZaparkovania;

    public Auto(String SPZ, LocalDateTime casZaparkovania) {
        this.SPZ = SPZ;
        this.casZaparkovania = casZaparkovania;
    }
    
    public LocalDateTime getCasZaparkovania() {
        return casZaparkovania;
    }

    public String getSPZ() {
        return SPZ;
    }

}
