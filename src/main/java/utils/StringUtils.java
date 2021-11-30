package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public StringUtils() {
    }

    public static String getValueByRegEx(String text, String pattern) {
        int firstGroup = 0;
        return getValueByRegEx(text, pattern, firstGroup);
    }


    public static String getValueByRegEx(String text, String pattern, int group) {
        Pattern replacementPattern = Pattern.compile(pattern);
        Matcher matcher = replacementPattern.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                list.add(matcher.group(i));
            }
        }
        return !list.isEmpty() ? list.get(group) : null;
    }

}
