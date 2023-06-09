package com.app.external.oauth.model;

import com.app.domain.member.constant.MemberType;
import com.app.domain.member.constant.Role;
import com.app.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class OAuthAttributes { //회원정보를 가져올 때 반환형태가 다 다른데, 이걸 하나로 통일함

    private String name;
    private String email;
    private String profile;
    private MemberType memberType;

    public Member toMemberEntity(MemberType memberType, Role role){
        return Member.builder()
                .memberName(name)
                .email(email)
                .memberType(memberType)
                .profile(profile)
                .role(role)
                .build();
    }




}
