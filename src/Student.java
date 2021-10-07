/**
 * Project name(项目名称)：可变参数 variable-parameter
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/7
 * Time(创建时间)： 12:48
 * Version(版本): 1.0
 * Description(描述)： 声明可变参数的语法格式如下：
 * methodName({paramList},paramType…paramName)
 * 其中，methodName 表示方法名称；paramList 表示方法的固定参数列表；paramType 表示可变参数的类型；
 * … 是声明可变参数的标识；paramName 表示可变参数名称。
 * 注意：可变参数必须定义在参数列表的最后。
 */

public class Student
{
    public void display(String... name)
    {
        for (String s : name)
        {
            System.out.print(s + "\t\t");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Student s = new Student();
        s.display("123", "456", "7", "56", "5");
        s.display("a", "b", "c");
        s.display("d");
        s.display("f", "r");
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}
