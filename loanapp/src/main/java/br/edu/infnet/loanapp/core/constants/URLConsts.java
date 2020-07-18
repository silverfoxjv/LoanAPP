package br.edu.infnet.loanapp.core.constants;

public class URLConsts {

	private static final String MAIN_MENU_PATH = "/mainmenu";

	private static final String LOGIN_PATH = "/login";
	
	private static final String PAYMENT_PATH = "/payment";

	private URLConsts() {
		super();
	}

	public static String getMainMenuPath() {
		return MAIN_MENU_PATH;
	}

	public static String getLoginPath() {
		return LOGIN_PATH;
	}
	
	public static String getPaymentPath() {
		return PAYMENT_PATH;
	}

}
