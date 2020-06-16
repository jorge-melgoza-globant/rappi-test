package main.java.com.globant.rappi.test.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Result {

    List<BinaryOperator<Integer>> operations;

    public Result() {
        this.operations = new ArrayList<>();

        this.operations.add((x, y) -> x + y);
        this.operations.add((x, y) -> x * y);
        this.operations.add((x, y) -> x - y);
    }

    public Optional<Integer> result(int x, int y){
        return this.operations.stream().map(o -> o.apply(x, y)).reduce(Integer::sum);
    }
}
