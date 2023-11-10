package Lv0;

/*
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 
 * return하도록 soltuion 함수를 완성해주세요.
 * 
 * */

public class SubtractTwoNumbers {
	
	public static void main(String[] args) {
        SubtractTwoNumbers calculator = new SubtractTwoNumbers();
        int result = calculator.solution(3, 4);
        System.out.println("Result: " + result);
    }

    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }


}

