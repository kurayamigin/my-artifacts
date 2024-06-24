package my.artifacts.api.abstractions;

import my.artifacts.cqrs.abstractions.ICommand;
import my.artifacts.cqrs.abstractions.IQuery;
import my.artifacts.models.abstractions.IEntity;

import java.util.List;

public interface IEntityMapper<
        TEntity extends IEntity<TKey>,
        TKey,
        TCommand extends ICommand,
        TQuery extends IQuery<TKey>> {

    TQuery toQuery(TEntity entity);
    TCommand toCommand(TEntity entity);
    TEntity toEntity(TCommand command);

    List<TQuery> toQuery(List<TEntity> entity);
    List<TCommand> toCommand(List<TEntity> entity);
    List<TEntity> toEntity(List<TCommand> command);

}
