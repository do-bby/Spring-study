package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.assertj.core.api.Assertions.*;

public class SingletonTest {

    @Test
    void singletonBeanFind(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class);

        SingletonBean singletonbean1 = ac.getBean(SingletonBean.class);

        SingletonBean singletonbean2 = ac.getBean(SingletonBean.class);

	//스프링 컨테이너가 관리하는 스프링 빈 반환

        assertThat(singletonbean1).isSameAs(singletonbean2);
	
	//싱글톤이기 때문에 2번의 같은 요청이 와도 
	//같은 객체 인스턴스의 스프링 빈 반환해야하므로 isSameAs 테스트 성공

        ac.close();

    }

    @Scope("singleton")
   
    //싱글톤으로 지정
    static class SingletonBean{

    }
}
