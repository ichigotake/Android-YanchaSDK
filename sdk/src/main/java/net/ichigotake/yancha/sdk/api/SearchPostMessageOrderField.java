package net.ichigotake.yancha.sdk.api;

public enum SearchPostMessageOrderField {

    CREATED_AT("created_at_ms"),
    PLUSPLUS("plusplus"),
    ;

    private final String fieldName;

    SearchPostMessageOrderField(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return fieldName;
    }
}
