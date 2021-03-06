package org.netty.config;

/**
 * 配置
 * 
 * @author zhaohui
 * 
 */
public class Config {

	private String _ipAddr;
	private int _port;
	private String _localIpAddr;
	private int _localPort;
	private String _method;
	private String _password;
	/**是否是全局代理模式**/
	private boolean _global_mode;

	public Config() {

	}

	public Config(String ipAddr, int port, String localIpAddr, int localPort, String method, String password,
			boolean global_mode) {
		_ipAddr = ipAddr;
		_port = port;
		_localIpAddr = localIpAddr;
		_localPort = localPort;
		_method = method;
		_password = password;
		_global_mode = global_mode;
	}

	public String get_ipAddr() {
		return _ipAddr;
	}

	public void set_ipAddr(String _ipAddr) {
		this._ipAddr = _ipAddr;
	}

	public int get_port() {
		return _port;
	}

	public void set_port(int _port) {
		this._port = _port;
	}

	public String get_localIpAddr() {
		return _localIpAddr;
	}

	public void set_localIpAddr(String _localIpAddr) {
		this._localIpAddr = _localIpAddr;
	}

	public int get_localPort() {
		return _localPort;
	}

	public void set_localPort(int _localPort) {
		this._localPort = _localPort;
	}

	public String get_method() {
		return _method;
	}

	public void set_method(String _method) {
		this._method = _method;
	}

	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

	public boolean is_global_mode() {
		return _global_mode;
	}

	public void set_global_mode(boolean _global_mode) {
		this._global_mode = _global_mode;
	}

}
