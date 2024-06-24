package my.artifacts.cqrs.abstractions;

public interface IQuery<TKey> {
    TKey getId();
    void setId(TKey id);
}