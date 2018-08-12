package warning_levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        Logger logger = new Logger(reader.readLine());

        while (!"END".equals(line = reader.readLine())) {
            String[] cmdArgs = line.split(": ");

            String level = cmdArgs[0];
            String message = cmdArgs[1];

            logger.log(level, message);
        }

        for (Message message : logger.getMessage()) {
            System.out.println(message);
        }
    }
}
