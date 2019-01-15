/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan59.detectiveconan;
/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program : program ini berisi program yang menampilan karakter dari
 *                    serial detective konan
 */
public class PBO6K10116228Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemeranUtama pu = new PemeranUtama("Shinichi Kudo", "pai", "ambisius", 21);
        pu.setNamaSamaran("Conan");
        pu.displayKarakter();
        System.out.println("Nama Samaran : "+ pu.getNamaSamaran());
        
        System.out.println("");
    
        PemeranPendukung pp = new PemeranPendukung("Kogoro Mouri","Ramen","pantang Menyerah", 30);
        pp.setPanggilan("Heiji");
        pp.displayKarakter();
        System.out.println("Nama Panggilan : " + pp.getPanggilan());
        System.out.println("");
    }
    
}
