package extractor;

import java.io.*;

public class FileLoader {

    public static String load(String filePath) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("파일 읽기 실패: " + filePath, e);
        }

        return sb.toString();
    }
}
