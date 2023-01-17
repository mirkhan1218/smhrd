package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {

		MP3Player mp3 = new MP3Player();

		String path = "C:\\Users\\smhrd\\Desktop\\music\\";

		// Music 설계도를 통해 음악 4개를 만들어주자
		Music m1 = new Music("How you like that", "블랙핑크", 160, path + "How you like that.mp3");
		Music m2 = new Music("Maria", "화사", 180, path + "Maria.mp3");
		Music m3 = new Music("MAGO", "여자친구", 150, path + "MAGO.mp3");
		Music m4 = new Music("살짝설랬어", "오마이걸", 120, path + "살짝설랬어.mp3");

		// music 4개를 한번에 관리할 수 있도록, 순차적 접근이 가능하도록
		// ArrayList에 담아주자
		ArrayList<Music> musicList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();

		musicList.add(m1);
		musicList.add(m2);
		musicList.add(m3);
		musicList.add(m4);

		int i = 0;

		// [1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) { // 재생
				con.playing(musicList, i);

			} else if (select == 2) { // 정지
				con.pause();

			} else if (select == 3) { // 이전곡
				i = con.preMusic(musicList, i);

			} else if (select == 4) { // 다음곡
				i = con.nextMusic(musicList, i);
				
			} else if (select == 5) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				System.out.println("프로그램이 종료되었습니다.");
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
			con.musicInfo(musicList, i); // 재생 노래 정보 표시 <"가수"가 부르는 "노래"가 재생되어지고 있습니다 - " 분 초">
			
			}

		}

	}

