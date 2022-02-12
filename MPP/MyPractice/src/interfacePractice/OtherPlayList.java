package interfacePractice;

public interface OtherPlayList {
	default void playAudioList() {
		System.out.println("OtherPlayList-This is default audio playlist");
	}
	
	public static void playVideoList() {
		System.out.println("OtherPlayList-This video playlist");
	}
}
