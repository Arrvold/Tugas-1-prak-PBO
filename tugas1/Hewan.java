package tugas1;

public abstract class Hewan {
    String nama, tempatHidup;
    int jumlahKaki;
    
    public Hewan (String nama, int jumlahKaki, String tempatHidup){
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.tempatHidup = tempatHidup;
    }
    abstract void makan();
    abstract void berkembangbiak();
    abstract void bernafas();
    
    public void info(){
    System.out.println("Nama        : " + nama);
    System.out.println("Jumlah Kaki : " + jumlahKaki);    
    System.out.println("Hidup di    : " + tempatHidup); 
    }
}