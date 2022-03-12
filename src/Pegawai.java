public class Pegawai {
    private String NIP, nama, divisi;
    public Pegawai(String NIP, String nama, String divisi){
        this.NIP=NIP;
        this.nama=nama;
        this.divisi=divisi;
    }
    public String getNIP(){
        return NIP;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "NIP='" + NIP + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\'' +
                '}';
    }
}
