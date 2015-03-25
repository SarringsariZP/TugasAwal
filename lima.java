public class lima{
    public static void main(String[] args) {

        int pertama=1;
        int terakhir=10;
        System.out.println("Nilai Pertama ="+pertama);
        System.out.println("Nilai Terakhir ="+terakhir);
        System.out.println("Deretan =");

        while(pertama<=terakhir){
            System.out.print(+pertama);
            if(pertama<terakhir){
                System.out.print(",");
            }
            pertama++;
        }
    }
}