package controller;

import model.EmployeeBody;
import model.EmployeeHeader;
import model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/employee/{id}")
    public Response getEmplooyeeById(@PathVariable int id) {
        return new Response(new EmployeeHeader(200),
                new EmployeeBody(id,
                        "Somkiat",
                        "Puisungnoen"));
    }

}
