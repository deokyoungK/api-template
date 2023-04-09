package com.app.api.login.service;


import com.app.api.login.dto.OauthLoginDto;
import com.app.domain.member.constant.MemberType;
import com.app.external.oauth.kakao.service.SocialLoginApiServiceFactory;
import com.app.external.oauth.model.OAuthAttributes;
import com.app.external.oauth.service.SocialLoginApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class OauthLoginService {



    public OauthLoginDto.Response oauthLogin(String accessToken, MemberType memberType) {
        SocialLoginApiService socialLoginApiService = SocialLoginApiServiceFactory.getSocialLoginApiService(memberType);
        OAuthAttributes userInfo = socialLoginApiService.getUserInfo(accessToken);
        log.info("userInfo : {}",  userInfo);
        return OauthLoginDto.Response.builder().build();
    }

}
