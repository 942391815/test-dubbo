package guava;

/**
 * Created by Micheal on 2020/3/25.
 */
public class Test {
    public static void main(String[] args) {
//        ListNode oneA = new ListNode(1);
//        ListNode oneB = new ListNode(2);
//        ListNode oneC = new ListNode(3);
//        ListNode oneD = new ListNode(4);
//        oneA.next = oneB;
//        oneB.next = oneC;
//        oneC.next = oneD;
//
//        ListNode twoA = new ListNode(6);
//        twoA.next = oneC;
//        oneC.next = oneD;
//        getIntersectionNode(oneA, twoA);
        System.out.println(getMax(4));
    }

    public static int getMax(int num) {
        int max = 0;
        int result[] = new int[num + 1];
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }
        if (num == 3) {
            return 3;
        }
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;
        int temp = 0;
        for (int i = 4; i <= num; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                temp = result[j] * result[i - j];
                max = Math.max(max, temp);
                result[i] = max;
            }
        }
        return max;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode lenA = headA;
        ListNode lenB = headB;

        while (lenA != null) {
            lenA = lenA.next;
            lengthA++;
        }
        while (lenB != null) {
            lenB = lenB.next;
            lengthB++;
        }
        if (lengthA > lengthB) {
            for (int i = lengthB; i < lengthA; i++) {
                headA = headA.next;
            }
        } else if (lengthA < lengthB) {
            for (int i = lengthA; i < lengthB; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public static void a() {
        Exception e = new Exception("this is a log");
        e.printStackTrace();
    }

    public void sort(int[] one, int two[]) {
        if (one == null || one.length == 0 || two == null || two.length == 0) {
            return;
        }
        int oneAfter = one.length - 1;
        int twoHead = 0;
        while (oneAfter >= 0 && twoHead < two.length) {
            if (one[oneAfter] >= two[twoHead]) {
                swap(one, two, oneAfter, twoHead);
                oneAfter--;
                twoHead++;
            } else {
                break;
            }
        }
        sort(one);
        sort(two);
    }

    public void swap(int one[], int two[], int oneIndex, int twoIndex) {

    }

    public void sort(int array[]) {

    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
