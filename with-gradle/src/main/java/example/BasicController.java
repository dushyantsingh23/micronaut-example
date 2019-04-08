package example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/basic")
public class BasicController {

    @Get("/")
    public String index() {
        return HttpStatus.OK.toString();
    }
}