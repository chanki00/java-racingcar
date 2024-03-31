package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static List<String> inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        List<String> names = Arrays.stream(Console.readLine().split(",")).toList();
        return names;
    }

    public static int inputCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(Console.readLine());
        return count;
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<String> cars = inputName();
        int tryCount = inputCount();

        for (int i=0; i<tryCount; ++i) {
            
        }
    }
}