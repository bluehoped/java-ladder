package nextstep.step3.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Line {
    private final List<LineConnection> oneLayerLadder = new ArrayList<>();

    public Line(int personOfCount) {
        setLadderLine(personOfCount);
    }

    private void setLadderLine(int personOfCount) {
        oneLayerLadder.add(LineConnection.connectFirstLadder());
        IntStream.range(1, personOfCount - 1).forEach(i -> oneLayerLadder.add(LineConnection.connectLadder(getConnectionStateByLastElement())));
        oneLayerLadder.add(LineConnection.connectLastLadder());
    }

    public List<LineConnection> getOneLayerLadder() {
        return this.oneLayerLadder;
    }

    private boolean getConnectionStateByLastElement() {
        return oneLayerLadder.get(oneLayerLadder.size() - 1).isConnect();
    }
}
