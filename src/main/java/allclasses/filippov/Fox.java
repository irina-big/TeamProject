package allclasses.filippov;

import java.util.List;
import java.util.Objects;

public class Fox {
    private final List<String> ranks = List.of("F", "E", "D", "C", "B", "A", "S", "SS", "P");
    private int rank = 0;
    private double height;
    private double weight;

    public void upHuntingRang() {
        if (++rank < ranks.size())
            this.rank++;
    }
    private void setRank(String rank){
        if (ranks.contains(rank))
            for(int i = 0; i< ranks.size(); i++)
                if (Objects.equals(ranks.get(i), rank))
                    this.rank = i;
    }
    public String getHuntingRang() {
        return ranks.get(rank);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
