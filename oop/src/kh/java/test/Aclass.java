package kh.java.test;

public class Aclass extends Bclass{
	private int num;

	public Aclass() {
		super();//�θ� ������ ȣ�� Bclass()
		// TODO Auto-generated constructor stub
	}

	public Aclass(int num,int no) {
		super(no);	//�θ� ������ ȣ�� Bclass(int no)
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override//�θ�޼ҵ�� �������� ���ƾ��� �����ϱ����� ��Ÿ����
	public void printMsg() {
		System.out.println("�� Aclass��!!");
	}
}
