package model;

public class Buku {

    private String kdbuku;
    private String jdlbuku;
    private String nmpgrg;
    private String pnrbit;
    private String thntrbt;


    public Buku() {}

    public Buku(String kdbuku, String jdlbuku, String nmpgrg, String pnrbit, String thntrbt) {
        this.kdbuku = kdbuku;
        this.jdlbuku = jdlbuku;
        this.nmpgrg = nmpgrg;
        this.pnrbit = pnrbit;
        this.thntrbt = thntrbt;
    }

    @Override
    public boolean equals(Object obj) {
        Buku bukuperpus = (Buku) obj;
        if(this.kdbuku.equals(bukuperpus.getKdbuku())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + kdbuku + ", " + jdlbuku + ", " + nmpgrg + ", "+ pnrbit + ", "+ thntrbt + " ];";
    }

    

    public void setKdbuku(String kdbuku) { this.kdbuku = kdbuku; }

    public String getKdbuku() { return kdbuku; }

    public void setJdlbuku(String jdlbuku) { this.jdlbuku = jdlbuku; }

    public String getJdlbuku() { return jdlbuku; }

    public void setNmpgrg(String nmpgrg) { this.nmpgrg = nmpgrg; }

    public String getNmpgrg() { return nmpgrg; }

    public void setPnrbit(String pnrbit) { this.pnrbit = pnrbit; }

    public String getPnrbit() { return pnrbit; }

    public void setThntrbt(String thntrbt) { this.thntrbt = thntrbt; }

    public String getThntrbt() { return thntrbt; }

}