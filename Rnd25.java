import java.util.Random;
public class Rnd25 {
    static int resValue = 0;
    public static void main(String[] args) {
        Rnd25 r25 = new Rnd25();
        System.out.println("Цикл while: ");
        r25.resMakerWhile();
        System.out.println("----------------------------------------------");
        System.out.println("Цикл for: ");
        r25.resMakerFor();
    }
    public void resMakerWhile(){
        while(resValue < 25){
            Random rnd = new Random();
            int result1 = rnd.nextInt(25);
            int result2 = rnd.nextInt(25);
            resValue +=1;
            if (result1 < result2){
                System.out.println("число: "+ result1+" меньше числа: "+ result2);
            } else if (result1 > result2){
                System.out.println("число: "+ result1+" больше числа: "+ result2);
            } else System.out.println("число: "+ result1+" равно числу: "+ result2);
        }
    }
    public void resMakerFor(){
        for(int resValue = 0; resValue < 25; resValue += 1){
            Random rnd = new Random();
            int result1 = rnd.nextInt(25);
            int result2 = rnd.nextInt(25);
            if (result1 < result2){
                System.out.println("число: "+ result1+" меньше числа: "+ result2);
            } else if (result1 > result2){
                System.out.println("число: "+ result1+" больше числа: "+ result2);
            } else System.out.println("число: "+ result1+" равно числу: "+ result2);
        }
    }
}
