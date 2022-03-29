package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.assertj.core.api.Assertions.*;

public class PrototypeTest {

    @Test
    void prototypeBeanFind(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);

        PrototypeBean prototypebean1 = ac.getBean(PrototypeBean.class);

        PrototypeBean prototypebean2 = ac.getBean(PrototypeBean.class);

        assertThat(prototypebean1).isNotSameAs(prototypebean2);

	//프로토타입이므로 2번의 요청이 왔을 때
	//스프링 컨테이너는 새로운 프로토타입 빈을 생성해서 반환하므로 isNotSameAs 테스트 성공

        ac.close();
        

    }

    @Scope("prototype")

    //프로토타입으로 지정
    static class PrototypeBean{

}
