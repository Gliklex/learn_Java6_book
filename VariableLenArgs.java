/*
(2) Напишите метод, получающий список аргументов переменной длины с массивом String.
    Убедитесь в том, что этому методу может передаваться как список объектов String,
    разделенных запятыми, так и String[].

(1) Напишите метод main (), использующий список аргументов переменной длины вместо обычного синтаксиса.
    Выведите все элементы полученного массива args.
    Протестируйте программу с разным количеством аргументов командной строки.
*/

public class VariableLenArgs {
    public void MassiveString(String... strings){
        for (String s: strings)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String... args) {
        VariableLenArgs vLA = new VariableLenArgs();
        vLA.MassiveString("Привет","Медвед");
        vLA.MassiveString(new String[]{"Медвед","Привет"});

        for (String str: args){
            System.out.println(str);
        }
    }
}
