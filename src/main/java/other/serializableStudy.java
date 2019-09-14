package other;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * question:
 *      1. uid 写于不写又什么区别？
 *      2. 具体的使用？
 *      3. 如何使用实现的，接口里明明什么方法都没有？
 *
 */
public class serializableStudy {

    @Test
    public void use() throws IOException {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(""));
        o.writeObject(null);

    }
}


class Person{
    private String name;
    private String sex;
    private Integer money;

    public Person(String name, String sex, Integer money) {
        this.name = name;
        this.sex = sex;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", money=" + money +
                '}';
    }
}

