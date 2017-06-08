package com.gmh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gmh on 2017/6/7 0007.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/merge/{key}/{value}")
    public String merge(@PathVariable("key") String key, @PathVariable("value") String value){
        try{
            ValueOperations<String, String> ops = redisTemplate.opsForValue();

            Boolean bool =  redisTemplate.hasKey(key);
            System.out.println(bool);
            if (!bool){
                ops.set(key, value);
                return "Add";
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Update";
    }

    @GetMapping("/delete/{key}")
    public String merge(@PathVariable("key") String key){
        try{
            ValueOperations<String, String> ops = redisTemplate.opsForValue();

            Boolean bool =  redisTemplate.hasKey(key);
            System.out.println(bool);
            if (bool){
                redisTemplate.delete(key);
                return "Delete";
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Not Delete";
    }



}
