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
				dos.writeUTF("��� �ݰ���");
				dos.writeUTF("�������� ����� ���� �׳�����");
				dos.writeUTF("�ؽļ��迡 �°� ȯ���Ѵ� ���̸���?");

				String clientMsg = dis.readUTF();

				if (clientMsg.equals("���ؽ�")) {
					dos.writeUTF("��~ �����̶� ���������� �� ���̴�?");
					if (dis.readUTF().equals("22")) {
						dos.writeUTF("�� ���� �����̶�~");
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
