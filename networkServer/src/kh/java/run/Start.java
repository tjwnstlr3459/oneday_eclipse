package kh.java.run;

import kh.java.func.BaseBallServer;
import kh.java.func.ChattingServer;
import kh.java.func.SeoServer;
import kh.java.func.SeoServer2;
import kh.java.func.TcpServer;
import kh.java.func.UdpServer;
import kh.java.func.jihumBallServer;

public class Start {

	public static void main(String[] args) {
		TcpServer ts = new TcpServer();
		SeoServer ss = new SeoServer();
		SeoServer2 sss = new SeoServer2();
		BaseBallServer bs = new BaseBallServer();
		jihumBallServer jb = new jihumBallServer();
		UdpServer us = new UdpServer();
		ChattingServer cs = new ChattingServer();
		cs.chattingServer();
		//us.main();
		//jb.main();
		//ss.main();
		//ts.main();
		//ss.main();
		//bs.main();

	}

}
