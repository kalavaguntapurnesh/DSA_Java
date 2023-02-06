

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        TreeMap<Integer, Boolean> b = new TreeMap<>();
        for(int i = 0; i < n; i++)
        {
            if(b.containsKey(arr[i]))
            {
                if(!b.get(arr[i]))
                {
                    b.put(arr[i], true);
                }
            }
            else
            {
                b.put(arr[i], false);
            }
        }
        Integer keyset[] = b.keySet().toArray(new Integer[0]);
        for(int i = 0; i < keyset.length; i++)
        {
            if(b.get(keyset[i]))
            {
                a.add(keyset[i]);
            }
        }
        if(a.isEmpty())
        {
            a.add(-1);
        }
        return a;
        
    }
}
