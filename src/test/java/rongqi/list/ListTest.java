package rongqi.list;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author gaocy
 * @create 2020-05-05 15:46
 */
public class ListTest {

    @Test
    public void demo(){
        List<Integer> list= new LinkedList<>();
        list.add(111);
        list.add(2222);
        list.add(333);
        int i = list.get(0);
        System.out.println(i);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1111);
        integerList.add(2222);
        integerList.forEach(item ->{
            System.out.println(item);
        });
    }

    @Test
    public void demo2(){
//        int oldCapacity = 10;
//        int newCapacity = oldCapacity + (oldCapacity >> 1);
//        System.out.println(newCapacity);

        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        int[] b = new int[10];
        System.arraycopy(a, 2, b, 3, 3);
//        a[2]=99;
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
        }
    }

    @Test
    public void demo3(){
        try {
            ArrayList<Object> list = new ArrayList<Object>();
            final int N = 10000000;
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < N; i++) {
                list.add(i);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("使用ensureCapacity方法前："+(endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ArrayList<Object> list = new ArrayList<Object>();
            final int N = 10000000;
            list = new ArrayList<Object>();
            long startTime1 = System.currentTimeMillis();
            list.ensureCapacity(N);
            for (int i = 0; i < N; i++) {
                list.add(i);
            }
            long endTime1 = System.currentTimeMillis();
            System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            final int N = 10000000;
            ArrayList<Object> list = new ArrayList<Object>(N);
            list = new ArrayList<Object>();
            long startTime1 = System.currentTimeMillis();
            list.ensureCapacity(N);
            for (int i = 0; i < N; i++) {
                list.add(i);
            }
            long endTime1 = System.currentTimeMillis();
            System.out.println("直接赋值："+(endTime1 - startTime1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo7(){
        List<String> sessionIds = new ArrayList();
        sessionIds.add("测试1");
        sessionIds.add("测试2");
        sessionIds.add("测试3");
        String join = String.join(",", sessionIds);
        System.out.println(join);
        String sIds = "";
        int size = sessionIds.size();
        int j = 1;
        for (int i = 0; i < sessionIds.size(); i++) {
            String sessionId =  sessionIds.get(i);
            if(j==1){
                sIds = sessionId + ",";
            }else if(j==size){
                sIds = sIds + sessionId;
            }else{
                sIds = sIds + sessionId+",";
            }
            j++;
        }
        System.out.println(sIds);


        StringBuilder sIdss = new StringBuilder();
        if(sessionIds == null || sessionIds.isEmpty()){
            return;
        }
        int sizes = sessionIds.size();
        int jj = 1;
        for (String sessionId : sessionIds) {
            if (jj == 1) {
                sIdss = new StringBuilder(sessionId + ",");
            } else if (jj == sizes) {
                sIdss.append(sessionId);
            } else {
                sIdss.append(sessionId).append(",");
            }
            jj++;
        }
        System.out.println(sIdss);
    }

    @Test
    public void demo8(){
        /* 核心代码 */
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, -10);// 5分钟之前的时间
        Date beforeD = beforeTime.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(beforeD);
        System.out.println(time);
    }

}
