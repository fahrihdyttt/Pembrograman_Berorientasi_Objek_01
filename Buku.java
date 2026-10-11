class Buku {
    String judul;
    String penulis;
    String tahunTerbit;

    public void Dipinjam() {
        System.out.println("Judul Buku " + this.judul + " ditulis oleh " + this.penulis + " tahun terbit " + this.tahunTerbit + " Sedang Dipinjam");
    }

    public void Dikembalikan() {
        System.out.println("Judul Buku " + this.judul + " ditulis oleh " + this.penulis + " tahun terbit " + this.tahunTerbit + " Sudah Dikembalikan");
    }

    public void MenampilInfo() {
        System.out.println("Judul Buku " + this.judul + " ditulis oleh " + this.penulis + " tahun terbit " + this.tahunTerbit + " Sedang Menampilkan Info");
    }

    //method main untuk menjalankan program
    public static void main(String[] args) {
        Buku pulang = new Buku();
        Buku negeri5Menara = new Buku();
        Buku perahuKertas = new Buku();
        Buku cantikItuLuka = new Buku();

        pulang.judul = "Pulang";
        pulang.penulis = "Tere Liye";
        pulang.tahunTerbit = "2015";

        negeri5Menara.judul = "Negeri 5 Menara";
        negeri5Menara.penulis = "Ahmad Fuadi";
        negeri5Menara.tahunTerbit = "2009";

        perahuKertas.judul = "Perahu Kertas";
        perahuKertas.penulis = "Dee Lestari";
        perahuKertas.tahunTerbit = "2009";

        cantikItuLuka.judul = "Cantik Itu Luka";
        cantikItuLuka.penulis = "Eka Kurniawan";
        cantikItuLuka.tahunTerbit = "2002";

        //pemanggilan method:
        pulang.Dikembalikan();
        negeri5Menara.MenampilInfo();
        perahuKertas.Dipinjam();
        cantikItuLuka.Dikembalikan();
    }
}