abstract public class DVD {
    //Atribute
    private String judul;
    private String publisher;
    private char kategori;
    private int stok;

    //construktor superclass
    public DVD(String judul, String publisher,char kategori, int stok){
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    //setter getter atribute superclass
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public char getKategori() {
        return kategori;
    }
}