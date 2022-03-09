package com.fundamentosplatsi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;
//  en la  clase   component  implement  creo las   funcionalidades
@Component
public class ComponentImplement implements ComponentDependecy{
    @Override
    public void saludar(){
        System.out.println("hola  desde  componente");
    }
}
