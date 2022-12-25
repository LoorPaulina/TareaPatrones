package Decorator;
public class VideoRecorderService extends ServiceDecorator {
	private int QUALITY_LOW;
	private int QUALITY_MEDIUM;
	private int QUALITY_HIGH;
	private int QUALITY_UNDETECTED;
	private long mDuration;
	private long mTimeLeft;
	private int mQuality;
	public void prepareRecorder() {
		//do Something
	}
	public void stopRecording() {
		//do Something
	}
	public void startRecording() {
		//do Something
	}
	public void releaseCamera() {
		//do Something
	}
	public int getQUALITY_LOW() {
		return QUALITY_LOW;
	}
	public void setQUALITY_LOW(int qUALITY_LOW) {
		QUALITY_LOW = qUALITY_LOW;}
	public int getQUALITY_MEDIUM() {
		return QUALITY_MEDIUM;}
	public void setQUALITY_MEDIUM(int qUALITY_MEDIUM) {
		QUALITY_MEDIUM = qUALITY_MEDIUM;}
	public int getQUALITY_HIGH() {
		return QUALITY_HIGH;}
	public void setQUALITY_HIGH(int qUALITY_HIGH) {
		QUALITY_HIGH = qUALITY_HIGH;}
	public int getQUALITY_UNDETECTED() {
		return QUALITY_UNDETECTED;}
	public void setQUALITY_UNDETECTED(int qUALITY_UNDETECTED) {
		QUALITY_UNDETECTED = qUALITY_UNDETECTED;}
	public long getMDuration() {
		return this.mDuration;}
	public void setMDuration(long mDuration) {
		this.mDuration = mDuration;}
	public long getMTimeLeft() {
		return this.mTimeLeft;}
	public void setMTimeLeft(long mTimeLeft) {
		this.mTimeLeft = mTimeLeft;}
	public int getMQuality() {
		return this.mQuality;}
	public void setMQuality(int mQuality) {
		this.mQuality = mQuality;}

}
