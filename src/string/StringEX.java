package string;

public class StringEX {

	public static void main(String[] args) {
		//기본형 형식의 사용 (new 사용하지 않고 사용)
		String str = "ABCDE";
		
		//참조형 형식의 사용(new를 사용)
		
		String str1 = new String("ABCDE");
		
		System.out.println("기본형 형식 :"+str1);
		System.out.println("참조형 형식 :"+str1);
		
		//==비교: 기본형 병식과 참조형 형식이 다른 결과를 반환한다.
		System.out.println("기본형 형식 "+(str =="ABCDE"));
		System.out.println("참조형 형식 "+(str1 =="ABCDE"));
		//equals 비교 : 기본형 형식과 참조형 형식이 같은 결과를 반환한다.
		System.out.println("기본형 형식 "+(str.equals("ABCDE")));
		System.out.println("참조형 형식 "+(str1.equals("ABCDE")));
		
		//글자수 반환
		System.out.println(str+"은 "+str.length()+"글자");
		
		str1 = "noop0728@naver.com";
		System.out.printf("%s는 %d자 \n",str1,str1.length());
		
		//대소문자로 변환
		str= "aBcdE";
		System.out.println(str+"을 모두 대문자로: "+str.toUpperCase());
		System.out.println(str+"을 모두 소문자로: "+str.toLowerCase());
		
		//X번째 인덱스 문자 얻기
		char c = str.charAt(2);
		//자신의 메일주소에서 @을 변수에 저장해서 출력
		char a = str1.charAt(8);
		System.out.println(a);
		
		//문자열 안에서 특정 문자열의 시작인덱스를 얻기
		str="Java Oracle JDBC";
		System.out.println(str+"에서의 r의 인덱스"+str.indexOf("r"));
		System.out.println(str+"에서 \"ora\"의 인덱스"+str.indexOf("Ora"));
		//존재하지 않는 문자열은 -1이 나온다.
		System.out.println(str+"에서 \"ora\"의 인덱스"+str.indexOf("ora"));
		
	}

}
