package java012_api.part08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java129_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";
		
		// a-zA-Z_*$가 sn변수에 포함이 되여 있으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); // false

		// sn변수에 숫자 0-9가 포함되여 있으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[0123456789].*"));
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*[\\d].*"));
		System.out.println(sn.matches(".*\\d.*"));
		
		// sn변수에 숫자 0-9가 포함되여 있지 않으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[^0123456789].*"));
		System.out.println(sn.matches(".*[^0-9].*"));
		System.out.println(sn.matches(".*[\\D].*"));
		System.out.println(sn.matches(".*\\D.*"));
		
		
		String sb = "bscba5";
		// sb변수에 저장된 값이 2로 시작되면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*"));

		// sb변수에 저장된 값이 2로 시작하고 5로 끝나면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*5"));

		// sb변수에 저장된 값이 a 또는 b로 시작하고 이후 5개의 문자가 있으면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));
		
		System.out.println("===Pattern===");
///////////////////////////////////////////////////////////

//Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
//있는지를 확인한다.
//Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern 
//인스턴스로 컴파일 한다.
//find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
//find(int start) : start 위치 부터 find 
//start() : 매칭되는 패턴의 시작 인덱스 반환 
//start(int group) : group이 매칭되는 시작 인덱스 반환
//end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
//end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
//group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
//groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
//matches() : 패턴이 전체 문자열과 일치하면 True
		
		
		String input  = "3a4bsfa";
		
		System.out.println(input.matches("\\d"));
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		System.out.println(mc); //java.util.regex.Matcher[pattern=\d region=0,7 lastmatch=]
		System.out.printf("%b  %s\n", mc.find() , mc.group());
		System.out.printf("%b  %s\n",mc.find(0), mc.group());
		System.out.printf("%b  %s\n",mc.find(1), mc.group());
		//System.out.printf("%b  %s\n",mc.find(4), mc.group());	
		System.out.printf("%b\n",mc.find(4));
		
		System.out.println("=====================================");
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);
		
		
		int i = 1;
		while(mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}
		
		System.out.println("=========10 20  30=========================");
		str = "The BEst10 things in best life are best30 free";
		ptPattern = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);		
		mhMatcher = ptPattern.matcher(str);
		
		i = 1;
		while(mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}
		
		
		
	}

}
