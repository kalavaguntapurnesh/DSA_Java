mplate for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> hp = new HashMap<>();
        int a[] = new int[2];
        for(int i = 0; i < n; i++)
        {
            hp.put(arr[i], hp.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < n; i++)
        {
            if(hp.get(arr[i]) == 2)
             {
                 a[0] = arr[i];
                 break;
             }
        }
        for(int i = 1; i <= n; i++)
        {
            if(!hp.containsKey(i))
             {
                 a[1] = i;
                 break;
             }
        }
        return a;
        
    }
}
