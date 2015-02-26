package com.cricketism.scorer;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/points", method = RequestMethod.GET)
public class MainController {

    @RequestMapping(value = "/")
    public static DataPojo getPoints() throws IOException {
        while (!Cacher.state){}
        return Cacher.data;
    }
}