/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author ACER
 */
public class ProductItem implements Serializable{
    private String nama;
    //FINAL : NILAI TIDAK DAPAT BERUBAH SETELAH PERTAMA KALI DI INISIALISASI
    private final double harga;
    
    public ProductItem(String name, double price) {
       this.nama = name;
       this.harga = price;
    }
    
    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
              
    }
    
}
