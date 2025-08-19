package com.yang.mianshi.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题目请求
 *
 * @author <a href="https://github.com/gangtieyang">钢铁阳</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {


    /**
     * 题库 id 列表
     */
    private List<Long> questionIdlist;



    private static final long serialVersionUID = 1L;
}