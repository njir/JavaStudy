import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Created by tak on 16. 9. 24.
 */
public class StringCalculator {
    private boolean isNull(String text){
        return (text == null) || (text.isEmpty());
    }

    public String[] spliter(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()){
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }
        else
            return text.split(",|:");
    }

    private int[] strArrayToIntArray(String[] strArray){
        return Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
    }

    int add(String text){
        if(isNull(text))
            return 0;
        String[] strNumbers = spliter(text);
        return IntStream.of(strArrayToIntArray(strNumbers)).sum();
    }
}
