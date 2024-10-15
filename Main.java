public class Main {
    public static void main(String[] args) {
        // Create new Event
        Event event = new Event("Advance Java and Fundamental of Machine Learning", "21-10-2024");

        // Create speaker
        Speaker speaker1 = new Speaker("Alice", "alice@gmail.com", "password123", "Advanced Java");
        Speaker speaker2 = new Speaker("Bob", "bob@example.com", "admin#1234", "Fundamental of Machine Learning");

        // Create participant
        Participant participant1 = new Participant("Charlie", "charlie@yahoo.com", "charlie123");
        Participant participant2 = new Participant("David", "david@outlook.com", "password321");

        // Add participant to event
        event.addParticipant(participant1);
        event.addParticipant(participant2);

        event.addSchedule(new Schedule("Java Enterprise", "13.00", "17.00", speaker1));

        Schedule speaker2Schedule = new Schedule("What is Machine Learning", "17.00", "20.00", speaker2);
        event.addSchedule(speaker2Schedule);

        event.printEventDetail();
    }
}