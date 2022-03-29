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

	//������Ÿ���̹Ƿ� 2���� ��û�� ���� ��
	//������ �����̳ʴ� ���ο� ������Ÿ�� ���� �����ؼ� ��ȯ

        ac.close();
        

    }

    @Scope("prototype")

    //������Ÿ������ ����
    static class PrototypeBean{

}
