package racingcar.model;

public class GoodCondition implements Condition {

    @Override
    public boolean inspect() {
        return true;
    }
}