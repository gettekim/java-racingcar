package step3.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    private Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing();
    }

    @Test
    @DisplayName("자동차 대수 만큼 전진 로직 루프 테스트 코드")
    void carsMove() {
        racing.init(5,1);
        List<Integer> moveList = new ArrayList<>();
        for(Car car : racing.getCars())
            moveList.add(car.getPosition());
        assertThat(moveList).containsAnyOf(0,1);
    }

    @Test
    @DisplayName("전진 횟수 만큼 전진 로직 루프 테스트 코드")
    void numberOfCarMove() {
        racing = new Racing() {
            @Override
            protected void carsMove() {
                racing.getCars().forEach(car -> car.move(() -> true));
            }
        };
        racing.init(1,5);
        assertThat(racing.getCars().get(0).getPosition()).isEqualTo(5);
    }
}
