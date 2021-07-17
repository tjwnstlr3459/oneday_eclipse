package kakao;

public class KakaoQuiz {

	int[]cacheSize;
	View view;

	public KakaoQuiz() {
		super();
		cacheSize = new int[30];
		view = new View();
	}
	
	public void main() {
		
		while(true) {
			for (int i = 0; i < cacheSize.length; i++) {
				cacheSize[i]=view.citycity();
			}
		}
	}
}
