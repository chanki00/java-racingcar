package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

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

    public static int generateRandNum() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static boolean satisfiedCondition(int randNum) {
        return randNum >= 4;
    }

    public static int advance() {
        int result = 0;
        if (satisfiedCondition(generateRandNum())) {
            ++result;
        }
        return result;
    }

    public static void startRound(Map<String, Integer> cars) {
        for (String name : cars.keySet()) {
            int currVal = cars.get(name) + advance();

            cars.put(name, currVal);

            System.out.print(name + " : ");
            for (int i=0; i<currVal; ++i) {
                System.out.println("-");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Map<String, Integer> cars = inputName();
        int tryCount = inputCount();

        System.out.println("실행 결과");
        for (int i=0; i<tryCount; ++i) {
            startRound(cars);
        }
    }
}