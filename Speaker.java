public class Speaker extends Person implements Printable {
    private String topic;

    public Speaker(String name, String email, String password, String topic) {
        super(name, email, password);
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void printTicket() {
        System.out.println("Tiket untuk Speaker: " + this.name + " | Topic: " + this.topic);
    }
}