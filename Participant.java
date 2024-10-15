public class Participant extends Person implements Printable {
    public Participant(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void printTicket() {
        System.out.println("Tiket untuk peserta: " + this.name);
    }
}