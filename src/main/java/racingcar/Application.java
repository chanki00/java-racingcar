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

    public static List<Car> findWinner(List<Car> cars) {
        int maxValue = cars.stream().map(car -> car.getAdvanceCount()).max((o1, o2) -> o1-o2).orElse(0);
        List<Car> winners = cars.stream().filter(o1 -> o1.getAdvanceCount() == maxValue).toList();
        return winners;
    }


    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<Car> cars = inputName();

        int tryCount = inputCount();

        System.out.println("실행 결과");
        for (int i=0; i<tryCount; ++i) {
            startRound(cars);
        }

        List<Car> winners = findWinner(cars);

        int winnerCount = winners.size();

        System.out.print("최종 우승자 : ");
        if (winnerCount > 1) {
            for (int i=0; i<winnerCount-1; ++i) {
                System.out.print(winners.get(i).getName() + ", ");
            }
        }
        System.out.println(winners.get(winnerCount-1).getName());

    }
}