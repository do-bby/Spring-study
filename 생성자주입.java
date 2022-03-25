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

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    @Autowired //생성자가 1개면 생략가능
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicydiscountPolicy) {
    this.memberRepository = memberRepository;
    this.discountPolicy = discountPolicy;
 }

}
