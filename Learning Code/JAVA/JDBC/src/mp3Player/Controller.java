package mp3Player;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	MP3Player mp3 = new MP3Player();

	// playing
	public void playing(ArrayList<Music> musicList, int i) {
		i++;
		if (mp3.isPlaying()) {
			mp3.stop();

		}
		mp3.play(musicList.get(i).getPath());

	}

	// pause
	public void pause() {
		mp3.stop();
		System.out.println("노래가 정지 되었습니다.");

	}

	// preMusic
	public int preMusic(ArrayList<Music> musicList, int i) {
		// 인덱스 값 -1;
		// 인덱스 값이 0보다 작아지려고하면
		// 마지막 노래로 돌아간다.
		i--;
		if (i < 0) {
			i = musicList.size() - 1;

		}
		if (mp3.isPlaying()) {
			mp3.stop();

		}
		mp3.play(musicList.get(i).getPath());

		return i;

	}

	// nextMusic
	public int nextMusic(ArrayList<Music> musicList, int i) {
		// 인덱스 값 +1;
		// 인덱스 값이 list의 size를 넘어가면
		// 처음 노래로 돌아간다. == 인덱스 == 0
		i++;
		if (i == musicList.size()) {
			i = 0;

		}
		// 노래가 재생중인지 아닌지 판단
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(i).getPath());

		return i;
	}

	// musicInfo
	public void musicInfo(ArrayList<Music> musicList, int i) {
		if (mp3.isPlaying()) {
			String singer = musicList.get(i).getSinger();
			String title = musicList.get(i).getTitle();
			int min = musicList.get(i).getPlayTime() / 60;
			int sec = musicList.get(i).getPlayTime() % 60;

			System.out.printf("%s가 부르는 %s가 재생되어지고 있습니다 - %d분 %d초%n", singer, title, min, sec);
		}

	}

}
