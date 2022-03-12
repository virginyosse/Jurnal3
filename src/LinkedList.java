import java.util.ArrayList;

public class LinkedList {
    private ArrayList<Pegawai> listPegawai = new ArrayList<>();

    public void addData(Pegawai pegawai){
        listPegawai.add(pegawai);
    }
    public void removeData(boolean isAwal, boolean isAkhir){
       if (listPegawai.isEmpty()){
           System.out.println("data masih kosong. Silakan input data");
       }else{
           if (isAwal){
               listPegawai.remove(0);
           }else if(isAkhir){
               listPegawai.remove(listPegawai.size()-1);
           }else{
               System.out.println("invalid input");
           }
       }

    }
    public void displayData(){
        for (Pegawai data:listPegawai) {
            System.out.println(data);
        }
    }
}
