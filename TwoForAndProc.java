public class TwoForAndProc {
    static int simple = 0;
    public static void main(String[] args) {
    for(int natural = 1; natural < 100; natural+=1) {
        int delitel = 0;
        for (int natural2 = 1; natural2 < 100; natural2 += 1) {
            if (natural % natural2 == 0) {
                delitel +=1;
            }
        }if (delitel < 3){
            if(natural >1){
            simple = natural;
            System.out.println(simple);
        } } } }
}
