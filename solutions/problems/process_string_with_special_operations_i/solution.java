import java.util.*;
class Solution {
    public String processStr(String s) {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (!a.isEmpty()) {
                    a.remove(a.size() - 1);
                }
            }
            else if (ch == '#') {
                if (!a.isEmpty()) {
                    a.add(a.get(a.size() - 1));
                }
            }
            else if (ch == '%') {
                Collections.reverse(a);
            }
            else {
                a.add(String.valueOf(ch));
            }
        }
     StringBuilder sb = new StringBuilder();

for (char ch : s.toCharArray()) {
    if (ch == '*') {
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
    } else if (ch == '#') {
        sb.append(sb.toString());   // duplicate the entire string
    } else if (ch == '%') {
        sb.reverse();
    } else {
        sb.append(ch);
    }
}

return sb.toString();}}