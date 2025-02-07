package util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class locatorReader {
    private JsonObject locators;

    public locatorReader(List<String> filePaths) {
        locators = new JsonObject();

        for (String filePath : filePaths) {
            try (FileReader reader = new FileReader(filePath)) {
                JsonObject fileLocators = JsonParser.parseReader(reader).getAsJsonObject();
                for (String key : fileLocators.keySet()) {
                    locators.add(key, fileLocators.get(key));
                }
            } catch (IOException e) {
                throw new RuntimeException("Failed to load locators from file: " + filePath, e);
            }
        }
    }

    public String getLocatorType(String elementName) {
        if (locators.has(elementName)) {
            return locators.getAsJsonObject(elementName).get("locatorType").getAsString();
        }
        throw new RuntimeException("Element not found: " + elementName);
    }

    public String getLocatorValue(String elementName) {
        if (locators.has(elementName)) {
            return locators.getAsJsonObject(elementName).get("locatorValue").getAsString();
        }
        throw new RuntimeException("Element not found: " + elementName);
    }


}
