import java.time.LocalDate;
public class Bil {
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

     public Bil(String märke, String modell, String registreringsnummer, int årsmodell) {
        if (märke == null || märke.isEmpty()
        || modell == null || modell.isEmpty()
        || registreringsnummer == null || registreringsnummer.isEmpty()) {
    throw new IllegalArgumentException("Märke, modell och registreringsnummer får inte vara null eller tomma");
    }
    this.märke = märke;
    this.modell = modell;
    this.registreringsnummer = registreringsnummer;


        int currentYear = LocalDate.now().getYear();
        if (årsmodell < 1860 || årsmodell > currentYear) {
            throw new IllegalArgumentException("Årsmodell måste vara mellan 1860 och " + currentYear);
        } else {
            this.årsmodell = årsmodell;
        }

        this.hastighet = 0;
}
public String getMärke() {
        return this.märke;
    }

    public String getModell() {
        return this.modell;
    }

    public String getRegistreringsnummer() {
        return this.registreringsnummer;
    }

    public int getÅrsmodell() {
        return this.årsmodell;
    }

    public int getHastighet() {
        return this.hastighet;
    }
     public void setModell(String modell) {
        if (modell == null) {
            throw new IllegalArgumentException("Modell får inte vara null");
        } else if (modell.isEmpty()) {
            throw new IllegalArgumentException("Modell får inte vara tomt");
        } else {
            this.modell = modell;
        }
    }
        public void ökaHastighet(int ökning) {
        if (ökning <= 0) {
            throw new IllegalArgumentException("Ökning måste vara större än 0");
        } else {
            this.hastighet += ökning;
        }
    }

    public void bromsa(int minskning) {
        if (minskning <= 0) {
            throw new IllegalArgumentException("Minskning måste vara större än 0");
        } else if (minskning >= this.hastighet) {
            this.hastighet = 0;
        } else {
            this.hastighet -= minskning;
        }
    }

    public String toString() {
        return "Bil{" +
                "märke='" + this.märke + '\'' +
                ", modell='" + this.modell + '\'' +
                ", registreringsnummer='" + this.registreringsnummer + '\'' +
                ", årsmodell=" + this.årsmodell +
                ", hastighet=" + this.hastighet +
                '}';
    }
}
