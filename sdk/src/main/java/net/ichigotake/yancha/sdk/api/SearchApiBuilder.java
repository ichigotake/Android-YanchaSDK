package net.ichigotake.yancha.sdk.api;

import android.net.Uri;
import android.text.TextUtils;

import java.util.Collection;
import java.util.Locale;

public class SearchApiBuilder implements ApiBuilder {

    public static enum Format {
        JSON,
        RSS,
        TEXT,
        ;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.JAPAN);
        }
    }

    public static enum Order {
        ASC(""),
        DESC("-"),
        ;

        final private String mPrefix;

        private Order(String prefix) {
            mPrefix = prefix;
        }

        public String getPrefix() {
            return mPrefix;
        }

        @Override
        public String toString() {
            return mPrefix;
        }
    }

    final private Uri.Builder mBuilder;

    public SearchApiBuilder() {
        this(BasicEndpoint.SEARCH);
    }

    public SearchApiBuilder(Endpoint endpoint) {
        mBuilder = new Uri.Builder().path(endpoint.getPath());
    }

    public SearchApiBuilder setFormat(String format) {
        mBuilder.appendQueryParameter("t", format);
        return this;
    }

    public SearchApiBuilder setFormat(Format format) {
        setFormat(format.toString());
        return this;
    }

    public SearchApiBuilder setKeyword(String keyword) {
        mBuilder.appendQueryParameter("keyword", keyword);
        return this;
    }

    public SearchApiBuilder setOrder(OrderFieldBuilder builder) {
        setOrder(builder.toString());
        return this;
    }

    public SearchApiBuilder setOrder(String order) {
        mBuilder.appendQueryParameter("order", order);
        return this;
    }

    public SearchApiBuilder setLimit(int limit) {
        mBuilder.appendQueryParameter("limit", String.valueOf(limit));
        return this;
    }

    public SearchApiBuilder setLimit(int limit, int offset) {
        mBuilder.appendQueryParameter("limit", limit + "," + offset);
        return this;
    }

    public SearchApiBuilder setTag(String tag) {
        mBuilder.appendQueryParameter("tag", tag);
        return this;
    }

    public SearchApiBuilder setTag(Collection<String> tags) {
        setTag(TextUtils.join(",", tags));
        return this;
    }

    public SearchApiBuilder setOlderThanId(int id) {
        mBuilder.appendQueryParameter("older_than_id", String.valueOf(id));
        return this;
    }

    public SearchApiBuilder setTime(long from, long to) {
        mBuilder.appendQueryParameter("time", from + "," + to);
        return this;
    }

    public SearchApiBuilder setTime(long from) {
        mBuilder.appendQueryParameter("time", String.valueOf(from));
        return this;
    }

    public SearchApiBuilder setOlder(int count) {
        mBuilder.appendQueryParameter("older", String.valueOf(count));
        return this;
    }

    public SearchApiBuilder setNewer(int count) {
        mBuilder.appendQueryParameter("newer", String.valueOf(count));
        return this;
    }

    @Override
    public Uri.Builder get() {
        return mBuilder;
    }

    @Override
    public String toString() {
        return mBuilder.toString();
    }

}
