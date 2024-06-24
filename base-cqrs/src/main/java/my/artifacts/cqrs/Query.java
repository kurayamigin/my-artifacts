package my.artifacts.cqrs;

import my.artifacts.cqrs.abstractions.IQuery;
import org.springframework.data.annotation.Id;

public abstract class Query<TKey> implements IQuery<TKey> {
    @Id
    private TKey id;

    public TKey getId() {
        return id;
    }

    public void setId(TKey id) {
        this.id = id;
    }
}
