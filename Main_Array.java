import java.util.Scanner;

public class Main_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        DVD[] dvdCollection = new DVD[10]; // Array untuk menyimpan objek DVD, misalnya dengan kapasitas maksimum 10

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data DVD film");
            System.out.println("2. Input data DVD musik");
            System.out.println("3. Tampilkan informasi DVD");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputDVDFilm(scanner, dvdCollection); // Memanggil fungsi untuk menyimpan entry data DVDfilm ke dalam array
                    break;
                case 2:
                    inputDVDMusik(scanner, dvdCollection); // Memanggil fungsi untuk menyimpan entry data DVDmusik ke dalam array
                    break;
                case 3:
                    tampilkanDataDVD(dvdCollection); // Memanggil fungsi untuk menampilkan data yang telah di entrikan pada DVDfilm & DVDmusik
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static int inputDVDFilm(Scanner scanner, DVD[] dvdCollection) {
        scanner.nextLine(); // Membersihkan newline

        System.out.println("\nMasukkan data untuk DVD film:");
        System.out.print("Judul: ");
        String judulFilm = scanner.nextLine();
        System.out.print("Pemeran: ");
        String pemeran = scanner.nextLine();
        System.out.print("Sutradara: ");
        String sutradara = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisherFilm = scanner.nextLine();
        System.out.print("Kategori: ");
        char kategoriFilm = scanner.nextLine().charAt(0); // Ambil karakter pertama dari input
        System.out.print("Stok: ");
        int stokFilm = scanner.nextInt();

        //objek dari class DVDmusik beserta construktor
        DVDfilm film = new DVDfilm(judulFilm, pemeran, sutradara, publisherFilm, kategoriFilm, stokFilm);
        
        for (int i = 0; i < dvdCollection.length; i++) {
            if (dvdCollection[i] == null) {
                dvdCollection[i] = film;
                return i;
            }
        }
        System.out.println("Maaf, kapasitas maksimum koleksi DVD telah tercapai.");
        return -1;
    }

    private static int inputDVDMusik(Scanner scanner, DVD[] dvdCollection) {
    scanner.nextLine(); // Membersihkan newline

    System.out.println("\nMasukkan data untuk DVD musik:");
    System.out.print("Judul: ");
    String judulMusik = scanner.nextLine();
    System.out.print("Penyanyi: ");
    String penyanyi = scanner.nextLine();
    System.out.print("Produser: ");
    String produser = scanner.nextLine();
    System.out.print("Publisher: ");
    String publisherMusik = scanner.nextLine();
    System.out.print("Top Hits: ");
    String topHits = scanner.nextLine();
    scanner.nextLine(); // Membersihkan newline
    System.out.print("Kategori: ");
    char kategoriMusik = scanner.nextLine().charAt(0); 
    System.out.print("Stok: ");
    int stokMusik = scanner.nextInt();
    
    //objek dari class DVDmusik beserta construktor
    DVDmusik musik = new DVDmusik(judulMusik, penyanyi, produser, publisherMusik, topHits, kategoriMusik, stokMusik);

    for (int i = 0; i < dvdCollection.length; i++) {
        if (dvdCollection[i] == null) {
            dvdCollection[i] = musik;
            return i;
        }
    }
        System.out.println("Maaf, kapasitas maksimum koleksi DVD telah tercapai.");
        return -1;
    }


    // methode untuk menampilkan entry data pada 
    private static void tampilkanDataDVD(DVD[] dvdCollection) {
        System.out.println("\nDaftar DVD Film:");
        for (DVD dvd : dvdCollection) {
            if (dvd instanceof DVDfilm) {
                System.out.println(dvd);
            }
        }
        
        System.out.println("\nDaftar DVD Musik:");
        for (DVD dvd : dvdCollection) {
            if (dvd instanceof DVDmusik) {
                System.out.println(dvd);
            }
        }
    }

}
