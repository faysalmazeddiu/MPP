package interfacePractice;

public interface MyPlayList {
	
	
	default void playAudioList() {
		System.out.println("MyPlayList-This is default audio playlist");
	}
	
	public static void playVideoList() {
		System.out.println("MyPlayList-This video playlist");
	}
	
	void countTotalPlayList();
}
