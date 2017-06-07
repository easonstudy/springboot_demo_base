package com.gmh.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gmh on 2017/6/6 0006.
 */
@RestController
public class HelloController {

    /*@Autowired
    private GirlProperties girlProperties;*/

    @RequestMapping(value = {"/hello/{id}", "/hi/{id}"}, method = RequestMethod.GET)
    public String test(@PathVariable("id") Integer id){
        return "CupSize_1:" + "id:" + id;
    }

}