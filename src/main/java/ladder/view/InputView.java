package ladder.view;

import ladder.domain.LadderResults;
import ladder.domain.Players;

import java.util.Scanner;

public class InputView {

  private static final Scanner scanner = new Scanner(System.in);

  public static Players inputPlayers() {
    System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    return Players.of(scanner.nextLine());
  }

  public static int inputHeight() {
    System.out.println("최대 사다리 높이는 몇 개인가요?");
    return Integer.parseInt(scanner.nextLine());
  }

  public static LadderResults inputLadderResult(Players players) {
    System.out.println("실행결과를 입력하세요");
    return LadderResults.of(scanner.nextLine(), players.size());
  }

  public static String inputResultPlayer() {
    System.out.println("결과를 보고 싶은 사람은?");
    return scanner.nextLine();
  }
}
