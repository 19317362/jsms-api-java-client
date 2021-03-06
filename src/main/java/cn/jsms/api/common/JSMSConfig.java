package cn.jsms.api.common;

import cn.jiguang.commom.ClientConfig;

public class JSMSConfig {

	private static ClientConfig clientConfig = ClientConfig.getInstance();
	
	private static JSMSConfig instance = new JSMSConfig();
	
	public final static String API_HOST_NAME = "sms.api.host.name";
	
	public final static String CODE_PATH = "sms.code.path";
	
	public final static String VALID_PATH = "sms.valid.path";
	
	public static final String MAX_RETRY_TIMES = ClientConfig.MAX_RETRY_TIMES;
	
	public static final String SEND_VERSION = "send.version";
	
	public JSMSConfig() {
		clientConfig.put(API_HOST_NAME, "https://api.sms.jpush.cn");
		clientConfig.put(CODE_PATH, "/v1/codes");
		clientConfig.put(VALID_PATH, "/valid");
		clientConfig.put(MAX_RETRY_TIMES, 3);
        clientConfig.put(SEND_VERSION, 1);
	}
	
	public static JSMSConfig getInstance() {
		return instance;
	}
	
	public ClientConfig getClientConfig() {
		return clientConfig;
	}
	
	public Object get(String key) {
        return clientConfig.get(key);
    }
}
