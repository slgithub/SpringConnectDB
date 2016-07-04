package com.topgear.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   
	  /*Reading config xml from file system path*/
	  //ApplicationContext context = new FileSystemXmlApplicationContext("D:/TEST_SPACE/Beans.xml");
	      
     /*Reading config xml from Classpath*/
	  ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	  
	   /* setter called from xml config file*/
	   //BasicHello bh = (BasicHello)context.getBean("hellobasic");
	   //bh.getMessage();
	   
	   /*-------------------------------------------------*/
	   /* msg set from the code*/
	   //BasicHello bh = (BasicHello) context.getBean("hellobasic");
	   //bh.setMessage("Hi Basic Hello Singleton");
	   //bh.getMessage();
	   
    
	 /*ApplicationContext context = new AnnotationConfigApplicationContext(BasicHelloConfig.class);*/
	  /*BasicHello bh = (BasicHello)context.getBean("hellobasic");
	  bh.getMessage(); */ 
     
	  System.out.println("------------Inner Bean --- Outer Bean--------------------*****");
	  OuterBean ob = (OuterBean)context.getBean("ob");
      ob.innerTest();
     
	  /*----JAVA COLLECTION------*/
      System.out.println("------------javaCollection------------------------------*****");
      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressProp();

	 // ApplicationContext ctx = new AnnotationConfigApplicationContext(Customer.class);
	     
      

     Employee emp = (Employee) context.getBean("e");
     System.out.println(emp.getId());
      System.out.println(emp.getAddress().getCiti());
      
         emp.setId(342355);
         emp.getAddress().setCiti("Greater Noida");
         
         Employee emp2 = (Employee) context.getBean("e");
         System.out.println(emp2.getId());
          System.out.println(emp2.getAddress().getCiti());
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     
      
      
     /* 
      ApplicationContext ctx = 
    	      new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    	   
    	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
    	      helloWorld.setMessage("Hi Hello World Singleton");
    	      helloWorld.getMessage();
    	      MyHelloWorld mhw = ctx.getBean(MyHelloWorld.class);
    	        mhw.setMessage("My hello world prototype");
    	       mhw.getMessage();
    	       HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
    	       MyHelloWorld mhw1 = ctx.getBean(MyHelloWorld.class);
    	       helloWorld.getMessage();
    	       mhw1.getMessage();*/
    	       
    	       
    	       
    	       
      
   }
}