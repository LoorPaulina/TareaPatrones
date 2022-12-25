import java.util.List;

package observer;

public class PTMovie {

	private Integer voteCount;
	private Integer id;
	private Boolean video;
	private Double voteAverage;
	private String title;
	private Double popularity;
	private String posterPath;
	private String originalLanguage;
	private String originalTitle;
	private List<Integer> genreIds;
	private String backdropPath;
	private String adult;
	private String overview;
	private String releaseDate;
	private List<String> genres;

	public Integer getVoteCount() {
		return this.voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

	public Integer getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getVideo() {
		return this.video;
	}

	/**
	 * 
	 * @param video
	 */
	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Double getVoteAverage() {
		return this.voteAverage;
	}

	/**
	 * 
	 * @param voteAverage
	 */
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPopularity() {
		return this.popularity;
	}

	/**
	 * 
	 * @param popularity
	 */
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	public String getPosterPath() {
		return this.posterPath;
	}

	/**
	 * 
	 * @param posterPath
	 */
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

}