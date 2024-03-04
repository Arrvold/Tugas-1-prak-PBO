package tugas1;

public class Main {


    public static void main(String[] args) {
       Kelelawar kelelawar = new Kelelawar ("Kelelawar (Pteropodidae)");
       kelelawar.info();
       kelelawar.makan();
       kelelawar.berkembangbiak();
       kelelawar.bernafas();
       kelelawar.terbang();
       System.out.println("\n");
       
       Kambing kambing = new Kambing("Kambing (Capra aegagrus hircus)");
       kambing.info();
       kambing.makan();
       kambing.berkembangbiak();
       kambing.bernafas();
       System.out.println("\n");
       
       Kanguru kanguru = new Kanguru("Kanguru (Macropodidae)");
       kanguru.info();
       kanguru.makan();
       kanguru.berkembangbiak();
       kanguru.bernafas();
    }
    
}
