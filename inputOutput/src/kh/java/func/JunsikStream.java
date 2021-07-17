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
		System.out.print("저장할 파일명을 입력하세요 : ");
		String fileName = sc.next();
		sc.nextLine(); // 버퍼 엔터제거

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(fileName);
			System.out.println(fileName + "에 저장될 내용입력");
			System.out.println("종료는 exit");
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
		System.out.print("저장할 파일명을 입력하세요 : ");
		String fileName = sc.next();
		sc.nextLine();

		FileWriter fw = null;

		try {
			fw = new FileWriter("C:\\Users\\서준식\\Desktop\\" + fileName);
			int lineNum = 1;
			System.out.println(fileName + "에 적을 내용");
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
	//보조스트림을 이용한 기능
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		BufferedWriter bw = null;	//보조 스트림
		
		try {
			FileWriter fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			
			int lineNum =1;
			System.out.println(fileName+"에 입력할 내용");
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
	
	//파일에서 프로그램으로 보내기
	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		//1.스트림생성(객체를 생성)
		//2.메소드를 이용한 입력 or 출력
		//3. 자원반환
		System.out.print("로드 할 파일명 입력 :");
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
			String str = br.readLine();//한줄씩
			
			
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
			System.out.println("파일 내보내기 완료");
			
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































