package easy;

import java.util.Arrays;

public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        // Duyệt mảng
        for (int i = 1; i < strs.length; i++)
            // Kiểm tra các giá trị của i tăng dần với giá trị đầu của
            while (strs[i].indexOf(prefix) != 0) {
                // 
                prefix = prefix.substring(0, prefix.length() - 1);
                // Nếu rỗng
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] v) {
        // Giống String nhưng sẽ nhẹ hơn và tăng tốc chạy hơn giảm tiêu hao 
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        //Phần tử đầu mảng
        String first = v[0];
        // phần tử cuối mảng
        String last = v[v.length - 1];
        // Duyệt mảng với giới hạn vòng lặp bằng với 
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
 
            // Nếu giá trị ngang hàng của phần tử đầu và phần tử cuối khác nhau 
            if (first.charAt(i) != last.charAt(i)) {
                //
                return ans.toString();
            }
            // Trả về giá trị trùng 
            ans.append(first.charAt(i));
        }
        // Kế quả cuối cùng
        return ans.toString();
    }


    public String longestCommonPrefix3(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Sort the array of strings
        Arrays.sort(strs);
        // Compare the first and last strings in the sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] str1 = { "flower", "flow", "flight" };
        String[] str2 = { "dog", "racecar", "car" };       
        String[] str3 = { "dogg", "dogg", "dg" };
 

        System.out.println(longestCommonPrefix2(str1));
        System.out.println();
        System.out.println(longestCommonPrefix2(str2));
        System.out.println();
        System.out.println(longestCommonPrefix2(str3));

    }
}
