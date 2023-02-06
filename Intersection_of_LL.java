

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}



class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        Node temp1 = head1;
        Node temp2 = head2;
        ArrayList<Integer> h1 = new ArrayList<>();
        ArrayList<Integer> h2 = new ArrayList<>();
        while(temp1 != null)
        {
            h1.add(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            h2.add(temp2.data);
            temp2 = temp2.next;
        }
        h1.retainAll(h2);
        Node temp = new Node(0);
        Node curr = temp;
        for(Integer i : h1)
        {
            Node newNode = new Node(i);
            curr.next = newNode;
            curr = newNode;
        }
        return temp.next;
    }
}
