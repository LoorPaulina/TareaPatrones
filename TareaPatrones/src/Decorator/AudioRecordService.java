package Decorator;

public class AudioRecordService extends ServiceDecorator {

	private long mDuration;
	private long mTimeLeft;

	public void prepareRecorder() {
		//do Something
	}

	public void stopRecording() {
		//do Something
	}

	public long getMDuration() {
		return this.mDuration;
	}

	public void setMDuration(long mDuration) {
		this.mDuration = mDuration;
	}

	public long getMTimeLeft() {
		return this.mTimeLeft;
	}

	public void setMTimeLeft(long mTimeLeft) {
		this.mTimeLeft = mTimeLeft;
	}
	
	public void onStartCommand() {
		//do Something
	}
}


