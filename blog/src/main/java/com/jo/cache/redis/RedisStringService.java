package com.jo.cache.redis;


public interface RedisStringService {
    /**
     * 向redis里存入对象
     * @param sessionid
     * @param bf
     */
	void putString(String sessionId, String body);
	
	/**
	 * 向redis里存入对象,并指定过期时间
	 * @param key
	 * @param body
	 * @param seconds
	 */
	void putString(String sessionId, String body, long seconds);

	/**
	 * 从redis里取出对象
	 * @param sessionid
	 * @return
	 */
	String getString(String sessionId);

	/**
	 * 删除redis里的对象
	 * @param sessionId
	 */
	void deleteString(String sessionId);
	
	/**
	 * 插入新值，获取旧值
	 * @param sessionId
	 * @return
	 */
	boolean setNX(final String sessionId, final String body, final long seconds);

}
