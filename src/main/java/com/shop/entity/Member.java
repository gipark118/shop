package com.shop.entity;

import com.shop.constant.Role;
import com.shop.dto.MemberFormDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@Setter
@ToString
public class Member extends BaseEntity{

    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;         // 아이디

    private String  name;       // 이름

    @Column(unique = true)
    private String  email;      // 이메일

    private String  password;   // 비밀번호

    private String  address;    // 주소

    @Enumerated(EnumType.STRING)
    private Role    role;       // 역할

    public static Member createMember(MemberFormDTO memberFormDTO, PasswordEncoder passwordEncoder) {

        Member member = new Member();
        member.setName(memberFormDTO.getName());
        member.setEmail(memberFormDTO.getEmail());
        member.setAddress(memberFormDTO.getAddress());
        String password = passwordEncoder.encode(memberFormDTO.getPassword());
        member.setPassword(password);
        member.setRole(Role.ADMIN);

        return member;
    }
}
