public class Tank {
    int tankLevel;

    void toEmptyTank(){
        tankLevel = 0;
        System.out.println("Ёмкость пуста");
    }

    public void finalize(){
        if(tankLevel > 0)
            System.out.println("Ёмкость не пуста");
    }

    public static void main(String[] args) {

        Tank t1 = new Tank();
        t1.tankLevel = 10;
        System.out.println("t1.tankLevel: "+t1.tankLevel);
        t1.toEmptyTank();
        System.out.println("t1.tankLevel: "+t1.tankLevel);
        new Tank();
        System.gc();
        System.out.println();

        Tank t2 = new Tank();
        t2.tankLevel = 10;
        System.out.println("t2.tankLevel: "+t2.tankLevel);
        new Tank();
        System.gc();
        System.out.println("t2.tankLevel: "+t2.tankLevel);
        System.out.println();

    }
}
