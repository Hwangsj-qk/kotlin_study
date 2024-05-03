package kt_240503.p_extension;

public class JavaMain {
    public static void main(String[] args) {
        // 자바에서 확장함수 호출 시 스테틱 함수처럼 사용할 수 있음
        char lastChar = Extension4Kt.lastChar("고길동");
        System.out.println("lastChar = " + lastChar);


    }
}
