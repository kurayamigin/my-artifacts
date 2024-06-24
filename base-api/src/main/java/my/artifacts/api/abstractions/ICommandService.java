package my.artifacts.api.abstractions;

import com.github.fge.jsonpatch.JsonPatch;
import my.artifacts.cqrs.abstractions.ICommand;
import org.springframework.web.server.ResponseStatusException;

public interface ICommandService<TCommand extends ICommand, TKey> {
    TKey create(TCommand command);
    void delete(TKey id) throws ResponseStatusException;
    void patch(TKey id, JsonPatch patch) throws ResponseStatusException;
}
