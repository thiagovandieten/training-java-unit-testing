package nl.belastingdienst.trainees.util.properties;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:general.properties"})
public interface GeneralConfig extends Config {
//    @Key("username")
    String username();

//    @Key("email")
    String email();
}
