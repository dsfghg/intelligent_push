package com.demo.service.outer;

import com.baidubce.qianfan.Qianfan;
import com.baidubce.qianfan.model.chat.ChatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/15 10:35
 */
@Slf4j
@Service
public class WenxinApi {


    @Value("${wenxin.access.key}")
    private String accessKey;

    @Value("${wenxin.secret.key}")
    private String secretKey;

    @Value("${wenxin.model}")
    private String model;


    public String getWenxinResonse(String text) {
        // 使用安全认证AK/SK鉴权
        Qianfan qianfan = new Qianfan(accessKey, secretKey);
        // 指定模型
        ChatResponse resp = qianfan.chatCompletion()
                .model(model)
                .addMessage("user", text)
                .execute();
        return resp.getResult();
    }





}
