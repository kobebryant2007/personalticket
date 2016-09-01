import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by n on 2015/12/16.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //throw new Exception();
        Test test = new Test();
        try {
            test.exceptionTest();
        }catch (Exception e){
            e.printStackTrace();
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date startdate = new Date();
        //startdate.setDate(startdate.getDate()-5);
        startdate.setHours(0);
        startdate.setMinutes(0);
        startdate.setSeconds(0);
        startdate.setDate(13);
        startdate.setMonth(12);
        System.out.println(startdate.getDate() + "  " + startdate.getMonth() + " " + startdate.getTimezoneOffset());

        try{
            //throw new Exception();
            System.out.println("Hello World!");

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }

    public void exceptionTest() throws Exception {
        throw new Exception();
    }

}
