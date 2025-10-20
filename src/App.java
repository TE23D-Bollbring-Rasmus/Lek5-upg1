public class App {
    public static void main(String[] args) throws Exception {
  Bil bil1 = new Bil("Volvo", "245 GL", "ABC123", 1983);
        System.out.println(bil1);

        bil1.ökaHastighet(50);
        System.out.println("Efter att ha ökat hastigheten: " + bil1.getHastighet());

        bil1.bromsa(20);
        System.out.println("Efter att ha bromsat: " + bil1.getHastighet());

        try {
            bil1.ökaHastighet(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

        try {
            Bil bil2 = new Bil("", "Volvo", "245 GL", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Fel när bil2 skapades: " + e.getMessage());
        }
    }
        
}
