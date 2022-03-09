package com.fundamentosplatsi.springboot.fundamentos.component;
import org.springframework.stereotype.Component;
@Component
public class ComponentTwoImplement implements ComponentDependecy{
    @Override
    public void saludar() {
        System.out.println("hola  desde  mi componente #  2 tqm");
    }
}
