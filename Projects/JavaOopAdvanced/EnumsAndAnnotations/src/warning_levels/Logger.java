package warning_levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private Importance level;
    private List<Message> messages;

    public Logger(String level) {
        this.level = Enum.valueOf(Importance.class, level.toUpperCase());
        this.messages = new ArrayList<>();
    }

    public void log(String importance, String message) {
        Importance level = Enum.valueOf(Importance.class, importance.toUpperCase());

        if (level.compareTo(this.level) >= 0) {
            this.messages.add(new Message(level, message));
        }
    }

    public Iterable<Message> getMessage() {
        return this.messages;
    }
}
