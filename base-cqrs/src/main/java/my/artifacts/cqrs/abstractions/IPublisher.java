package my.artifacts.cqrs.abstractions;

import my.artifacts.cqrs.Event;

import java.util.Map;

public interface IPublisher {

    <TEvent extends Event> void send(TEvent event);
    <TEvent extends Event> void send(TEvent event, Map<String, Object> headers);
}
