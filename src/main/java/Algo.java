/**
 * Created by chensheng on 2017/5/5.
 */
public class Algo
{
    void qs(int[] a, int low, int high)
    {
        if (low < high)
        {
        int p = pt(a, low, high);
            qs(a, low, p-1);
            qs(a, p+1, high);
        }

    }

    int pt(int[] a, int low, int high)
    {
       int pv = a[high];
       int i= low-1;
        for (int j = low; j < high; j++) {
            if (a[j] <= pv)
            {
                i++;
                swap(a, i, j);
            }
        }
        i++;
        swap(a, i, high);
       return i;
    }

    void swap(int[] a, int i, int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

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
                }
                else
                {
                    return false;
                }
            }
        }
    }

    void quickSort(int[] a, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(a, low, high);
            quickSort(a, low, pi);
            quickSort(a, pi+1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low-1;
        int j = high+1;
        while (true)
        {
            do{
                i++;
            }while (a[i]< pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if (i >= j)
            {
                return j;
            }
            int bak = a[j];
            a[j] = a[i];
            a[i] = bak;
        }
    }

    int partition2(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    void quickSort2(int arr[], int left, int right) {
        int index = partition2(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}
