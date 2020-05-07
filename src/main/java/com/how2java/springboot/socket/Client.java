package com.how2java.springboot.socket;

import com.how2java.springboot.pojo.Person;
import com.how2java.springboot.util.JsonUtils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-30 10:31
 */
public class Client {


    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream os = s.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(os);
            List<Person> personList = getList();
            String json = JsonUtils.beanToJson(personList);

            dataOutputStream.write(json.getBytes());
            dataOutputStream.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List getList(){
        Person person = new Person();
        person.setAge(10);
        person.setLastName("小花");
        Person person1 = new Person();
        person1.setAge(5);
        person1.setLastName("小名");
        Person person2 = new Person();
        person2.setAge(18);
        person2.setLastName("小清");
        Person person3 = new Person();
        person3.setAge(25);
        person3.setLastName("小才");
        Person person4 = new Person();
        person4.setAge(7);
        person4.setLastName("小亮");
        List<Person> personList = new ArrayList<>(7);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        return personList;
    }
}
