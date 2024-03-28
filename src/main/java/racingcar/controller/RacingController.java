package racingcar.controller;

import racingcar.view.InputView;

public class RacingController {
    public static void startRacing() {
        InputView inputView = new InputView();
        inputView.inputName();
        int tryCount = inputView.inputCount();

        for (int i=0; i<tryCount; ++i) {

        }
    }
}
