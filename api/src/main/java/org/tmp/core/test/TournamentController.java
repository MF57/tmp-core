package org.tmp.core.test;

import org.axonframework.commandhandling.GenericCommandMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tmp.core.test.tournamentRequest.TournamentRequest;

/**
 * Created by mf57 on 31.12.2016.
 */
@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {



    @RequestMapping(method = RequestMethod.POST)
    public Boolean create(@RequestBody TournamentRequest tournamentRequest) {
        System.out.println(tournamentRequest.getName());
       return true;
    }
}
