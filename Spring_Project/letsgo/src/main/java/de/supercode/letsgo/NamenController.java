
package de.supercode.letsgo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * NamenController
 */
@RestController
@RequestMapping("/api")
public class NamenController {

    Namen namen;

    public NamenController(Namen namen) {
        this.namen = namen;
    }

    @GetMapping("/namen")
    public ArrayList<String> getNamens() {
        return namen.getNamen();
    }

    @PostMapping("/namen")
    public void addName() {
        namen.getNamen().add("Yan");
    }

   
    @PostMapping("/namen/{name}")
    public void addNeueName(@PathVariable String name) {
        namen.getNamen().add(name);
    }

}