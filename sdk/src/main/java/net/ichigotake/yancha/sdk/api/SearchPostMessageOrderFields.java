package net.ichigotake.yancha.sdk.api;

import android.text.TextUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class SearchPostMessageOrderFields {

    private final Map<String, Sequence> fields;

    private SearchPostMessageOrderFields() {
        this.fields = new HashMap<String, Sequence>();
    }

    public void add(String field, Sequence sequence) {
        this.fields.put(field, sequence);
    }

    public void add(SearchPostMessageOrderField field, Sequence sequence) {
        this.fields.put(field.getFieldName(), sequence);
    }

    public List<String> getFieldList() {
        List<String> fieldList = new CopyOnWriteArrayList<String>();
        for (Map.Entry<String, Sequence> entry : fields.entrySet()) {
            fieldList.add(entry.getValue().getPrefix() + entry.getKey());
        }
        return fieldList;
    }

    @Override
    public String toString() {
        return TextUtils.join(",", getFieldList());
    }
}
