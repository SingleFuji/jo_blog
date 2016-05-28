package com.jo.common.container;

public interface IServiceLoader {

	/**
	 * 加载服务 
	 * 
	 */
	public void loadService();
	
	/**
	 * 销毁服务
	 * 
	 */
	public void destory();
}
