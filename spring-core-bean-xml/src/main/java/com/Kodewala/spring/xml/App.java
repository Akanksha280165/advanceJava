package com.Kodewala.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       String s1="\\resource\\applicationContext.xml";
       ClassPathXmlApplicationContext   applicationContext=new ClassPathXmlApplicationContext(s1);
       Account a1=(Account) applicationContext.getBean("acc");
       System.out.println(a1.getAccNumber()+" "+a1.getAccType()+" "+a1.getAccIFSC());
    }
}
