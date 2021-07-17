package kh.java.start;

import kh.java.func.ByteStreamTest;
import kh.java.func.CharStreamTest;
import kh.java.func.FileTest;
import kh.java.func.JunsikStream;
import kh.java.func.StreamTest;
import kh.java.func.UserMgr;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteStreamTest bs = new ByteStreamTest();
		CharStreamTest ct = new CharStreamTest();
		StreamTest st =new StreamTest();
		FileTest ft = new FileTest();
		UserMgr um = new UserMgr();
		
		JunsikStream js = new JunsikStream();
		//bs.primaryStream();
		//ct.charStreamReader();
		//st.imageStream();
		//ft.fileTest();
		um.main();
		//js.imageStream();
	}

}
