package rongqi.map;
import java.util.Date;
import java.util.ArrayList;

import com.how2java.springboot.pojo.Person;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shkstart
 * @create 2020-05-05 15:47
 */
public class MapTest {

    @Test
    public void demo(){
        Map<Object,Object> map = new HashMap<>();
        Person person = new Person();
        person.setAge(18);
        person.setLastName("小明");
        map.put(777, person);
        map.put("777",person);
        map.put(person,"989898");
        if(map.containsKey("777")){
            System.out.println("00000000");
        }else{
            System.out.println("111111111");
        }

    }

    @Test
    public void demo2(){
        ConcurrentHashMap<Object,Object> map = new ConcurrentHashMap<>();
        Person person = new Person();
        person.setAge(18);
        person.setLastName("小明");
        map.put(777, person);
        map.put("777",person);
        map.put(person,"989898");
        if(map.containsKey("777")){
            System.out.println("00000000");
        }else{
            System.out.println("111111111");
        }
    }

    @Test
    public void demo5(){
        int cap = 11;
        int n = cap - 1;
        n |= 3;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
        System.out.println(n);
    }
}
