public class DVDmusik extends DVD {
    //atribute local
    private String penyanyi;
    private String produser;
    private String topHits;    

    //constructor subclass 
    public DVDmusik(String judul,String penyanyi, String produser ,String publisher,String topHits, char kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

   public void displayMusik(){
        System.out.println("Judul : " + getJudul());
        System.out.println("Penyanyi : " + penyanyi);
        System.out.println("Produser : " + produser);
        System.out.println("Publisher : " + getPublisher());
        System.out.println("TopHits : " + topHits);
        System.out.println("Kategori : " + getPublisher());
        System.out.println("Stok : " + getStok());
    }

    @Override
    public String toString() {
    return "Judul: " + this.getJudul() + ", Penyanyi: " + this.penyanyi + ", Produser: " + this.produser +
            ", Publisher: " + this.getPublisher() + ", Top Hits: " + this.topHits + ", Kategori: " + this.getKategori() +
            ", Stok: " + this.getStok();
}
}
