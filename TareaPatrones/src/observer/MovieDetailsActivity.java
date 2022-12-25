package observer;

import java.util.List;

public class MovieDetailsActivity implements Observer {

	private List<PTMovie> ptMovieList;
	private int pos;
	private PTAdapter ptAdapter;
	private LinearLayoutManager layoutManager;
	private SnapHelper snapHelper;
	private int currentPosition;
	private boolean timeopen;

	public void onCreate() {
		//do Something
	}

	public void onBackPressed() {
		//do Something
	}

	@Override
	public void update(MoviePublisher MoviePublisher) {
		//update the state of this class
	}
}

