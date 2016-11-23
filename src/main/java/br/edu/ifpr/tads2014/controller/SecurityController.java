package br.edu.ifpr.tads2014.controller;

import br.edu.ifpr.tads2014.persist.entity.Token;
import br.edu.ifpr.tads2014.persist.entity.User;
import br.edu.ifpr.tads2014.persist.repo.TokenRepo;
import br.edu.ifpr.tads2014.persist.repo.UserRepo;
import br.edu.ifpr.tads2014.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SecurityController {


    @Autowired
    private UserRepo userRepo;


    @Autowired
    private TokenRepo tokenRepo;

    @RequestMapping(value = "/security/account", method = RequestMethod.GET)
    public @ResponseBody
    User getUserAccount()  {
        User user = userRepo.findByLogin(SecurityUtils.getCurrentLogin());
        user.setPassword(null);
        return user;
    }


    @PreAuthorize("hasAuthority('admin')")
    @RequestMapping(value = "/security/tokens", method = RequestMethod.GET)
    public @ResponseBody
    List<Token> getTokens () {
        List<Token> tokens = tokenRepo.findAll();
        for(Token t:tokens) {
            t.setSeries(null);
            t.setValue(null);
        }
        return tokens;
    }



}
