package zadanie3;

class NextClass extends BaseClassWithAbstractMethod{
    private int i = 0;

    @Override
     void paint() {
         System.out.println(i);
     }

    public static void main(String[] args) {
        NextClass nC = new NextClass();
        nC.paint();
    }
}
