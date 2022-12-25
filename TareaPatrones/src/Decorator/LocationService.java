package Decorator;

public class LocationService extends ServiceDecorator {
	private long TIME_INTERVAL;
	private long DISTANCE_INTERVAL;
	private static int MILLISECONDS_PER_SECOND;
	private static int LOCATION_FIX_TIMEOUT;
	public void initValues() {
		//do Something
	}
	public void sendLocation() {
		//do Something
	}
	public void getCurrentLocation() {
		//do Something
	}
	public void onConnectionFailed() {
		//do Something
	}
	public void onLocationChange() {
		//do Something
	}
	public void onProviderDisabled() {
		//do Something
	}
	public void onProviderEnabled() {
		//do Something
	}
	public long getTIME_INTERVAL() {
		return TIME_INTERVAL;
	}
	public void setTIME_INTERVAL(long tIME_INTERVAL) {
		TIME_INTERVAL = tIME_INTERVAL;
	}
	public long getDISTANCE_INTERVAL() {
		return DISTANCE_INTERVAL;
	}
	public void setDISTANCE_INTERVAL(long dISTANCE_INTERVAL) {
		DISTANCE_INTERVAL = dISTANCE_INTERVAL;
	}

	public static int getMILLISECONDS_PER_SECOND() {
		return MILLISECONDS_PER_SECOND;
	}
	public static void setMILLISECONDS_PER_SECOND(int mILLISECONDS_PER_SECOND) {
		MILLISECONDS_PER_SECOND = mILLISECONDS_PER_SECOND;
	}
	public static int getLOCATION_FIX_TIMEOUT() {
		return LOCATION_FIX_TIMEOUT;
	}

	public static void setLOCATION_FIX_TIMEOUT(int lOCATION_FIX_TIMEOUT) {
		LOCATION_FIX_TIMEOUT = lOCATION_FIX_TIMEOUT;
	}

	
}