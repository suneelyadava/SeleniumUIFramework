package cumulusPageObject;

public class WaitForPageToLoad {
	
	public static int oneSec=1000;
	public static int fiveSec=5000;
	public static void waitForOneSec() throws InterruptedException
	{
		Thread.sleep(oneSec);
	}
	public static void waitForFiveSec() throws InterruptedException
	{
		Thread.sleep(fiveSec);
	}

}
