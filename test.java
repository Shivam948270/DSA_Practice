
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class test {

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void pal(int num) {
        int rev = 0;
        int check = num;
        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        System.out.println(check == rev ? "palindrome" : "not Palindrome");
    }

    public static void count(String s) {
        String[] w = s.split(" ");
        int count = 0;
        for (String o : w) {
            count++;
        }
        System.out.println(count);

    }

    public static void countwordwithoutsplit(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '/') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int largest(int[] ar) {
        int larg = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > larg) {
                larg = ar[i];
            }
        }
        return larg;
    }

    public static int sum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void evenodd(int[] ar) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("even " + even + " odd " + odd);
    }

    public static int secondLargest(int[] ar) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : ar) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }
        return second;
    }

    public static void pairSum(int[] ar, int t) {
        int left = 0, right = ar.length - 1;

        while (left < right) {
            int sum = ar[left] + ar[right];

            if (sum == t) {
                System.out.println(ar[left] + " " + ar[right]);
                left++;
                right--;
            } else if (sum < t) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static int maxsum(int[] ar, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += ar[i];
        }
        int msxsum = sum;
        for (int i = k; i < ar.length; i++) {
            sum = sum + ar[i] - ar[i - k];
            msxsum = Math.max(msxsum, sum);
        }
        return msxsum;
    }

    public static int[] stockSpan(int[] ar) {

        int n = ar.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && ar[stack.peek()] <= ar[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void maxone(int[] ar) {
        int left = 0;
        int count = 0;
        int max = 0;
        for (int right = 0; right < ar.length; right++) {
            if (ar[right] == 0) {
                count++;
            }
            while (count > 0) {
                if (ar[left] == 0) {
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
    }

    public static int maxsumsubarray(int[] ar, int k) {
        int left = 0;
        int max = 0;
        int sum = 0;
        for (int right = 0; right < ar.length; right++) {
            sum += ar[right];

            while (sum > k) {
                sum -= ar[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static int longestSubstringKDistinct(String s, int k) {
        int left = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            System.out.println(s.substring(left, right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int[] slidingWindowMax(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                res[i - k + 1] = arr[dq.peekFirst()];
            }
        }

        return res;
    }

    public static void longestdistinctstring(String s) {
        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(right);
                left++;

            }
            set.add(s.charAt(left));
            max = Math.max(max, right - left + 1);
        }
    }

    public static void nge(int[] ar) {
        int[] r = new int[ar.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = ar.length - 1; i <= 0; i--) {
            while (!stack.isEmpty() && ar[stack.peek()] <= ar[i]) {
                stack.pop();
            }
            r[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }

    public static void ngs(int[] ar) {
        int[] r = new int[ar.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = ar.length - 1; i <= 0; i--) {
            while (!stack.isEmpty() && ar[stack.peek()] >= ar[i]) {
                stack.pop();
            }
            r[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }

    public static int streak(int[] ar, int k) {
        int streak = 0;
        int current = 0;
        HashMap<Integer, Integer> mp = new HashMap();
        mp.put(0, 1);
        for (int i = 0; i < ar.length; i++) {
            current += ar[i];
            if (mp.containsKey(current - k)) {
                streak += mp.get(current - k);
            }
            mp.put(current, mp.getOrDefault(current, 0) + 1);
        }
        return streak;
    }
    public static boolean isValid(String s) {
    Stack<Character> st = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            st.push(c);
        } else {
            if (st.isEmpty()) return false;

            char top = st.pop();
            if ((c == ')' && top != '(') ||
                (c == '}' && top != '{') ||
                (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    return st.isEmpty();
}
    public static int largestRectangle(int[] heights) {
    Stack<Integer> st = new Stack<>();
    int max = 0;

    for (int i = 0; i <= heights.length; i++) {
        int h = (i == heights.length) ? 0 : heights[i];

        while (!st.isEmpty() && h < heights[st.peek()]) {
            int height = heights[st.pop()];
            int width = st.isEmpty() ? i : i - st.peek() - 1;
            max = Math.max(max, height * width);
        }
        st.push(i);
    }
    return max;
}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            }
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || s.length() == 0 || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        Map<String, Integer> wordMap = new HashMap<>();
        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int count = 0;
            Map<String, Integer> windowMap = new HashMap<>();

            for (int j = i; j + wordLen <= s.length(); j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (wordMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (windowMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == totalWords) {
                        result.add(left);
                    }

                } else {
                    windowMap.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }
        


    public static void main(String[] args) {
test.swap(2,4);
test.fib(20);
test.pal(121);
test.countwordwithoutsplit("java is very fun language,hello my name is shivam jain");
       int ar[] = {2, 3, 5, 3, 2, 4, 5, 6, 6, 33, 4, 5, 66, 7};
      int[] m= test.slidingWindowMax(ar, 1);
      for(int n:m){
          System.out.println(n);
      }
    }

}


