
package tugas1;

public class Kambing extends Hewan{
    Kambing(String nama){
        super (nama,4,"Darat");
    }
    public void makan(){
        System.out.println(nama + " makan rumput");
    }
    public void berkembangbiak(){
        System.out.println(nama + " berkembang biak dengan cara melahirkan");
    }
    public void bernafas(){
        System.out.println(nama + " bernafas menggunakan paru-paru");
    }
}
