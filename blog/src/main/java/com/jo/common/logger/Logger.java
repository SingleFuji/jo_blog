package com.jo.common.logger;

/**
 * 日志接口 <p/> 声明：引用自commons-logging
 *
 */
public interface Logger {
    /**
     * 判断是否是当前Level
     * @param level
     * @return boolean
     */
    public boolean isLevel(Level level);

    /***
     * 输出指定级别的普通信息
     * @param level
     * @param msg
     */
    public void log(Level level,String msg,String chainId);

    /***
     * 输出指定级别的异常信息
     * @param level
     * @param msg
     * @param e
     */
    public void log(Level level,String msg,Throwable e,String chainId);
    /***
     * 输出指定级别的普通信息
     * @param level
     * @param msg
     */
    public void log(Level level,String msg);

    /***
     * 输出指定级别的异常信息
     * @param level
     * @param msg
     * @param e
     */
    public void log(Level level,String msg,Throwable e);

    /**
     * 绑定父子chainId
     * @param parentChainId
     * @param childChainId
     */
    public void  bindChainId(String parentChainId,String childChainId);

    /**
     * 输出跟踪信息
     *
     * @param msg 信息内容
     */
    public void trace(String msg);

    /**
     * 输出跟踪信息
     *
     * @param e 异常信息
     */
    public void trace(Throwable e);
    
    /**
     * 输出跟踪信息
     *
     * @param msg 信息内容
     * @param e 异常信息
     */
    public void trace(String msg, Throwable e);

	/**
	 * 输出调试信息
	 *
	 * @param msg 信息内容
	 */
	public void debug(String msg);

	/**
     * 输出调试信息
     *
     * @param e 异常信息
     */
	public void debug(Throwable e);
	
	/**
	 * 输出调试信息
	 *
	 * @param msg 信息内容
	 * @param e 异常信息
	 */
	public void debug(String msg, Throwable e);

	/**
	 * 输出普通信息
	 *
	 * @param msg 信息内容
	 */
	public void info(String msg);

	/**
     * 输出普通信息
     *
     * @param e 异常信息
     */
	public void info(Throwable e);
	
	/**
	 * 输出普通信息
	 *
	 * @param msg 信息内容
	 * @param e 异常信息
	 */
	public void info(String msg, Throwable e);

	/**
	 * 输出警告信息
	 *
	 * @param msg 信息内容
	 */
	public void warn(String msg);
	
	/**
     * 输出警告信息
     *
     * @param e 异常信息
     */
	public void warn(Throwable e);

	/**
	 * 输出警告信息
	 *
	 * @param msg 信息内容
	 * @param e 异常信息
	 */
	public void warn(String msg, Throwable e);

	/**
	 * 输出错误信息
	 *
	 * @param msg 信息内容
	 */
	public void error(String msg);
	
	/**
     * 输出错误信息
     *
     * @param e 异常信息
     */
	public void error(Throwable e);

	/**
	 * 输出错误信息
	 *
	 * @param msg 信息内容
	 * @param e 异常信息
	 */
	public void error(String msg, Throwable e);

    /**
     * 跟踪信息是否开启
     *
     * @return 是否开启
     */
    public boolean isTraceEnabled();

	/**
	 * 调试信息是否开启
	 *
	 * @return 是否开启
	 */
	public boolean isDebugEnabled();

	/**
	 * 普通信息是否开启
	 *
	 * @return 是否开启
	 */
	public boolean isInfoEnabled();

	/**
	 * 警告信息是否开启
	 *
	 * @return 是否开启
	 */
	public boolean isWarnEnabled();
	
	/**
	 * 错误信息是否开启
	 *
	 * @return 是否开启
	 */
	public boolean isErrorEnabled();

}