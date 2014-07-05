package net.ichigotake.yancha.sdk.api;

public enum Sequence {

    ASC(""),
    DESC("-"),
    ;

    private final String prefix;

    private Sequence(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

}
