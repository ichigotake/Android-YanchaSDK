package net.ichigotake.yancha.sdk.api;

public class LimitBuilder {

    private Integer limit;
    private Integer offset;

    public Limit build() {
        return new LimitImpl(this);
    }

    private static class LimitImpl implements Limit {

        private final Integer limit;
        private final Integer offset;

        public LimitImpl(LimitBuilder builder) {
            this.limit = builder.limit;
            this.offset = builder.offset;
        }

        @Override
        public int getOffset() {
            return offset;
        }

        @Override
        public int getLimit() {
            return limit;
        }

        @Override
        public String toQueryStringValue() {
            String value = limit.toString();
            if (offset != null) {
                value += offset;
            }
            return value;
        }

        @Override
        public String toString() {
            return toQueryStringValue();
        }
    }

    public LimitBuilder setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public LimitBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }

}
