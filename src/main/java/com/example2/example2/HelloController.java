package com.example2.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/myExample")
public class HelloController {

    @Autowired
    private Girls girlExam;

    /*@RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
    public String say(){
        return girlExam.getCuSize();
    }*/

    /*@RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:"+id;
    }*/

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(@RequestParam(value="id",required=false,defaultValue = "0") Integer id){
        return "id:"+id;
    }
}
