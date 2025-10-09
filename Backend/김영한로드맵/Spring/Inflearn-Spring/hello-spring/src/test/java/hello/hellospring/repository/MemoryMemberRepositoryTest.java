package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
//        System.out.println("result = " + (result == member));
//        Assertions.assertEquals(member, result);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("summer");
        repository.save(member2);

        Member result = repository.findByName("summer").get();
        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void finaAll() {
        Member member1 = new Member();
        member1.setName("spring");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("summer");
        repository.save(member2);

        Member member3 = new Member();
        member3.setName("fall");
        repository.save(member3);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(3);
    }
}
