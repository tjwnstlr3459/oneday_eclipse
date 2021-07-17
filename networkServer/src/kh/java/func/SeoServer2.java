package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SeoServer2 {
	public void main() {
		int serverPort = 18081;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		ServerSocket server = null;
		Scanner sc = new Scanner(System.in);

		try {
			server = new ServerSocket(serverPort);

			Socket client = server.accept();

			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();

			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);

			while (true) {
				dos.writeUTF("어서와 반가워");
				dos.writeUTF("들어오느라 고생이 많다 그나저나");
				dos.writeUTF("준식세계에 온걸 환영한다 내이름은?");

				String clientMsg = dis.readUTF();

				if (clientMsg.equals("서준식")) {
					dos.writeUTF("여~ 정답이라구 다음문제는 내 나이는?");
					if (dis.readUTF().equals("22")) {
						dos.writeUTF("이 또한 정답이라구~");
					} else {
						break;
					}
				} else {
					break;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch
			e.printStackTrace();
		}
	}
}
