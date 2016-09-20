package PatternsTask.Tools;

/**
 * Class is used for operations with string (parsing, converting etc).
 */

public class StringTools {

    //Method is used to extract number of items(placed near filter name) in String format and to convert found String prices to Integer
    public static int getItemsNumberFromFilterName(String filterNameWithNumber) {
        int beginIndex = 0;
        int endIndex = filterNameWithNumber.length() - 1;
        int i = 0;
        //Extracting number that is placed between (). Right ')' has last index.
        //To find left '(' perform below loop
        for (char c : filterNameWithNumber.toCharArray()) {
            i++;
            if (c == '(')
                beginIndex = i;
        }
        //Converting extracted number from String format to integer using wrapper
        String number = filterNameWithNumber.substring(beginIndex, endIndex);
        return Integer.parseInt(number);
    }

    // Method is used to extract just price value without '$' in Double format
    public static double convertPriceToNumber(String priceStr) {
        int beginIndex = priceStr.indexOf("$") + 1;
        priceStr = priceStr.substring(beginIndex);
        return Double.parseDouble(priceStr);
    }
}
