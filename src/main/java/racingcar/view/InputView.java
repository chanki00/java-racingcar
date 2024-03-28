package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.ArrayList;

public class InputView {
    public void inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        ArrayList<Car> cars = new ArrayList<>();
        String names[] = Console.readLine().split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public int inputCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());
        return tryCount;
    }
}
