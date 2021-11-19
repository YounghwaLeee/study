import java.util.Stack;

//먼저나온게 먼저 나오는지 확인하면 된다.
public class StackTest {

	public StackTest() {
			Stack<String> stack = new Stack(); 
			
			//stack은 먼저 입력된 정보가 나중에 출력된다. (FILO:first in last out) 밑에서부터 위로 홍길동~김정희 순으로 들어감.
																		//pop을 하면 김정희가 나옴.
			//queue : fifo 먼저나온애가 먼저 나온다.
			//push : 입력 , pop(): 출력
			stack.push("홍길동");
			stack.push("세종대왕");
			stack.push("이순신");
			stack.push("김정희");
			
			//empty라는 메소드는 stack에 객채가 있으면 false가 들어오고, -> 비어있는지 물어보는거니까
			//객체가 없을 때 true 있나 없나가 아니고 비어있냐 라고 물어보는거니깐 . 
			//while(!stack.empt 부정을 하면 객체가 있을때 ture 라고 온다.
			while(!stack.empty()) {
				String name=stack.pop();
				System.out.println(name);
			}

	}

	public static void main(String[] args) {

		 new StackTest();
	}

}
