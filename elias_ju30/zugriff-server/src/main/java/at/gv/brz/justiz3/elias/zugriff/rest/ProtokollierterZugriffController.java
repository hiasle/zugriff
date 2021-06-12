package at.gv.brz.justiz3.elias.zugriff.rest;

import at.gv.brz.justiz3.elias.zugriff.db.entity.ProtokollierterZugriff;
import at.gv.brz.justiz3.elias.zugriff.db.repo.ProtokollierterZugriffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@CrossOrigin
@RestController
public class ProtokollierterZugriffController {

    private static final Logger log = LoggerFactory.getLogger(ProtokollierterZugriffController.class);

    @Autowired
    private ProtokollierterZugriffRepository protokollierterZugriffRepository;

    @GetMapping("/zugriff")
    public List<ProtokollierterZugriff> zugriffs() {
        Iterable<ProtokollierterZugriff> all = this.protokollierterZugriffRepository.findAll();
        List<ProtokollierterZugriff> result = new ArrayList<>();
        Iterator<ProtokollierterZugriff> iterator = all.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        log.info("Get all ProtokollierteZugriff retrieved {} entries: [{}]", result.size(), result);
        return result;
    }

    @PostMapping(path = "/zugriff", consumes = "application/json", produces = "application/json")
    public void addProtokollierterZugriff(@RequestBody ProtokollierterZugriff protokollierterZugriff) {
        ProtokollierterZugriff result = this.protokollierterZugriffRepository.save(protokollierterZugriff);
        log.info("Post ProtokollierteZugriff was stored: [{}]", result);
    }

}
