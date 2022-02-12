package lamdaexpression;

public class LamdaPractice {

	
	/*
	public static void main(String[] args) {
		LamdaPractice lamdaExpression=new LamdaPractice();
		lamdaExpression.greeting();
		  
//			 lamda expression calling 
//			 
//				MyPlayList gretting=()-> {			
//				 	System.out.println("This is GREATTING Message");
//			 	};
//			 	gretting.greeting();
		 	
		String strObj=lamdaExpression.getPlayListName("Harry Potter");
		System.out.println(strObj);
		
	}

		@Override
		public void greeting() {
			// TODO Auto-generated method stub
			
			System.out.println("This is GREATTING Message");
			
		}

	*/
	
	
/*	
	
	public static void main(String[] args) {
//		LamdaPractice lamdaExpression=new LamdaPractice();
//		String strObj=lamdaExpression.getPlayListName("Harry Potter");
//		System.out.println(strObj);
		
      //		 lamda expression calling 
		MyPlayList palyList=(String playListName)->{
			System.out.println("This is lamda with with argument");
			return playListName;
		};
		System.out.println(palyList.getPlayListName("Harry Potter"));
	}
	
	/*
		@Override
		public String getPlayListName(String playListName) {
			// TODO Auto-generated method stub
			return playListName;
		}
	*/
	

	public static void main(String[] args) {
//		LamdaPractice lamdaExpression=new LamdaPractice();
//		System.out.println(lamdaExpression.getPlayListCount("Bangla Vison",34));
		
		MyPlayList myList=(String channelName, int count)->{
			System.out.println("the cahannel name is "+channelName+" total count "+count);
			return count;
		};
		System.out.println(myList.getPlayListCount("ATN Bangla", 23));
	}

	
	
	
	
	/*
	@Override
	public int getPlayListCount(String channelName, int count) {
		System.out.println("the cahannel name is "+channelName+" total count "+count);
		return count;
	}
	*/
	
	
	
	
}

