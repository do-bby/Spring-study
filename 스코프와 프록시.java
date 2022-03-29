package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)

//적용대상이 클래스면 proxyMode = ScopedProxyMode.TARGET_CLASS
//적용대상이 인터페이스면 proxyMode = ScopedProxyMode.INTERFACES

//위와 같이 가짜 프록시 객체를 생성하는 방법을 사용하면 진짜 객체 조회를 꼭 필요한 시점까지 지연처리가 가능하다.
public class MyLogger {

   
}
