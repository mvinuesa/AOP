package com.isban.spring.AOP_Before_After.bean;

public  class OperacionImp implements Operacion{  
	/*before*//*After*/
	public void msg(){
    	System.out.println("msg metodo invocado");
    	}  
    public int m(){
    	System.out.println("m metodo invocado");
    	return 2;
    }  
    public int k(){
    	System.out.println("k metodo invocado");
    	return 3;
    }  
    
}  
