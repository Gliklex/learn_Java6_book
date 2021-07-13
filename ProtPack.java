import listvector.Vector;

//Покажите, что методы со спецификатором protected обладают доступом в пределах пакета, но не являются открытыми.
public class ProtPack extends Vector {
    public void vectLine() {
        line(); // - защищенный метод
    }

    public static void main(String[] args) {
        Vector pP = new ProtPack();
        //pP.line();
    }
}

