public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {

        System.out.printf("%d %s %d = ",v1, op, v2);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 1, 2));
    }
}