package nl.belastingdienst.trainees.libraries.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class JSONTest {
    ObjectMapper mapper = new ObjectMapper();
    @Test
    public void name() throws JsonProcessingException {
        Person user = mapper.readValue("{\"name\": \"Thiago\"}", Person.class);
        System.out.println(user.getName());
    }
}
