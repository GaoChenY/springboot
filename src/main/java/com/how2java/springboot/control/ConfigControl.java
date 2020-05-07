package com.how2java.springboot.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.how2java.springboot.util.ByteUtil;
import com.how2java.springboot.util.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gcy
 * @create 2020-04-29 17:30
 */
@RestController
@RequestMapping("/config/")
public class ConfigControl {

    @RequestMapping("show")
    public byte[] show(){
        Map<String,String> result = new HashMap<>(8);
        result.put("resource.black.white.judge.path","");
        result.put("net.domain.info.path","");
        result.put("data.dictionary.info.path","");
        result.put("access.external.goldbank.contextPath","");
        String json = null;
        try {
            json ="%" + JsonUtils.beanToJson(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("json to error");
        }
        byte[] bytes = json.getBytes();
        System.out.println(bytes);
        int i = ByteUtil.byte2int_le(bytes,4);
        System.out.println(i);
        return bytes;
    }

    public static void main(String[] args) {
        Map<String,String> result = new HashMap<>(8);
        result.put("resource.black.white.judge.path","7777");
        result.put("net.domain.info.path","8888");
        result.put("data.dictionary.info.path","999");
        result.put("access.external.goldbank.contextPath","0000");
        String json = null;
        try {
            json = "%"+JsonUtils.beanToJson(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("json to error");
        }
        byte[] bytes = json.getBytes();

        System.out.println(bytes.toString());
        String str = ByteUtil.byte2DecimalStr(bytes);
        System.out.println(str);
        String bystr = new String(bytes);
        System.out.println(bystr);

    }
}
