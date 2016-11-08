package fd.jc.chapter5;

/**
 * Created by JackieChen on 2016/11/7.
 */
public class Main {
    static  class MyThis{
        void print(){
            System.out.println(this.hashCode());

        }

    }

    /**
     * Not safe
     * Do not know when garbage collector is on its way
     * thus this action is not safe
     * @throws Throwable
     */

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.hashCode()+" finalize");
        super.finalize();

    }

    public static void  main(String[]args){
        MyString myString1=new MyString();
        MyString myString2=new MyString();
        System.out.println(myString1.no);
        System.out.println(myString1.yes);
        Main main1=new Main();
        System.out.println(main1.hashCode());
        Main main2=new Main();
        main1=main2;//thus the object refered by main1 will be gc
        System.gc();


        /**
         * following says "this" is the refernece to the same object
         */
        MyThis a=new MyThis();

        a.print();
        System.out.println(a.hashCode());

    }
}
