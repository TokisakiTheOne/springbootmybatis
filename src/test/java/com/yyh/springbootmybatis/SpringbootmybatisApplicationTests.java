package com.yyh.springbootmybatis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.lang.model.SourceVersion;

@SpringBootTest
class SpringbootmybatisApplicationTests {

    @Test
    void contextLoads() {
        //在常量池中创建 1 在堆中创建一个String对象指向  常量池中的 1
        //栈中的 s 指向堆中的String对象
        String s =new String("1");
        //返回常量池中的地址     检查常量池中是否存在这个字符串，如果存在 就返回池中的字符串  如果不存在
        // JDK1.6以下 会把这个字符串添加到常量池  1.7以上 会把字符串在堆内存中的地址添加到常量池
        String intern = s.intern();
        // s2指向常量池中的 1
        String s2="1";
        //常量池中的地址 和 堆中的地址 不一样  所以返回false
        System.out.println(s==s2);
        String s3 = new String("1")+new String("1");
        s3.intern();
        String s4="11";
        System.out.println(s3==s4);
    }

    @Test
    void contextLoads1() {
          Thread t = new Thread();
          t.yield();


    }

}
