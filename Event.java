import java.util.ArrayList;

public class Event {
    private String eventName;
    private String eventDate;
    private ArrayList<Participant> participants;
    private ArrayList<Schedule> schedules;

    public Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.participants = new ArrayList<Participant>();
        this.schedules = new ArrayList<Schedule>();
    }

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }

    public void addParticipant(String name, String email, String password, String registrationId) {
        Participant participant = new Participant(name, email, password);
        this.participants.add(participant);
    }

    public void addSchedule(Schedule schedule) {
        this.schedules.add(schedule);
    }

    public void addSchedule(String topic, String startTime, String endTime, Speaker speaker) {
        Schedule schedule = new Schedule(topic, startTime, endTime, speaker);
        this.schedules.add(schedule);
    }

    public void printEventDetail() {
        System.out.println("Nama event: " + this.eventName);
        System.out.println("Tanggal event: " + this.eventDate);
        System.out.println("\nPartisipan:");

        for (Participant participant : this.participants) {
            System.out.println("- " + participant.getName());
        }

        System.out.println("\nJadwal: ");

        for (Schedule schedule : this.schedules) {
            System.out.println("- Topik: " + schedule.getTopic() +
                    " | Waktu: " + schedule.getStartTime() + " - " + schedule.getEndTime() + " | Pemateri: "
                    + schedule.getSpeaker().getName());
        }
    }

    public void printAllTickets() {
        for (Participant participant : this.participants) {
            participant.printTicket();
        }

        for (Schedule schedule : this.schedules) {
            schedule.getSpeaker();
        }
    }
}