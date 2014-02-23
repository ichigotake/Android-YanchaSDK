package net.ichigotake.yancha.sdk.api;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Collection;

public class OrderFieldBuilder {

    final private Collection<String> mFields;

    public OrderFieldBuilder() {
        mFields = new ArrayList<String>();
    }

    public OrderFieldBuilder append(String field, SearchApiBuilder.Order order) {
        mFields.add(order.getPrefix() + field);
        return this;
    }

    @Override
    public String toString() {
        return TextUtils.join(",", mFields);
    }

}
