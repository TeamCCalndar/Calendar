package Calendar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Korvin on 24.05.2014.
 */
public class EventImplementation implements Resource{

    private ArrayList<Event> events;
    public ArrayList<Event> getEvents() {
        return this.events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Event> findEventsByName(String s){
        ArrayList<Event> events = this.getEvents();
        ArrayList<Event> result = new ArrayList<Event>();

        for(Event event : events){
            if(event.getTitle().contains(s)) {
                result.add(event);
            }
        }

        return result;
    }


    public ArrayList<Event> findEventsByAttender(String s){
        ArrayList<Event> events = this.getEvents();
        ArrayList<Event> result = new ArrayList<Event>();

        for(Event event : events){
            if(event.getAttenders().contains(s)) {
                result.add(event);
            }
        }

        return result;
    }
}

