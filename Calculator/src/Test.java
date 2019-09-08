public class Test {
    static void test(){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(ToRoman.map.get(i) + " + " + ToRoman.map.get(i) + " = " + ToRoman.toRoman(ArithmeticAction.addition(i,i)) + ";\t "
                    + ToRoman.map.get(i) + " * " + ToRoman.map.get(i) + " = " + ToRoman.toRoman(ArithmeticAction.multiplication(i,i)) + ";\t "
                    + ToRoman.map.get(i) + " - " + ToRoman.map.get(i-1) + " = " + ToRoman.toRoman(ArithmeticAction.subtraction(i,i-1)) + ";\t "
                    + ToRoman.map.get(i) + " / " + ToRoman.map.get(i) + " = " + ToRoman.toRoman(ArithmeticAction.division(i,i)) + ";\t ");
        }
    }
}
