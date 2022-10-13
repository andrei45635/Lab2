public class MessageTask extends Task {
    private final Message message;

    public MessageTask(String taskID, String description, Message message) {
        super(taskID, description);
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public void execute() {
        System.out.println(message.getMessage() + " " + message.getDate());
    }
}
