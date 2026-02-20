package _24_Exception;
// 커스텀 체크예외 - Exception 상속받아 준다
public class MyCheckedException extends Exception {

    //생성자
    public MyCheckedException(String message){
        super(message);
    }
}
