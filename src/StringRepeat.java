/**
 * Author: Vyacheslav Chernyshov
 * Date: 26.09.2018
 * Time: 20:25
 * e-mail: 2262288@gmail.com
 */
public class StringRepeat {

    public static void main(String[] args) {
        String sample = "(^_^) ";
        String blankSample = "";

        repeatSample(sample);
        repeatSampleZeroTimes(sample);
        repeatBlankSample(blankSample);
    }

    private static void repeatBlankSample(String blankSample) {
        String blankSampleResult = blankSample.repeat(10);
        System.out.println("blank sample result length: " + blankSampleResult.length());
    }

    private static void repeatSampleZeroTimes(String sample) {
        String blank = sample.repeat(0);
        System.out.println("blank length: " + blank.length());
    }

    private static void repeatSample(String sample) {
        String multiple = sample.repeat(10);
        System.out.println("multiple: " + multiple);
    }
}
