/* (2) Создайте класс с пустой final-ссылкой на объект.
Проведите инициализацию пустой константы во всех конструкторах.
Продемонстрируйте гарантированную инициализацию final перед использованием
и невозможность ее изменения после инициализации.
 */

public class FinalLinkObj {
    private final FinalLinkObj fLO;
    FinalLinkObj(){
        fLO = new FinalLinkObj();
    }

    public static void main(String[] args) {
        //new FinalLinkObj().fLO = null;
    }
}
