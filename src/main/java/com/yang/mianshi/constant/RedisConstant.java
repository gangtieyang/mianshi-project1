package com.yang.mianshi.constant;


public interface RedisConstant {

    /**
     *  用户签到记录的 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到记录的 Redis Key
     * @param year
     * @param userId
     * @return 拼接好的 Redis Key
     */

    static String getUserSignInRedisKey(int year, long userId){
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }
}
