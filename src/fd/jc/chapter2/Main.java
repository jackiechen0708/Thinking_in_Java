package fd.jc.chapter2;

/**
 * Created by JackieChen on 2016/11/6.
 */

/**
 * Chapter 2 Everythin is object
 *
 *@see java.time.Clock
 *@since 1.0
 *
 */
public class Main {
    /**
     * 2.1 Operate object with reference<br>
     * 2.2 The object should be created by you , like "new Object();"<br>
     * 2.3 Java Garbage Collection(GC) makes programming easier<br>
     * 2.4 Class<br>
     * 2.5 Methods、Parameters、Return Value<br>
     */
    public  static int statici=10086;

    public static void main(String[]args){
        String s;//Declare a reference "s"
        s="123456";//Link reference s with an object

        //Five places to store data
        /**
         * In C following is ok ,variable hiden
         * But in Java is not right,because Java Designer think this is dangerous
         */
//        {
//            int x = 12;
//            {
//                int x = 96;
//            }
//        }
        {
            int inX=1;
            String inS;
        }


        Main main1=new Main();
        Main main2=new Main();
        //all object share same static variable
        main1.statici=2;
        System.out.println(main2.statici+"");







    }
  
    /**
     * @deprecated
     * @param s
     * @return
     * @throws Exception
     */
    public int seeTheLength(String s) throws Exception {
        return s.length();

    }

}
