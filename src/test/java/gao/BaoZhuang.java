package gao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.how2java.springboot.pojo.ConfigBean;
import com.how2java.springboot.pojo.ConfigBean2;
import com.how2java.springboot.util.JsonUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

/**
 * @author shkstart
 * @create 2020-04-29 20:31
 */
public class BaoZhuang {

    @Test
    public void demo(){
//        int i = 55;
//        int j = 55;
//        if(i==j){
//            System.out.println("000000000");
//        }else{
//            System.out.println("111111111");
//        }
        Integer x = 127;
        Integer y = 127;
        if(x==y){
            System.out.println("777777");
        }else{
            System.out.println("888888");
        }
    }

    @Test
    public void demo2(){
        Map<String,ConfigBean2> param = new HashMap<>();
        ConfigBean2 configBean2 = new ConfigBean2();
        configBean2.setConfigKey("aaa");
        configBean2.setConfigValue("1111");
        configBean2.setDescription("配置aaa");

        ConfigBean2 configBean3 = new ConfigBean2();
        configBean3.setConfigKey("bbb");
        configBean3.setConfigValue("2222");
        configBean3.setDescription("配置bbb");

        param.put("aaa",configBean2);
        param.put("bbb",configBean3);
        String json = "";
        try {
            json = JsonUtils.beanToJson(param);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        //json转map<String,String>
        Map<String, Object> mmap = JsonUtils.json2map(json);
//        System.out.println(mmap);

        String key = "aaa";
        String str = getConfig(mmap,key);
        System.out.println(str);
    }

    /**
     * 根据key值获得对应数值
     * @param param
     * @param key
     * @return
     */
    private String getConfig (Map<String, Object> param ,String key){
        LinkedHashMap configBeanMap = (LinkedHashMap)param.get(key);
        return (String)configBeanMap.get("configValue");
    }

    @Test
    public void demo5(){
        int i = 7;
        while (true){
            System.out.println(i);
            if(i == 5){
                System.out.println("跳出while循环");
                break;
            }
            i--;
        }
        System.out.println("结束");
    }

    @Test
    public void demo6(){
        Set<String> set = new HashSet<>();
        set.add("1111111111");
        set.add("2222222222");
        set.add("3333333333");
        set.add("4444444444");
        String str = "1111111111";
        if(set.contains(str)){
            System.out.println("777777777");
        }else{
            System.out.println("888888888");
        }
    }
}
