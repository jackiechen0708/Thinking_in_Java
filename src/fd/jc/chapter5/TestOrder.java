package fd.jc.chapter5;

/**
 * Created by JackieChen on 2016/11/7.
 */

/**
 * 静态变量和静态初始化块顺序和定义顺序有关
 * 可以调整下面的顺序来观察结果
 *
 */
public class TestOrder {


    // 静态初始化块
    static {
        System.out.println("静态初始化块");
    }

    // 静态变量
    public static TestB b = new TestB();

    // 静态变量
    public static TestA a = new TestA();

    public static void main(String[] args) {
        new TestOrder();
    }
}

class TestA {
    public TestA() {
        System.out.println("Test--A");
    }
}

class TestB {
    public TestB() {
        System.out.println("Test--B");
    }
}

