package anurag.LinkedList.org;

public class Q5 {

	public LNode addRevOrder(LNode l1, LNode l2) {
		int carry = 0;
		LNode l3 = null;
		LNode sumHead = null;
		while (l1 != null && l2 != null) {
			int x = l1.value + l2.value + carry;
			int sum = 0;
			if (x > 9) {
				sum = x % 10;
				carry = 1;
			} else {
				sum = x;
				carry = 0;
			}

			LNode newNode = new LNode(sum);
			if (l3 != null) {
				l3.next = newNode;
				l3 = newNode;
			} else {
				l3 = newNode;
				sumHead = l3;
				newNode.next = l3;

			}

			l1 = l1.next;
			l2 = l2.next;
		}

		return sumHead; // Remove
	}

	public LNode addOrder(LNode l1, LNode l2) {

		int len1, len2;
		LNode t1 = l1;
		LNode t2 = l2;
		LNode ret = null;

		len1 = getLength(l1);
		len2 = getLength(l2);
		int sum1 = 0, sum2 = 0, sum3 = 0;

		while (len1 != 0) {

			sum1 += l1.value * Math.pow(10, len1 - 1);
			// System.out.println("Sum1="+sum1+"Length="+len1);
			len1--;
			l1 = l1.next;
		}

		while (len2 != 0) {
			sum2 += l2.value * Math.pow(10, len2 - 1);
			len2--;
			l2 = l2.next;
		}
		sum3 = sum1 + sum2;
		int maxLen = Math.max(getLength(t1), getLength(t2));
		if (Math.floor(sum3 / Math.pow(10, maxLen)) > 0)
			maxLen = maxLen + 1;

		LNode sumHead = null;
		while (maxLen > 0) {
			int x = (int) (sum3 / (Math.pow(10, maxLen - 1)));
			sum3 = (int) (sum3 - (Math.pow(10, maxLen - 1) * x));

			LNode newNode = new LNode(x);
			if (sumHead != null) {
				sumHead.next = newNode;
				sumHead = newNode;
			} else {
				sumHead = newNode;
				ret = sumHead;
				newNode.next = sumHead;

			}
			maxLen--;
		}

		return ret; // remove
	}

	private int getLength(LNode l) {

		int len = 0;
		while (l != null) {
			l = l.next;
			len++;
		}
		return len;
	}

	public static void main(String[] args) {

		Q5 obj = new Q5();
		LNode l1 = new LNode(6);
		l1.next = new LNode(0);
		l1.next.next = new LNode(0);

		LNode l2 = new LNode(6);
		l2.next = new LNode(0);
		l2.next.next = new LNode(0);

		LNode sum = obj.addOrder(l1, l2);
		System.out.println("Sum1 in Reverse order");
		while (sum != null) {
			System.out.print(sum.value);
			if (sum.next != null)
				System.out.print("->");
			sum = sum.next;
		}

	}
}