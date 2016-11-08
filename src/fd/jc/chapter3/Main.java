package fd.jc.chapter3;

/**
 * Created by JackieChen on 2016/11/7.
 */
public class Main {

    public static void main(String []args){
        Tank tank1=new Tank();
        Tank tank2=new Tank();
        tank1.val=13;
        tank2.val=33;
        /**
         * Attention if left value is a reference,then "=" operation changes the object it point to
         */
        System.out.println("tank1:"+tank1.val+"   tank2:"+tank2.val);
        System.out.println("before op tank1=tank2:"+ (tank1==tank2));
        System.out.println("equals before op tank1=tank2:"+ (tank1.equals(tank2)));
        tank1=tank2;
        System.out.println("after op tank1=tank2:"+ (tank1==tank2));
        System.out.println("equals after op tank1=tank2:"+ (tank1.equals(tank2)));



        tank1.val=0;

        System.out.println("tank1:"+tank1.val+"   tank2:"+tank2.val);

        tank2.val=100;

        System.out.println("tank1:"+tank1.val+"   tank2:"+tank2.val);
        /**
         * This will also happens when reference is a parameter of a function
         */
        change(tank1);
        System.out.println("tank1:"+tank1.val+"   tank2:"+tank2.val);
        Tank tank3=tank1;
        System.out.println("float max exp:"+Float.MAX_EXPONENT );
        System.out.println("float max value:"+Float.MAX_VALUE );
        System.out.println("float min exp:"+Float.MIN_EXPONENT );
        System.out.println("float min value:"+Float.MIN_VALUE );

        System.out.println("double max exp:"+Double.MAX_EXPONENT );
        System.out.println("double max value:"+Double.MAX_VALUE );
        System.out.println("double min exp:"+Double.MIN_EXPONENT );
        System.out.println("double min value:"+Double.MIN_VALUE );





    }

    static  void change(Tank a ){
        a.val=9999;
    }
}

class Tank{
    int val;
}
