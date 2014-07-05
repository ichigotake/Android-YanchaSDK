package net.ichigotake.yancha.sdk.api;

public class TimeRange {

    private final Integer from;
    private final Integer to;

    public TimeRange(Integer from) {
        this.from = from;
        this.to = null;
    }

    public TimeRange(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public String getValue() {
        String value = from.toString();
        if (to != null) {
            value += "," + to;
        }
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }

}
