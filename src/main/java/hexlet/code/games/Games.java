package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Games {
        public static class EvenGame {
            public static void start() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("May I have your name? ");
                String name = scanner.nextLine();
                Engine.start("Even Game", name, new Engine.GameLogic() {
                    private final Random random = new Random();

                    @Override
                    public String getQuestion() {
                        int number = random.nextInt(100) + 1;
                        return String.valueOf(number);
                    }

                    @Override
                    public String getCorrectAnswer() {
                        // Определяем правильный ответ
                        int number = Integer.parseInt(getQuestion());
                        return (number % 2 == 0) ? "yes" : "no";
                    }
                });
            }
        }

        // Измененный класс Calculator
        public static class Calc {
            public static void start() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("May I have your name? ");
                String name = scanner.nextLine();

                Engine.start("Calculator Game", name, new Engine.GameLogic() {
                    private final Random random = new Random();
                    private int currentAnswer;

                    @Override
                    public String getQuestion() {
                        int number1 = random.nextInt(99);
                        int number2 = random.nextInt(99);
                        int operation = random.nextInt(3);
                        String operator = "";

                        switch (operation) {
                            case 0:
                                operator = "+";
                                currentAnswer = number1 + number2;
                                break;
                            case 1:
                                operator = "-";
                                currentAnswer = number1 - number2;
                                break;
                            case 2:
                                operator = "*";
                                currentAnswer = number1 * number2;
                                break;
                        }
                        return number1 + " " + operator + " " + number2;
                    }

                    @Override
                    public String getCorrectAnswer() {
                        return String.valueOf(currentAnswer);
                    }
                });
            }
        }

        public static class GCD {
            public static void start() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("May I have your name? ");
                String name = scanner.nextLine();
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.start("GCD Game", name, new Engine.GameLogic() {

                    private final Random random = new Random();
                    private int num1, num2;

                    @Override
                    public String getQuestion() {
                        num1 = random.nextInt(100) + 1;
                        num2 = random.nextInt(100) + 1;
                        return num1 + " " + num2;
                    }

                    @Override
                    public String getCorrectAnswer() {
                        return String.valueOf(gcd(num1, num2));
                    }
                });}
private static int gcd(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                } return a;
}
            }
        }
