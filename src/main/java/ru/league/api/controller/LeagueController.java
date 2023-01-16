package ru.league.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.league.api.domain.LoginInfo;
import ru.league.api.domain.UserInfo;
import ru.league.api.exceptions.InvalidUserbaneException;

import java.util.Date;

@RestController
public class LeagueController {

    @PostMapping("user/login")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {
        if (loginInfo.getUserName().equals("Yaroslav")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();
        } else {
            throw new InvalidUserbaneException();
        }
    }

}
