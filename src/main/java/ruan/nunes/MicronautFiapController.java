package ruan.nunes;

import io.micronaut.http.annotation.*;

@Controller("/micronaut-fiap")
public class MicronautFiapController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}