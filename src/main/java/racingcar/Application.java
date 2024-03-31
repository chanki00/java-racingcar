package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;

public class Application {
    public static Map<String, Integer> inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        String[] names = Console.readLine().split(",");
        Map<String, Integer> cars = new HashMap<>();

        for (String name : names) {
            cars.put(name, 0);
        }

        return cars;
    }

    public static int inputCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(Console.readLine());
        return count;
    }

    public static void

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Map<String, Integer> cars = inputName();
        int tryCount = inputCount();

        for (int i=0; i<tryCount; ++i) {

        }
    }
}