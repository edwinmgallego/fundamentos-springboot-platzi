package com.fundamentosplatsi.springboot.fundamentos;

import com.fundamentosplatsi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatsi.springboot.fundamentos.component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//creo  el contructor  con  el  que   llamo  a   la dependencia
@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDependecy componentDependecy;
	private MyBean myBean;
	// si quiero  llamar  un  segundo  componente   lo  llamo  con   un Qualifier
	public FundamentosApplication (@Qualifier("componentTwoImplement") ComponentDependecy componentDependecy , MyBean  myBean){
		this.componentDependecy = componentDependecy;
		this.myBean = myBean;

	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
		myBean.print();
	}
}
