package com.test.stringManipulation.controller;

import com.test.stringManipulation.model.JsonModel;
import com.test.stringManipulation.repository.JsonModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/json")
public class JsonController {

    @Autowired
    private JsonModelRepository jsonModelRepository;

    private String jsonModel = "{\"menu\": {\"id\": \"file\",\"value\": \"File\",\"popup\": {\"menuitem\": [{\"value\": \"New\", \"onclick\": \"CreateDoc()\"},{\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},{\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}]}}}";

    @PostMapping("/manipulate")
    public String manipulateJson(@RequestParam String inputs) {
        // Parse inputs and create a map of replacements
        Map<String, String> replacements = parseInputs(inputs);

        // Replace values in the JSON model
        String modifiedJsonModel = replaceValuesInJson(jsonModel, replacements);

        // Save the modified JSON model to the database
        JsonModel model = new JsonModel(modifiedJsonModel);
        jsonModelRepository.save(model);

        // Return the modified JSON model
        return modifiedJsonModel;
    }

    private Map<String, String> parseInputs(String inputs) {
        Map<String, String> replacements = new HashMap<>();
        String[] pairs = inputs.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":::");
            if (keyValue.length == 2) {
                replacements.put(keyValue[0], keyValue[1]);
            }
        }
        return replacements;
    }

    private String replaceValuesInJson(String json, Map<String, String> replacements) {
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            json = json.replace(entry.getKey(), entry.getValue());
        }
        return json;
    }
}
