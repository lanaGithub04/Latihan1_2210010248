package hitung;

public class Matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat construktor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil1 = bil2;
    }
    
    //Membuat method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2; 
    }
    
     //Membuat method setPengurangan
    public double setPengurangan(){
        return bil1 - bil2; 
    }
    
     //Membuat method setPerkalian
    public double setPerkalian(){
        return bil1 * bil2; 
    }
    
     //Membuat method setPembagian
    public double setPembagian(){
        return bil1 / bil2; 
    }
}
