import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        Scanner in = new Scanner(System.in);


        int pilihan;

        do {
            System.out.println("Pilihlh Menu:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data Akhir");
            System.out.println("3. Hapus data Awal");
            System.out.println("4. Cetak list Pegawai");
            System.out.println("5. Keluar");

            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Tuliskan NIP, nama, dan divisi");
                    System.out.print("nip:");
                    String nip = in.next();
                    System.out.print("nama:");
                    String nama = in.next();
                    System.out.print("divisi:");
                    String divisi = in.next();
                    data.addData(new Pegawai(nip, nama, divisi));
                    break;
                case 2:
                    System.out.println("menghapus data akhir");
                    data.removeData(false, true);
                    break;
                case 3:
                    System.out.println("menghapus data awal");
                    data.removeData(true, false);
                    break;
                case 4:
                    data.displayData();
                    break;
                case 5:
                    break;
            }

        } while (pilihan != 5);


    }
}
