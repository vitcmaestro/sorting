package mergesort;

public class Divide {
    public static int[] merge(int[] arr,int l,int r)
    {
        if(l<r){
        int mid = (l+r)/2;
        merge(arr,l,mid);
        merge(arr,mid+1,r);
        return sort(arr,mid,l,r);
        }
        return new int[0];
    }

    private static int[] sort(int[] arr, int mid, int l, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for(int i=0;i<n1;i++)
            larr[i] = arr[l+i];
        for(int j =0;j<n2;j++)
            rarr[j] = arr[mid+1+j];
        int i =0,j=0,k = l;
        while(i<n1 && j<n2)
        {
            if(larr[i]< rarr[j])
            {
                arr[k] = larr[i];
                i++;
            }
            else
            {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = rarr[j];
            j++;
            k++;
        }
        return arr;
    }
}

public class MergeSort {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Divide obj = new Divide();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] res = Divide.merge(arr,0,n-1);
        for(int i=0;i< res.length;i++)
            System.out.println(res[i]);
    }
    
}
