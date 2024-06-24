package my.artifacts.utils;


import com.google.gson.Gson;

public class GsonUtils {
    private static final Gson gson = new Gson();

    public static <T> T fromJson(String json, Class<T> t) {
        return gson.fromJson(json, t);
    }
}
