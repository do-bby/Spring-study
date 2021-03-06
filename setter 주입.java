package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;
    
    @Autowired 
    public void setMemberRepository(MemberRepository memberRepository) {
         this.memberRepository = memberRepository;
 }
    @Autowired
    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
         this.discountPolicy = discountPolicy;
 }    
 }

}
