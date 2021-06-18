//(1) Создайте массив объектов String. Присвойте объект String каждому элементу. Выведите содержимое массива в цикле for.
public class MassiveString {
    String[] massStr = new String[]{
            "Привет",
            "Медвед",
            "Murdered",
    };

    public static void main(String[] args) {
        MassiveString MasS = new MassiveString();
        for(int i = 0; i < MasS.massStr.length; i++){
            System.out.println("MasS["+ i +"]" + " " +MasS.massStr[i]);
        }
    }
}
