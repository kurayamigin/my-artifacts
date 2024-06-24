package my.artifacts.cqrs.abstractions;

public interface ISubscriber {

    void receive(String message);
}
