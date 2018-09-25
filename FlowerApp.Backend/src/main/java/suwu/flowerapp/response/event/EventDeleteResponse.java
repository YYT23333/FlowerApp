package suwu.flowerapp.response.event;

import suwu.flowerapp.response.Response;

public class EventDeleteResponse extends Response {
    private int eventId;

    public EventDeleteResponse() {
    }

    public EventDeleteResponse(int eventId) {
        this.eventId = eventId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
