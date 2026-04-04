package extractor;

import java.util.*;
import java.util.regex.*;

public class CodePatternExtractor {

    private final Pattern methodPattern;
    private final Pattern codePattern;

    public CodePatternExtractor(Pattern methodPattern, Pattern codePattern) {
        this.methodPattern = methodPattern;
        this.codePattern = codePattern;
    }

    public Set<String> extract(String content) {
        Set<String> result = new TreeSet<>();

        Matcher blockMatcher = methodPattern.matcher(content);

        while (blockMatcher.find()) {
            String inside = blockMatcher.group(1);

            Matcher codeMatcher = codePattern.matcher(inside);

            String lastCode = null;
            while (codeMatcher.find()) {
                lastCode = codeMatcher.group(1);
            }

            if (lastCode != null) {
                result.add(lastCode);
            }
        }

        return result;
    }
}
