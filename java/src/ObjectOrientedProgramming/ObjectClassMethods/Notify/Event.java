package ObjectOrientedProgramming.ObjectClassMethods.Notify;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EventDispatcher {
    private List<EventListener> listeners;

    public EventDispatcher() {
        listeners = new ArrayList<>();
    }

    public synchronized void registerListener(EventListener listener) {
        listeners.add(listener);
    }

    public synchronized void fireEvent(Event event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }

        notify(); // Сповіщення одного очікуваного потоку
    }
}

class EventListener {
    public synchronized void onEvent(Event event) {
        System.out.println("Оброблено подію: " + event.getName());
    }
}

class Main {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        EventListener listener = new EventListener();

        dispatcher.registerListener(listener);

        Event event = new Event("Подія 1");
        dispatcher.fireEvent(event);
    }
}
