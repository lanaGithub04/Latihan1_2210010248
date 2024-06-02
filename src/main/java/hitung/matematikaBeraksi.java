package hitung;

public class matematikaBeraksi {
    public static void main(String [] args) {
        //Membuat objek
        Matematika lann = new Matematika(4,8);
        
      System.out.println("Hasil Penjumlahan: "+lann.setPenjumlahan());
      System.out.println("Hasil Pengurangan: "+lann.setPengurangan());
      System.out.println("Hasil Perkalian: "+lann.setPerkalian());
      System.out.println("Hasil Pembagian: "+lann.setPembagian());
    }
}
