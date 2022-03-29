package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {
    
    @PostConstruct
    public void init(){
        connect();
        call("초기화 연결 메시지");
    }
    //@PostConstruct를 사용하면 빈 생성하기 전에 해당 메소드 실행


    @PreDestroy
    public void close(){
        disconnect();
    }
    //@PreDestroy를 사용하면 빈 종료하기 전에 해당 메소드 실행

    //위 방법과 다르게 빈 설정 정보에 
    //@Bean(initMethod = "init", destroyMethod = "close")처럼 초기화, 소멸 메소드 지정 가능
}
