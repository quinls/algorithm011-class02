import java.util.Arrays;

/**
 * 242. 有效的字母异位词
 *
 * @author akun
 * @date 2020/7/5
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

}
