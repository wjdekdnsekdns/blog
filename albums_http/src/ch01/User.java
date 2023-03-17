package ch01;

import java.util.LinkedHashMap;
import java.util.Map;

public class User {

public Integer userId;
public Integer id;
public String title;
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}