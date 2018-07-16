/**
 * Created by chensheng on 2017/5/5.
 */
public class Main
{
    public static void main(String[] args)
    {
        int a[] = {10, 7, 8, 9, 1, 5};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        Algo algo = new Algo();
        algo.qs(a, 0, a.length-1);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
