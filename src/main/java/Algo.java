/**
 * Created by chensheng on 2017/5/5.
 */
public class Algo
{
    boolean searchWithMinComp(int[] a, int n, int x)
    {
        if (a[n - 1] == x)
        {
            return true;
        }
        int backup = a[n - 1];
        a[n - 1] = x;
        for (int i = 0; ; i++)
        {
            if (a[i] == x)
            {
                a[n - 1] = backup;
                if (i < n - 1)
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
    }
}
