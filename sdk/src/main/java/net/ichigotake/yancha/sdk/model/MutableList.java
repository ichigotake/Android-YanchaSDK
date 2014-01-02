package net.ichigotake.yancha.sdk.model;

import java.util.Collection;
import java.util.List;

public interface MutableList<E> {

    void clear();

    void remove(int location);

    void add(E item);

    void addAll(Collection<E> collection);

    void addAll(MutableList<E> list);

    E get(int location);

    int size();

    boolean isEmpty();

    boolean contains(E item);

    boolean containsAll(Collection<E> collection);

    List<E> toList();

    E[] toArray();
}
