package extractor;

import java.util.regex.Pattern;

public class PatternConfig {

    public static Pattern methodPattern() {
        return Pattern.compile("executeTransaction\\s*\\((.*?)\\)", Pattern.DOTALL);
    }

    public static Pattern codePattern() {
        return Pattern.compile("\"([A-Z]{3,4}[0-9]{4}[A-Z][0-9]{3})\"");
    }
}
