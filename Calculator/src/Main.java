
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическое действие");

        Scanner scanner = new Scanner(System.in);


            for (;;){
                try {
                    String s = scanner.nextLine();

                if (s.contains("+")){
                    String[] n = s.split("\\+");
// Проверка на римские цифры
                    if (ToRoman.map.containsValue(n[0]) && ToRoman.map.containsValue(n[1])){

                        for (Map.Entry<Integer, String> m : ToRoman.map.entrySet()){

                            for (Map.Entry<Integer, String> p : ToRoman.map.entrySet()){

                                if (m.getValue().equals(n[0]) && p.getValue().equals(n[1])){
                                    System.out.println(ToRoman.toRoman(ArithmeticAction.addition(m.getKey(),p.getKey())));
                                }
                            }
                        }
                    }
// Проверка на арабскте цифры
                    else if (Arabs.map.contains(Integer.parseInt(n[0].trim())) && Arabs.map.contains(Integer.parseInt(n[1].trim()))){
                        int nA = Integer.parseInt(n[0].trim());
                        int nB = Integer.parseInt(n[1].trim());

                        System.out.println(ArithmeticAction.addition(nA,nB));

                        continue;
                    }
                }

                if (s.contains("-")){
                    String[] n = s.split("-");

// Проверка на римские цифры
                    if (ToRoman.map.containsValue(n[0]) && ToRoman.map.containsValue(n[1])){

                        for (Map.Entry<Integer, String> m : ToRoman.map.entrySet()){

                            for (Map.Entry<Integer, String> p : ToRoman.map.entrySet()){

                                if (m.getValue().equals(n[0]) && p.getValue().equals(n[1])){
                                    System.out.println(ToRoman.toRoman(ArithmeticAction.subtraction(m.getKey(),p.getKey())));
                                }
                            }
                        }
                    }

// Проверка на арабскте цифры
                    else if (Arabs.map.contains(Integer.parseInt(n[0].trim())) && Arabs.map.contains(Integer.parseInt(n[1].trim()))){
                        int nA = Integer.parseInt(n[0].trim());
                        int nB = Integer.parseInt(n[1].trim());

                        System.out.println(ArithmeticAction.subtraction(nA,nB));

                        continue;
                    }
                }

                if (s.contains("*")){
                    String[] n = s.split("\\*");

// Проверка на римские цифры
                    if (ToRoman.map.containsValue(n[0]) && ToRoman.map.containsValue(n[1])){

                        for (Map.Entry<Integer, String> m : ToRoman.map.entrySet()){

                            for (Map.Entry<Integer, String> p : ToRoman.map.entrySet()){

                                if (m.getValue().equals(n[0]) && p.getValue().equals(n[1])){
                                    System.out.println(ToRoman.toRoman(ArithmeticAction.multiplication(m.getKey(),p.getKey())));
                                }
                            }
                        }
                    }

// Проверка на арабскте цифры
                    else if (Arabs.map.contains(Integer.parseInt(n[0].trim())) && Arabs.map.contains(Integer.parseInt(n[1].trim()))){
                        int nA = Integer.parseInt(n[0].trim());
                        int nB = Integer.parseInt(n[1].trim());

                        System.out.println(ArithmeticAction.multiplication(nA,nB));

                        continue;
                    }
                }

                if (s.contains("/")){
                    String[] n = s.split("/");

// Проверка на римские цифры
                    if (ToRoman.map.containsValue(n[0]) && ToRoman.map.containsValue(n[1])){

                        for (Map.Entry<Integer, String> m : ToRoman.map.entrySet()){

                            for (Map.Entry<Integer, String> p : ToRoman.map.entrySet()){

                                if (m.getValue().equals(n[0]) && p.getValue().equals(n[1])){
                                    System.out.println(ToRoman.toRoman(ArithmeticAction.division(m.getKey(),p.getKey())));
                                }
                            }
                        }
                    }

// Проверка на арабскте цифры
                    else if (Arabs.map.contains(Integer.parseInt(n[0].trim())) && Arabs.map.contains(Integer.parseInt(n[1].trim()))){
                        int nA = Integer.parseInt(n[0].trim());
                        int nB = Integer.parseInt(n[1].trim());

                        System.out.println(ArithmeticAction.division(nA,nB));

                        continue;
                    }
                }

                } catch (Exception e){
                    System.err.println("Введен неверный формат!");
                    break;
                }
            }
    }
}
