import java.time.LocalDateTime;

public class Message {
    private final String message;
    private final String from;
    private final String to;
    private final LocalDateTime date;

    public Message(String message, String from, String to, LocalDateTime date) {
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
