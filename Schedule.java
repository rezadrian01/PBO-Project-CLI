public class Schedule {
    private String topic;
    private String startTime;
    private String endTime;
    private Speaker speaker;

    public Schedule(String topic, String startTime, String endTime, Speaker speaker) {
        this.topic = topic;
        this.startTime = startTime;
        this.endTime = endTime;
        this.speaker = speaker;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Speaker getSpeaker() {
        return this.speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}