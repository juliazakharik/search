package read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader extends Reader {
    public FileReader(String s) {

    }

    public static List<String> readFile(String path) throws IOException {
        Path filePath = Paths.get(path);
        List<String> contentOfTheFile = new ArrayList<>();
        try {
            contentOfTheFile = Files.readAllLines(filePath,
                    Charset.defaultCharset());
            return contentOfTheFile;
        } catch (IOException e) {
            //Handle exception here
        }

        return contentOfTheFile;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
