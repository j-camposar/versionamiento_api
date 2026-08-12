package java.com.versionamiento.version;
import org.springframework.we.bind.annotation.*;


@RestController
@RequestMapping ("/holaMundo/api")
public class VersionController {

    @GetMapping("/V1")
    public String saludo(){
        return "Hola Mundo";
    }
}
