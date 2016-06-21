import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class GetContentsResourceFile {

    public static JSONObject getResourceAsJSONArray(String filepath) throws URISyntaxException, IOException {
        URI path = GetContentsResourceFile.class.getResource(filepath).toURI();
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String jsonString = new String(encoded, StandardCharsets.UTF_8);
        return new JSONObject(jsonString);
    }
}
