package my.artifacts.api.abstractions;

import my.artifacts.cqrs.abstractions.ICommand;
import my.artifacts.cqrs.abstractions.IQuery;
import my.artifacts.models.abstractions.IEntity;
import org.mapstruct.MappingTarget;

public interface IEntityPatcher<
        TEntity extends IEntity<TKey>,
        TKey,
        TCommand extends ICommand,
        TQuery extends IQuery<TKey>> {
    void patch(TCommand command, @MappingTarget TEntity entity);
    void patch(TQuery query, @MappingTarget TEntity entity);

}
