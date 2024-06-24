package my.artifacts.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import org.aspectj.bridge.ICommand;

public class RestPatchUtils {

    public static <T extends ICommand> T apply(JsonPatch patch, T command) throws JsonProcessingException, JsonPatchException {
        ObjectMapper mapper = ApplicationContextProvider.getContext().getBean(ObjectMapper.class);
        JsonNode patched = patch.apply(mapper.convertValue(command, JsonNode.class));
        return (T) mapper.treeToValue(patched, command.getClass());
    }
}
