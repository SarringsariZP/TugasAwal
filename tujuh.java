/**
 * Created by lenovo on 3/24/2015.
 */
public class tujuh {
    public static void main(String[] args) {

        double pertama=1;
        double terakhir=10;
        double jumlah =0;
        double rata;
        System.out.println("Nilai Pertama ="+pertama);
        System.out.println("Nilai Terakhir ="+terakhir);
        System.out.println("Jumlah deretan =");
        while(pertama<=terakhir){
            jumlah = jumlah+pertama;
            pertama++;
        }
        System.out.println(jumlah);
        rata=jumlah/terakhir;
        System.out.println("Rata-rata deretan ="+rata);
    }
}
