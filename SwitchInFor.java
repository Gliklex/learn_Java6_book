import java.util.*;
public class SwitchInFor {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++){
            switch (i){
                case 1: System.out.println("Леопардо Идинахрио");//break;
                case 4: System.out.println("Гладиолус"); //break;
                case 3: System.out.println("Горбуша"); //break;
                case 2: System.out.println("Жепа"); //break;
                default: System.out.println("-------------------");
            }
    }
}
}
