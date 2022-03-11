package solid.i;

public interface iPrintTask {
	
	boolean printContent(String content);
	boolean scanContent(String content);
	boolean faxContent(String content);
	boolean printContentExternalDevice(String content);
	boolean authBadge(String content);

}
