//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> s = new Stack<>();
        int span[] = new int[n];
        span[0] = 1;
        s.push(0);
        for(int i = 1; i < n; i++)
          {
              int curr_price = price[i];
              while(!s.empty() && curr_price >= price[s.peek()])
                {
                    s.pop();
                }
                if(s.empty())
                  {
                      span[i] = i+1;
                  }
                  else
                   {
                       int prev_price = s.peek();
                       span[i] = i - prev_price;
                   }
                   s.push(i);
          }
          return span;
        
    }
    
}
