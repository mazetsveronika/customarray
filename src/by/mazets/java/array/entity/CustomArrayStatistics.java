package by.mazets.java.array.entity;
import java.util.Objects;
import java.util.Optional;

public class CustomArrayStatistics {
    private Integer max;
    private Integer min;
    private Double avg;
    private int sum;

    public CustomArrayStatistics() {
        this.max = max;
        this.min = min;
        this.avg = avg;
        this.sum = sum;
    }

    public Optional<Integer> getMax() {
        return Optional.ofNullable(max);
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Optional<Integer> getMin() {
        return Optional.ofNullable(min);
    }


    public void setMin(int min) {
        this.min = min;
    }

    public Optional<Double> getAvg() {
        return Optional.ofNullable(avg);
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayStatistics that = (CustomArrayStatistics) o;
        return sum == that.sum && Objects.equals(max, that.max) && Objects.equals(min, that.min) && Objects.equals(avg, that.avg);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArrayStatistics{");
        sb.append("max=").append(max);
        sb.append(", min=").append(min);
        sb.append(", avg=").append(avg);
        sb.append(", sum=").append(sum);
        sb.append('}');
        return sb.toString();
    }
}