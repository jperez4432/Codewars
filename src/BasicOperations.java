
    public class BasicOperations{
        public static Integer basicMath(String symbol, int x, int y){
            switch (symbol){
                case "+": return x+y;
                case "-": return x-y;
                case "*": return x*y;
                case "/": return x/y;
            }
            return 0;
        }


    public static void main(String[] args) {
        System.out.println(basicMath("+", 1, 2));
    }
}