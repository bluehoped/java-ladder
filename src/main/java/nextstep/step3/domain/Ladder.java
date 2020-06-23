package nextstep.step3.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ladder {
    private final Names names;
    private final Lines ladderLines;

    public Ladder(String nameString, int inputLadderHeight) {
        names = new Names(nameString);

        List<Line> lines = new ArrayList<>();
        IntStream.range(0, inputLadderHeight).forEach(i -> lines.add(new Line(names.getParticipantsCount())));
        this.ladderLines = new Lines(lines);
    }

    public Names getNames() {
        return names;
    }

    public Lines getLadderLines() {
        return ladderLines;
    }
}
