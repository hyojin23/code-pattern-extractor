package extractor;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CodePatternExtractor extractor =
                new CodePatternExtractor(
                        PatternConfig.methodPattern(),
                        PatternConfig.codePattern()
                );

        System.out.println("파일 경로를 입력하세요 (종료: 빈 줄)");

        while (true) {
            String path = sc.nextLine();
            if (path.isEmpty()) break;

            String content = FileLoader.load(path);
            Set<String> result = extractor.extract(content);

            System.out.println("=== 추출 결과 ===");
            result.forEach(System.out::println);
            System.out.println();
        }
    }
}
