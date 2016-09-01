/**
 * Created by n on 2016/1/26.
 */
public class ExceptionTest {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            try {
                methodWithException();
            }catch (RuntimeException re){
                System.out.println("program goes here");
                re.printStackTrace();
                continue;
            }

            System.out.println("test not here");
        }
    }

    public static void methodWithException(){
        try {
            throw new RuntimeException("程序出现异常");
        }catch (RuntimeException re){
            //re = runtimeException;
            throw new RuntimeException(re.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
