package interfacePractice;

public class Player implements MyPlayList,OtherPlayList{
	
	public static void main(String[] args) {
		Player plaobj=new Player();
		plaobj.playAudioList();
		plaobj.countTotalPlayList();
		MyPlayList.playVideoList();
	}
	
//	public void playAudioList() {
//		System.out.println("Palyer-This is default audio playlist");
//	}
	
	@Override
	public void countTotalPlayList() {
		// TODO Auto-generated method stub
		System.out.println("Count number of playlist");
		
	}

	@Override
	public void playAudioList() {
		// TODO Auto-generated method stub
		OtherPlayList.super.playAudioList();
	}

}
