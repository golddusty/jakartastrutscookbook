package com.oreilly.strutsckbk.ch10;

import java.util.*;

public abstract class RefreshableList implements Refreshable, List {

    public void add(int arg0, Object arg1) {
        backingList.add(arg0, arg1);
    }
    public boolean add(Object arg0) {
        return backingList.add(arg0);
    }
    public boolean addAll(Collection arg0) {
        return backingList.addAll(arg0);
    }
    public boolean addAll(int arg0, Collection arg1) {
        return backingList.addAll(arg0, arg1);
    }
    public void clear() {
        backingList.clear();
    }
    public boolean contains(Object arg0) {
        return backingList.contains(arg0);
    }
    public boolean containsAll(Collection arg0) {
        return backingList.containsAll(arg0);
    }
    public Object get(int arg0) {
        return backingList.get(arg0);
    }
    public int indexOf(Object arg0) {
        return backingList.indexOf(arg0);
    }
    public boolean isEmpty() {
        return backingList.isEmpty();
    }
    public Iterator iterator() {
        return backingList.iterator();
    }
    public int lastIndexOf(Object arg0) {
        return backingList.lastIndexOf(arg0);
    }
    public ListIterator listIterator() {
        return backingList.listIterator();
    }
    public ListIterator listIterator(int arg0) {
        return backingList.listIterator(arg0);
    }
    public Object remove(int arg0) {
        return backingList.remove(arg0);
    }
    public boolean remove(Object arg0) {
        return backingList.remove(arg0);
    }
    public boolean removeAll(Collection arg0) {
        return backingList.removeAll(arg0);
    }
    public boolean retainAll(Collection arg0) {
        return backingList.retainAll(arg0);
    }
    public Object set(int arg0, Object arg1) {
        return backingList.set(arg0, arg1);
    }
    public int size() {
        return backingList.size();
    }
    public List subList(int arg0, int arg1) {
        return backingList.subList(arg0, arg1);
    }
    public Object[] toArray() {
        return backingList.toArray();
    }
    public Object[] toArray(Object[] arg0) {
        return backingList.toArray(arg0);
    }
    protected List backingList;
}
