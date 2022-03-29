package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)

//�������� Ŭ������ proxyMode = ScopedProxyMode.TARGET_CLASS
//�������� �������̽��� proxyMode = ScopedProxyMode.INTERFACES

//���� ���� ��¥ ���Ͻ� ��ü�� �����ϴ� ����� ����ϸ� ��¥ ��ü ��ȸ�� �� �ʿ��� �������� ����ó���� �����ϴ�.
public class MyLogger {

   
}
