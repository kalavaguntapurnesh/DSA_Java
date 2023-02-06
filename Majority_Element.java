
class Solution
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        int major = -1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < size; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int temp = map.get(arr[i]);
                map.put(arr[i], (++temp));
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> j : map.entrySet())
        {
            if(j.getValue() > (size / 2))
              {
                  major = j.getKey();
                  break;
              }
        }
        return major;
    }
}
