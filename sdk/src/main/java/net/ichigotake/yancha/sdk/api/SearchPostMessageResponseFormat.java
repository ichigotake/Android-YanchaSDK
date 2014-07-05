package net.ichigotake.yancha.sdk.api;

public enum SearchPostMessageResponseFormat {

    JSON("json"),
    RSS("rss"),
    TEXT("rss"),
    ;

    private final String formatName;

    private SearchPostMessageResponseFormat(String formatName) {
        this.formatName = formatName;
    }

    public String getFormatName() {
        return formatName;
    }

    @Override
    public String toString() {
        return formatName;
    }

}
