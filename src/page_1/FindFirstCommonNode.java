package page_1;
/*输入两个链表，找出它们的第一个公共结点。
 * coded by Jerome
 */
class ListNode{
	int data;
	ListNode next = null;
	ListNode(int data){
		this.data = data;
	}
}
public class FindFirstCommonNode {
	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null&&pHead2==null)
            return null;
       ListNode h1 = pHead1;
       ListNode h2 = pHead2;
       int len1 = 1;
       int len2 = 1;
       while(h1.next!=null){
           h1 = h1.next;
           len1++;
       }
       while(h2.next!=null){
           h2 = h2.next;
           len2++;
       }
       if(h2!=h1)
           return null;
       ListNode t1 = pHead1;
       ListNode t2 = pHead2;
       if(len1>len2){
           int d1 = len1-len2;
           while(d1>0){
               t1 = t1.next;
               d1--;
           }
       }
       else{
           int d2 = len2 - len1;
           while(d2>0){
               t2 = t2.next;
               d2--;
           }
       }
       while(t1!=null&&t2!=null){
           if(t1==t2)
               return null;
           else{
               t1 = t1.next;
               t2 = t2.next;
           }
       }
       return null;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
