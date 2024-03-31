/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Product implements Serializable{
    //TRANSIENT : Object dideserialisasi, id akan diinisialisasi dengan nilai default (null).
    private transient String id;
    //STATIC :Ketika suatu variabel dideklarasikan sebagai static, variabel tersebut menjadi milik kelas, bukan dari instance (objek) kelas tersebut. Artinya, nilainya bersifat bersama untuk semua instance dari kelas tersebut.
    private static String grade;
    private static String nama;
    private List<ProductItem> items;
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setItems(List<ProductItem> items) {
        this.items = items;
    }
    
    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id=" + id + "\r\n"
                + "Nama=" + nama + "\r\n"
                + "=======================\r\n"
                + "Product Item:\r\n";
        item = items.stream().map((obj) ->
    obj.toString()).reduce(item, String::concat);
        return produk + item;
        
    }
    
}
