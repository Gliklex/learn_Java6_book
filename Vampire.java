// поиск всех четырехзначных чисел-вампиров

/*если вторая цифра числа делится на 2 без остатка,
  то первая цифра меняется местами со второй и образуют первый клык, а остальные второй,но
  если за этой цифрой стоит цифра 2 то 2 первая цифра первого клыка,
  а первая цифра числа - вторая цифра первогого клыка, остальные цифры образуют другой клык.

  если последняя цифра числа - 0, то последние две цифры числа образуют клык,
  а оставшиеся меняются местами и образуют другой клык

  иначе вторая цифра числа меняется местами с четвертой цифрой числа образуя клык, а оставшиея образуют другой клык */

public class Vampire {
    static int accumulator; // счетчик вампиров
    static int tooth, tooth2; // числовое представление клыков
    static String fangI, fangII, fangIII, fangIV; //строковое предстваление цифер клыка
    static int f1, f2, f3, f4; //цифры клыка

    public static void main(String[] args) {
        for(int chislo = 1000; chislo < 10000; chislo++){
            int a = chislo/1000;   //1-ая цифра числа
            int b = chislo/100%10; //2-ая цифра числа
            int c = chislo%100/10; //3-я цифра числа
            int d = chislo%10;     //4-ая цифра числа
            if ((chislo/100%10)%2 == 0){
                f1 = b;
                f2 = a;
                f3 = c;
                f4 = d;
                if (chislo%100/10 == 2){
                    f1 = c;
                    f3 = b;
                }
            }
            else if (chislo%10 == 0){
                f1 = b;
                f2 = a;
                f3 = c;
                f4 = d;
            }
            else {
                f1 = a;
                f2 = d;
                f3 = c;
                f4 = b;
            }
            fToFang();
            fangToInt();
            //System.out.println(tooth+" "+tooth2+" "+chislo);
            if (tooth * tooth2 == chislo){
                accumulator += 1;
                System.out.println(accumulator+")"+" "+chislo+" = "+ tooth +" * "+ tooth2);}
        }

    }
    static void fToFang(){
        fangI = Integer.toString(f1);
        fangII = Integer.toString(f2);
        fangIII = Integer.toString(f3);
        fangIV = Integer.toString(f4);

    }
    static void fangToInt(){
        tooth = Integer.parseInt(fangI + fangII);
        tooth2 = Integer.parseInt(fangIII + fangIV);
    }
}