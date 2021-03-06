package com.jo.common.cache.redis;

/**
 * 缓存相关键值
 * 
 * @author zhouhang
 *
 */
public class CacheKey {
	
	/**默认缓存的过期时间：一天*/
	public final static long DEFAULT_CACHE_TIME_OUT = 86400/*一天*/;
	
	/**交易缓存的过期时间*/
	public final static long TRADE_CACHE_TIME_OUT = 300;
	
	/** 缓存时间2小时 **/
	public final static long TWO_HOUR = 7200;
	
	private CacheKey () {}
}
