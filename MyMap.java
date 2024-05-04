import java.util.*;

public class MyMap implements Map {
    private HashMap<Object, Object> hashMap;

    public MyMap() {
        hashMap = new HashMap<>();
    }

    @Override
    public Object put(Object key, Object value) {
        return hashMap.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return hashMap.get(key);
    }

    @Override
    public Object remove(Object key) {
        return hashMap.remove(key);
    }

    @Override
    public boolean containsKey(Object key) {
        return hashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return hashMap.containsValue(value);
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public Set keySet() {
        return hashMap.keySet();
    }

    @Override
    public Collection values() {
        return hashMap.values();
    }

    @Override
    public Set entrySet() {
        return hashMap.entrySet();
    }

    @Override
    public void putAll(Map m) {
        hashMap.putAll(m);
    }

    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println("Value for key1: " + map.get("key1"));
        map.remove("key2");
        System.out.println("Contains key2: " + map.containsKey("key2"));
        System.out.println("Size of the map: " + map.size());
        map.clear();
        System.out.println("Is the map empty? " + map.isEmpty());
    }
}
