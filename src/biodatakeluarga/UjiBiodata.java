package biodatakeluarga;

import java.util.Scanner;


public class UjiBiodata {
     public static void main(String[] args) {
     BiodataKeluarga biodata = new BiodataKeluarga();
      Scanner masukan = new Scanner(System.in);
      
      System.out.println("===========BIODATA KELUARGA=============");
      
      System.out.print("Nama ayah       : ");
      String namaAyah = masukan.next();
      biodata.setNamaAyah(namaAyah);
      
      System.out.print("Nama ibu        : ");
      String namaIbu = masukan.next();
      biodata.setNamaIbu(namaIbu);
      
      System.out.print("Nama  anda      : ");
      String nama = masukan.next();
      biodata.setNama(nama);
      
      System.out.print("Nama saudara    : ");
      String namaSaudara = masukan.next();
      biodata.setNamaSaudara(namaSaudara);
      
      System.out.print("Alamat          : ");
      String Alamat = masukan.next();
      biodata.setAlamat(Alamat);
      
      System.out.print("Tempat Lahir    : ");
      String TempatLahir = masukan.next();
      biodata.setTempatLahir(TempatLahir);
      
      System.out.print("Tanggal lahir   : ");
      String TanggalLahir= masukan.next();
      biodata.setTanggalLahir(TanggalLahir);
      
      
      System.out.print("Hobi            : ");
      String Hobi = masukan.next();
      biodata.setHobi(Hobi);
      
      
      System.out.print("Cita-cita       : ");
      String Citacita = masukan.next();
      biodata.setCitaCita(Citacita);
         
      
      System.out.print("Nomer Telepon   : ");
      String NomerTelepon = masukan.next();
      biodata.setNomerTelepon(NomerTelepon);
      
      
         
     
    
     }
}
