public class One100break99 {
    static int result = 0;

    public static void main(String[] args) {
        while(true){
            result++;
            System.out.println(result);
            if(result == 99) return;
            //if(result == 99) break;
        }
    }
}

