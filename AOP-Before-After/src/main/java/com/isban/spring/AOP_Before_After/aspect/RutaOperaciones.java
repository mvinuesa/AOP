package com.isban.spring.AOP_Before_After.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class RutaOperaciones {
	/*before*/
	/*estas son las preocupaciones transversales o cross-cutting concerns*/
	public void miAvisoBefore(JoinPoint jp){//es un consejo 
        System.out.println("preocupaciones adicionales Before");  
        //System.out.println("Firma del Metodo : "  + jp.getSignature());  
	}  
	
	
	/*After*/
	public void miAvisoAfter(JoinPoint jp){//es un consejo  
        System.out.println("preocupaciones adicionales After");  
      //System.out.println("Firma del Metodo : "  + jp.getSignature());   
	}
	
	/*After returning*/
	/*en el paramatero resultado podemos recuperar el valor que envia el metodo 
	 * de la logiga de negocio desde el consejo
	*/
	public void miAvisoAfterReturning(JoinPoint jp, Object resultado){//es un consejo  
        System.out.println("preocupaciones adicionales AfterReturning");
        System.out.println("Firma del Metodo : "  + jp.getSignature());
        System.out.println("Resultado en consejo" + resultado);
        System.out.println("final de consejo after returning...");  
           
	}
	
	/*around*/
	/*Necesitamos pasar la referencia ProceedingJoinPoint en el metodo del consejo, 
	 * para poder procesar la peticion llamando al metodo proceed() 
	*/
  public Object miAvisoAround(ProceedingJoinPoint pjp)throws Throwable{//es un consejo 
	  System.out.println("Preocupaciones adicionales antes(Before) llamar al metodo actual");  
      Object obj=pjp.proceed();  
      System.out.println("Preocupaciones adicionales despues(After) llamar al metodo actual");  
      return obj;  
  }	
  
}
