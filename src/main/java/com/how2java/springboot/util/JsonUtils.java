package com.how2java.springboot.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gcy
 * @date 2019/10/22
 */
public class JsonUtils {

    /**
     *   定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     *
     * @param data
     * @return
     */
    public static String beanToJson(Object data) throws JsonProcessingException {
        return MAPPER.writeValueAsString(data);
    }

    /**
     * 将json结果集转化为对象, readValue转化的对象不包含List,Set等集合. 不包含数组
     *
     * @param jsonData json数据
     * @param clazz    对象中的object类型
     * @return
     */
    public static <T> T jsonToBean(String jsonData, Class<T> clazz) throws IOException {
        return MAPPER.readValue(jsonData, clazz);
    }

    /**
     * 将json数据转换成pojo对象list
     * <p>Title: jsonToList</p>
     * <p>Description: </p>
     *
     * @param jsonData
     * @param beanType - 是集合的泛型类型. 集合类型固定为List.
     * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) throws IOException {
        // JavaType是Jackson中定义的用于描述java类型的中间变量.
        // constructParametricType - 构造一个集合List类型的JavaType对象, 泛型是beanType类型.
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        return MAPPER.readValue(jsonData, javaType);
    }

    public static void main(String[] args) {

    }

    /**
     * json转map
     * @param json
     * @return
     */
    public static Map<String,Object> json2map(String json){
        //json转map<String,String>
        HashMap<String,Object> map = null;
        try {
            map = MAPPER.readValue(json, HashMap.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
