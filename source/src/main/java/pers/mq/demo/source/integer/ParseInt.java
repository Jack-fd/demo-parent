package pers.mq.demo.source.integer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-01
 * Time: 下午1:44
 */
public class ParseInt {

    public static Integer parseInt(String s, int radix) {
        boolean negative = false;
        int i = 0;
        int result = 0;
        if (s != null && s.length() > 0) {
            if (s.charAt(i) == '-') {
                negative = true;
                i++;
            }
            while (i < s.length()) {
                result *= radix;
                result += Character.digit(s.charAt(i++), radix);
            }
        }
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("-12", 10));
    }
}
