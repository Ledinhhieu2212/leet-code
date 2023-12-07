package easy;

import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;

/**
 * Definition for singly-linked list.
 * 
 */
public class _21_Merge_Two_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }


    public static void main(String[] args) {
        ListNode sc = new ListNode(1);

        System.out.println(sc(1,[1,2]));
    }
}
