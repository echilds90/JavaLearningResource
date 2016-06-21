import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GetContentsResourceFileTest {

    @Test
    public void shouldGetJSONFromFile() throws IOException, URISyntaxException {
        JSONObject resourceAsJSONArray = GetContentsResourceFile.getResourceAsJSONArray("example.json");

        assertThat(resourceAsJSONArray.getInt("something"), is(1));
    }
}