package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public Long save(Member_old member) {
        em.persist(member);
        return member.getId();
    }

    public Member_old find(Long id) {
        return em.find(Member_old.class, id);
    }
}
