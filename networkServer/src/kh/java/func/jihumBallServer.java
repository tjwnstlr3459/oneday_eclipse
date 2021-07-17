package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class jihumBallServer {

	public void main() {
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ArrayList<Integer> serverBallArr = new ArrayList<Integer>();
		ArrayList<Integer> clientBallArr = new ArrayList<Integer>();
		int port = 5555;

		Random r = new Random();
		int quizCnt = 0;
		int strikeCnt = 0;
		int ballCnt = 0;

		// Server ����
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

		System.out.println("< < < < < BaseBall Game > > > > > ");
		try {
			while (true) {

				System.out.println("Ŭ���̾�Ʈ ���� ��û�� ��ٸ��ϴ�.....");
				// Client - Server ����
				try {
					Socket client = server.accept();
					dis = new DataInputStream(client.getInputStream());
					dos = new DataOutputStream(client.getOutputStream());
				} catch (IOException e) {
					System.out.println("Ŭ���̾�Ʈ ���� ����");
					continue;
				}
				System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
				// game reset
				quizCnt = 0;
				strikeCnt = 0;
				ballCnt = 0;
				serverBallArr.clear();
				// Random ����
				while (true) {
					int ball = r.nextInt(9);
					// �ߺ� üũ
					if (!serverBallArr.contains(ball)) {
						serverBallArr.add(ball);
					} else {
						continue;
					}
					// 3�� �Է�
					if (serverBallArr.size() == 3) {
						break;
					}
				}
				// ���� ���� ���
				System.out.print("���� ���� : ");
				for (Integer ball : serverBallArr) {
					System.out.print(ball + " ");
				}
				System.out.println();

				// Client ���� �б�
				while (true) {
					clientBallArr.clear();
					while (true) {
						clientBallArr.add(dis.readInt());
						if (clientBallArr.size() == 3) {
							break;
						}
					}
					quizCnt++; // quiz Ǭ Ƚ�� ����
					System.out.print("Ŭ���̾�Ʈ�� �Է��� �� -> ");
					for (Integer ball : clientBallArr) {
						System.out.print(ball + " ");
					}
					System.out.println();

					for (int i = 0; i < clientBallArr.size(); i++) {
						// clientball read
						int answer = clientBallArr.get(i);
						// ballCheck
						if (serverBallArr.contains(answer)) {
							int serverball = serverBallArr.indexOf(answer);
							// Strike
							if (serverball == i) {
								strikeCnt++;
							} else { // ball
								ballCnt++;
							}
						}
					}
					// Strike/Ball ����
					dos.writeInt(strikeCnt);
					dos.writeInt(ballCnt);

					System.out.println(quizCnt + "ȸ -----> " + strikeCnt + "��Ʈ����ũ " + ballCnt + "��");

					// ����
					if (strikeCnt == 3) {
						System.out.println("����!!");
						System.out.println("���� Ŭ���̾�Ʈ���� ������ �����մϴ�.");
						break;
					}
					// 10ȸ �ʰ�
					if (quizCnt == 10) {
						System.out.println("�õ�Ƚ��  " + quizCnt + " ȸ�� Ŭ���̾�Ʈ ������ �����մϴ�.");

						for (Integer ball : serverBallArr) {
							dos.writeInt(ball);
						}
						break;
					}
					// ���� �� �� �ʱ�ȭ
					strikeCnt = 0;
					ballCnt = 0;
				}
			}
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ ���");
			try {
				server.close();
				dis.close();
				dos.close();
			} catch (IOException e2) {
				System.out.println("���� ���� ����");
			}
		}
	}
}
