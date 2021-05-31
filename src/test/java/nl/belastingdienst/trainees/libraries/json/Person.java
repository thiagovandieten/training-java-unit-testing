package nl.belastingdienst.trainees.libraries.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
