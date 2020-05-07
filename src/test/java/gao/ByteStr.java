package gao;

import com.how2java.springboot.util.ByteUtil;
import org.junit.Test;

import static com.how2java.springboot.util.ByteUtil.int2Byte;

/**
 * @author shkstart
 * @create 2020-04-29 19:45
 */
public class ByteStr {

    @Test
    public void demo(){

//        byte[] bytes = new byte[16];
        int i = 0x000025;
//        int signal = ByteUtil.byte2int_le(bytes, 4);
        byte[] bytes1 = int2Byte(i);

        String str = new String(bytes1);
        System.out.println(str);
        byte[] bytes2 = str.getBytes();
        i = ByteUtil.byte2int_le(bytes1,4);
        System.out.println(i);
    }

}
