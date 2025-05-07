package dev.openfeature.demo.java.demo;

import dev.openfeature.sdk.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    @GetMapping("/")
    public FlagEvaluationDetails<String> helloWorld(@RequestParam(required = false) String language) {
        Client client = OpenFeatureAPI.getInstance().getClient();
        HashMap<String, Value> attributes = new HashMap<>();
        attributes.put("language", new Value(language));
        return client.getStringDetails("greetings", "Hello World",
                new ImmutableContext(attributes));
    }
}
