package nextstep.step3;

import nextstep.step3.domain.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("Name 클래스 테스트")
public class NameTest {

    @Test
    @DisplayName("이름이 5자가 넘으면 에러가 나는 테스트")
    void validateNameLengthTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name("pobi12"));
    }
}
