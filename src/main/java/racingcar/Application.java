package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Application {
    public static List<Car> inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        String[] names = Console.readLine().split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name));
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

    public static void advance(Car car) {
        int currCount = car.getAdvanceCount();
        if (satisfiedCondition(generateRandNum())) {
            car.setAdvanceCount(currCount+1);
        }
    }

    public static void startRound(List<Car> cars) {
        for (Car car : cars) {
            advance(car);
            int currCount = car.getAdvanceCount();
            System.out.print(car.getName() + " : ");
            for (int i=0; i<currCount; ++i) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }




    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<Car> cars = inputName();

        int tryCount = inputCount();

        System.out.println("실행 결과");
        for (int i=0; i<tryCount; ++i) {
            startRound(cars);
        }


    }
}