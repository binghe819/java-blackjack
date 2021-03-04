package blackjack.view;

import blackjack.domain.player.Gamer;
import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String[] inputGamerNames() {
        OutputView.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        return scanner.nextLine().split(",");
    }

    public static boolean inputHitOrStand(String gamerName) {
        System.out.printf("%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)\n", gamerName);
        String input = scanner.nextLine();
        return "y".equals(input);
    }
}
