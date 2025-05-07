package dev.openfeature.demo.java.demo;

import dev.openfeature.contrib.hooks.otel.TracesHook;
import dev.openfeature.sdk.OpenFeatureAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		OpenFeatureAPI.getInstance().addHooks(new TracesHook());
		SpringApplication.run(DemoApplication.class, args);
	}

}
