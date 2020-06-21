package nextstep.step3.view;

import nextstep.step3.util.LadderScanner;

public class InputView {
    private InputView(){}

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int inputLadderHeight() {
        return LadderScanner.inputNumber();
    }

    public static String inputParticipants() {
        return LadderScanner.inputString();
    }
}
