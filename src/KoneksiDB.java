<<<<<<< HEAD
=======
<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hilmi, faizah, desta
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class KoneksiDB {
      public static Connection koneksi;
      
       public static Connection bukaKoneksi() {
        try {
            // PENTING: Nama database "db_fitplus" sesuai yang kamu buat!
            String url = "jdbc:mysql://localhost:3306/db_fitplus";
            String user = "root";      // Standar XAMPP
            String pass = "";          // Standar XAMPP (KOSONG)

            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }

    // Tes koneksi (Jalankan ini sekali saja buat cek)
    public static void main(String[] args) {
        bukaKoneksi();
    }
}
=======
>>>>>>> 98b1ff11d96e1bc4a90beb994261b8309f35ab3a
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hilmi, faizah, desta
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class KoneksiDB {
      public static Connection koneksi;
      
       public static Connection bukaKoneksi() {
        try {
<<<<<<< HEAD
            String url = "jdbc:mysql://localhost:3306/db_fitplus";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);
=======
            // PENTING: Nama database "db_fitplus" sesuai yang kamu buat!
            String url = "jdbc:mysql://localhost:3306/db_fitplus";
            String user = "root";      // Standar XAMPP
            String pass = "";          // Standar XAMPP (KOSONG)

            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
>>>>>>> 98b1ff11d96e1bc4a90beb994261b8309f35ab3a
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }

<<<<<<< HEAD
=======
    // Tes koneksi (Jalankan ini sekali saja buat cek)
>>>>>>> 98b1ff11d96e1bc4a90beb994261b8309f35ab3a
    public static void main(String[] args) {
        bukaKoneksi();
    }
}
<<<<<<< HEAD
=======
>>>>>>> a196bad08927448b0b3b83ffd306dae95b40ea45
>>>>>>> 98b1ff11d96e1bc4a90beb994261b8309f35ab3a
