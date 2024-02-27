public class DVDfilm extends DVD {
    //atribute local
    private String pemeran;
    private String sutradara;

    //constructor subclass 
    public DVDfilm(String judul, String pemeran, String sutradara ,String publisher, char kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara  = sutradara;
    }

    public void displayFilm(){
        System.out.println("Judul : " + getJudul());
        System.out.println("Pemeran : " + pemeran );
        System.out.println("Sutradara : " + sutradara);
        System.out.println("Publisher : " + getPublisher());
        System.out.println("Kategori : " + getPublisher());
        System.out.println("Stok : " + getStok());
    }

    @Override
    public String toString() {
    return "Judul: " + this.getJudul() + ", Pemeran: " + this.pemeran + ", Sutradara: " + this.sutradara +
            ", Publisher: " + this.getPublisher() + ", Kategori: " + this.getKategori() + ", Stok: " + this.getStok();
        }
}