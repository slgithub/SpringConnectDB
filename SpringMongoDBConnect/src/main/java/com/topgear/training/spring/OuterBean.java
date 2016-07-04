package com.topgear.training.spring;

public class OuterBean {
	   private InnerBean innerBean;

	   public void setInnerBean(InnerBean ib) {
	      //System.out.println("Inside Outer Bean constructor." );
	      this.innerBean = ib;
	   }
	   public InnerBean getInnerBean(){
		   return innerBean;
	   }
	   public void innerTest() {
		   innerBean.test();
	   }
	}