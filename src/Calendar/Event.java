package Calendar;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Korvin-pc on 5/20/2014.
 */
public class Event {
    private final UUID id;
    private final String title;
    private final String description;
    private final Date startDate;
    private final Date endDay;
    private final List<String> attenders;

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDay() {
        return endDay;
    }

    public List<String> getAttenders() {
        return attenders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (attenders != null ? !attenders.equals(event.attenders) : event.attenders != null) return false;
        if (description != null ? !description.equals(event.description) : event.description != null) return false;
        if (endDay != null ? !endDay.equals(event.endDay) : event.endDay != null) return false;
        if (id != null ? !id.equals(event.id) : event.id != null) return false;
        if (startDate != null ? !startDate.equals(event.startDate) : event.startDate != null) return false;
        if (title != null ? !title.equals(event.title) : event.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDay != null ? endDay.hashCode() : 0);
        result = 31 * result + (attenders != null ? attenders.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDay=" + endDay +
                ", attenders=" + attenders +
                '}';
    }

    private Event(Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.startDate = builder.startDate;
        this.endDay = builder.endDay;
        this.attenders = builder.attenders;
    }

    public static class Builder {
        private UUID id;
        private String title;
        private String description;
        private Date startDate;
        private Date endDay;
        private List<String> attenders;

        public Builder(){

        }

        public Builder (Event original) {
            this.id = original.id;
            this.title = original.title;
            this.description = original.description;
            this.startDate = original.startDate;
            this.endDay = original.endDay;
            this.attenders = original.attenders;
        }

        public Builder id(UUID id){
            this.id = id;
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder firstName(Date startDate){
            this.startDate = startDate;
            return this;
        }

        public Builder endDay(Date endDay){
            this.endDay = endDay;
            return this;
        }

        public Builder attenders(List<String> attenders){
            this.attenders = attenders;
            return this;
        }


        public Event build() { return new Event(this);}
    }
}
