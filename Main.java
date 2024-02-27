import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data DVD film");
            System.out.println("2. Input data DVD musik");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputDVDFilm(scanner);
                    break;
                case 2:
                    inputDVDMusik(scanner);
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void inputDVDFilm(Scanner scanner) {
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
        char kategoriFilm = scanner.nextLine().charAt(0); 
        System.out.print("Stok: ");
        int stokFilm = scanner.nextInt();

        // objek DVDfilm dengan data yang dimasukkan kedalam constructor
        DVDfilm film = new DVDfilm(judulFilm, pemeran, sutradara, publisherFilm, kategoriFilm, stokFilm);
    }

    private static void inputDVDMusik(Scanner scanner) {
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
        System.out.print("Kategori: ");
        char kategoriMusik = scanner.nextLine().charAt(0); 
        System.out.print("Stok: ");
        int stokMusik = scanner.nextInt();

        // objek DVDmusik dengan data yang dimasukkan kedalam construktor 
        DVDmusik musik = new DVDmusik(judulMusik, penyanyi, produser, publisherMusik, topHits, kategoriMusik, stokMusik);
    }
}
