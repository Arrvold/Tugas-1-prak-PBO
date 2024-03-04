
package tugas1;


public class Kelelawar extends Hewan implements Terbang{
    Kelelawar(String nama){
        super (nama,2,"Darat");
    }
    public void makan(){
        System.out.println(nama + " makan buah-buahan");
    }
    public void berkembangbiak(){
        System.out.println(nama + " berkembang biak dengan cara melahirkan");
    }
    public void bernafas(){
        System.out.println(nama + " bernafas menggunakan paru-paru");
    }
    public void terbang(){
        System.out.println(nama + " bisa terbang menggunakan sayap");
    }
    
}
