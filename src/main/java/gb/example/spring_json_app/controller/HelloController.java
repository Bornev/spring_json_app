package gb.example.spring_json_app.controller;

import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, world!");
        response.put("status", "success");
        return response;
    }

    @PostMapping("/greet")
    public Map<String, String> greetUser(@RequestBody Map<String, String> requestBody) {
        String name = requestBody.get("name");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        response.put("status", "success");
        return response;

    }
    @PutMapping("/update")
    public Map<String, String> updateGreeting(@RequestBody Map<String, String> requestBody) {
        String newMessage = requestBody.get("message");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greeting updated to: " + newMessage);
        response.put("status", "success");
        return response;
    }

    @DeleteMapping("/delete")
    public Map<String, String> deleteGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greeting deleted");
        response.put("status", "success");
        return response;
    }
}