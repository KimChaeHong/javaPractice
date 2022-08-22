package ch10;

/**
 * @author coghd
 * 2022. 8. 22. - 오전 10:40:40
 * 10. 접근 제어 지시자(access modifier)와 정보은닉(infomation hiding)
 * 접근제어 지시자 쓰는 이유 - 멤버변수의 오용을 객체가 잘못 사용하는 것을 막는다
 */
public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	

	public int getDay() {
		return day;
	}

	//반환값을 받는다
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month >12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;		
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년" + month + "월" + day + "일");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		
	}
//readonly
	public boolean getIsValid() {
		return isValid;
	}	
	

}
