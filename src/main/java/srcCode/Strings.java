package srcCode;

import org.junit.Test;

import java.io.Serializable;
import java.util.UUID;

public class Strings implements Serializable {


    private static final long serialVersionUID = -9031096686803680865L;

    @Test
    public void test(){
        /*
        1. jdk 1.8 可以允许接口 方法实现，只需在方法 前加 default 、 static ，分别作为默认的、静态的方法 方法，这些方法都可以被重写
        2. CharSequence 是什么作用？
        3. transient 是在序列化时使用，域用该关键字修饰，可以不序列化该域

         */
        String str = new String("s");
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
    }

    @Test
    public void test1(){
        for (int i = 0 ; i < 185 ; i++){
            UUID uuid = UUID.randomUUID();

            System.out.println(uuid.toString().replaceAll("-",""));
        }
    }
}
