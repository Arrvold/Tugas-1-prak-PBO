
package tugas1;

public class Kanguru extends Hewan{
    Kanguru(String nama){
        super (nama,2,"Darat");
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
