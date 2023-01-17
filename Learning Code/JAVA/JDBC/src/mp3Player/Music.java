package mp3Player;

public class Music { // model

	// 가수
	// 노래제목
	// playTime
	// path
	String singer;
	String title;
	private int playTime;
	private String path;
	// private : 내부에 있는 메서드를 통해 접근이 가능하도록하는 접근제한자
	
	// getter, setter
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	// 생성자
	public Music(String title, String singer, int playTime, String path) {
		super();
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}
	
	// alt + shift + s
	
}
