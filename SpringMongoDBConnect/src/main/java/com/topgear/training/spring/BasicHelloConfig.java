package com.topgear.training.spring;
import org.springframework.context.annotation.*;

@Configuration
public class BasicHelloConfig {

   @Bean 
   @Scope("singleton")
   public BasicHello basicHello(){
      return new BasicHello();
   }
   
   @Bean 
   @Scope("prototype")
   public OtherHello otherHello(){
      return new OtherHello();
   }
}
