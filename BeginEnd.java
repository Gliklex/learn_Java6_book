//(2) Измените метод test() так,
// чтобы он получал два дополнительных аргумента begin и end,
// а значение testval проверялось на принадлежность к диапазону [ begin, end] (с включением границ).

public class BeginEnd {
    static int test(int testval, int target, int begin, int end) {
        Integer[] in = new Integer[end];
        for(int x: range(begin, end+1,1))
            if (testval == x)
                return 1;
            return 0;
    }
    public static int[] range(int start, int end, int step) {
        int sz = (end - start)/step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(test(4, 5, 4 ,8));
        System.out.println(test(4, 10,5 ,9));
        System.out.println(test(7, 5,3 ,7));

        }}
