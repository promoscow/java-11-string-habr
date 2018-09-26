/**
 * Author: Vyacheslav Chernyshov
 * Date: 26.09.18
 * Time: 22:39
 * e-mail: 2262288@gmail.com
 */
public class StringLines {

    public static void main(String[] args) {

        String lines = "Blind Text Generator is a useful tool\n" +
                "which provides Lorem Ipsum and a number of alternatives.\n" +
                "The number of characters, words, and paragraphs\n" +
                "are easily controlled and you can set \n" +
                "the font to appreciate how it’ll look in your design.";

        lines
                .lines()
                .map(l -> "next line: " + l)
                .forEach(System.out::println);
    }
}
