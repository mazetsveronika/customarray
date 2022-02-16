package by.mazets.java.array.parser;


public class CustomArrayParserImpl implements CustomArrayParser {

    private static final String DELIMITER = "\\s";

    @Override
    public int[] parseStrToIntArray(String arrayStr) {

        String[] numbersStr = arrayStr.split(DELIMITER);
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        return numbers;
    }
}
