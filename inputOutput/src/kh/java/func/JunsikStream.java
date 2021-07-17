package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JunsikStream {

	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ��������

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(fileName);
			System.out.println(fileName + "�� ����� �����Է�");
			System.out.println("����� exit");
			int lineNum = 1;
			while (true) {
				System.out.print((lineNum++) + " : ");
				String str = sc.nextLine() + "\n";
				if (str.equals("exit\n")) {
					break;
				}
				fos.write(str.getBytes());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void primaryStream2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		sc.nextLine();

		FileWriter fw = null;

		try {
			fw = new FileWriter("C:\\Users\\���ؽ�\\Desktop\\" + fileName);
			int lineNum = 1;
			System.out.println(fileName + "�� ���� ����");
			while (true) {
				System.out.print((lineNum++) + " : ");
				String str = sc.nextLine() + "\n";
				if (str.equals("exit\n")) {
					break;
				}
				fw.write(str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//������Ʈ���� �̿��� ���
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		BufferedWriter bw = null;	//���� ��Ʈ��
		
		try {
			FileWriter fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			
			int lineNum =1;
			System.out.println(fileName+"�� �Է��� ����");
			while(true) {
				System.out.print(lineNum+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				bw.write(str);
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	//���Ͽ��� ���α׷����� ������
	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		//1.��Ʈ������(��ü�� ����)
		//2.�޼ҵ带 �̿��� �Է� or ���
		//3. �ڿ���ȯ
		System.out.print("�ε� �� ���ϸ� �Է� :");
		String fileName = sc.next();
		sc.nextLine();
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			while(true) {
				String str = br.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void imageStream() {
		
		BufferedReader br = null;
		BufferedOutputStream bos = null;
		
		try {
			FileReader fis = new FileReader("quiz.txt");
			br = new BufferedReader(fis);
			String str = br.readLine();//���پ�
			
			
			FileOutputStream fos = new FileOutputStream("test.gif");
			bos = new BufferedOutputStream(fos);
			
			ArrayList<Byte> al = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(str," ");
			
			while(st.hasMoreTokens()) {
				String num = st.nextToken();
				int iNum = Integer.parseInt(num, 16);
				al.add((byte) iNum);
			}
			for (Byte arr : al) {
				bos.write(arr);
			}
			System.out.println("���� �������� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}































