/**
 * Author: Vyacheslav Chernyshov
 * Date: 26.09.2018
 * Time: 20:31
 * e-mail: 2262288@gmail.com
 */
public class StringStrip {
    private static final String OUTPUT_TEMPLATE = "<%s>";

    public static void main(String[] args) {

        String withSpaces = "     a     ";
        System.out.println("original: " + String.format(OUTPUT_TEMPLATE, withSpaces));

        strip(withSpaces);
        stripLeading(withSpaces);
        stripTrailing(withSpaces);
    }

    private static void stripTrailing(String withSpaces) {
        String trailing = withSpaces.stripTrailing();
        System.out.println("stripTrailing: " + String.format(OUTPUT_TEMPLATE, trailing));
    }

    private static void stripLeading(String withSpaces) {
        String leading = withSpaces.stripLeading();
        System.out.println("stripLeading: " + String.format(OUTPUT_TEMPLATE, leading));
    }

    private static void strip(String withSpaces) {
        String withoutSpaces = withSpaces.strip();
        System.out.println("strip: " + String.format(OUTPUT_TEMPLATE, withoutSpaces));
    }
}
