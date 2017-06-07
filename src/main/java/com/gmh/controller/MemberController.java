package com.gmh.controller;

import com.gmh.entity.Member;
import com.gmh.service.MemberService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gmh on 2017/6/7 0007.
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/get/{id}")
    public String getMember(@PathVariable("id") Integer id){
        Member m = memberService.searchMember(id);
        Gson gson = new Gson();
        return gson.toJson(m);
    }
}
