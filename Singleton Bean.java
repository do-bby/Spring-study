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

	//������ �����̳ʰ� �����ϴ� ������ �� ��ȯ

        assertThat(singletonbean1).isSameAs(singletonbean2);
	
	//�̱����̱� ������ 2���� ���� ��û�� �͵� 
	//���� ��ü �ν��Ͻ��� ������ �� ��ȯ�ؾ��ϹǷ� isSameAs �׽�Ʈ ����

        ac.close();

    }

    @Scope("singleton")
   
    //�̱������� ����
    static class SingletonBean{

    }
}
