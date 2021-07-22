package step3;

import java.util.Scanner;

public class InputView {

  public static final String NUMBER_OF_CARS_MESSAGE = "자동차 대수는 몇 대 인가요?";
  public static final String NUMBER_OF_ATTEMPTS_MESSAGE = "시도할 회수는 몇 회 인가요?";
  private Input input = new Input();

  public void render() {
    final Scanner scanner = new Scanner(System.in);
    print(NUMBER_OF_CARS_MESSAGE);
    final int numberOfCars = scanner.nextInt();
    print(NUMBER_OF_ATTEMPTS_MESSAGE);
    final int numberOfAttempts = scanner.nextInt();

    input.enter(numberOfCars, numberOfAttempts);
    scanner.close();
  }

  private void print(String message) {
    System.out.println(message);
  }

  public Input getInput() {
    return input;
  }
}
