package com.example.controller;

import cn.hutool.core.util.PinyinUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("pinyin")
public class PinYinController {

    @RequestMapping("/initPinYinUtilIndex")
    public String initPinYinUtilIndex(){
        return "pinyin";
    }


    @RequestMapping("/tranceWordsToPinyin")
    public String tranceWordsToPinyin(HttpServletRequest request, Model model){
        String wordStr = request.getParameter("wordStr");
        String pinYin = PinyinUtil.getPinYin(wordStr);
        System.out.println(wordStr);
        System.out.println(pinYin);
        model.addAttribute("pinyin",pinYin);
        return "pinyin";
    }
}