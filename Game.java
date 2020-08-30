import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Game implements Map {
    private Map<Integer, String> m;

    public Game() {
        m = new LinkedHashMap<>();
    }

    public void run() {
        m.put(0, "You are at the Start. ");
        m.put(1, "You are at the Dungeon. ");
        m.put(2, "You are at the A-room. ");
        m.put(3, "You are at the B-room. ");
        m.put(4, "You are at the C-room. ");
        m.put(5, "You are at the Palace. ");
        int sl = 1;
        Scanner s = new Scanner(System.in);
        while (sl != 0) {
            System.out.println("Please press 0 to start.");
            sl = s.nextInt();
        }
        System.out.println(m.get(0) + rules(sl));
        sl = s.nextInt();
        while (sl < 5 && sl != 5 && sl != 1) {
            System.out.println(m.get(sl) + rules(sl));
            sl = s.nextInt();
            if (sl > 5)
                System.out.println("Error. Please restart.");
        }
        System.out.println(m.get(sl) + rules(sl));
    }

    public String rules(int i) {
        if (i == 0)
            return "To go to the dungeon, press 1. To go to A-Room, press 2. To get to B-Room, press 3.";
        if (i == 1)
            return "You lose.";
        if (i == 2)
            return "You must go back to the starting position. Please press 0.";
        if (i == 3)
            return "To go to A-Room, please press 2. To go to C-Room, please press 4.";
        if (i == 4)
            return "To go to B-Room, please press 3. To go to the Palace, please press 5.";
        if (i == 5)
            return "You can now exit.";
        else
            return null;
    }
    @Override
    public int size(){
        int count=0;
        for(Map.Entry<Integer,String> s : m.entrySet())
            count++;
        return count;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public boolean containsKey(Object key) {
        return false;
    }
    @Override
    public boolean containsValue(Object value) {
        return false;
    }
    @Override
    public Object get(Object key) {
        return null;
    }
    @Override
    public Object put(Object key, Object value) {
        return null;
    }
    @Override
    public Object remove(Object key) {
        return null;
    }
    @Override
    public void putAll(Map m) {
    }
    @Override
    public void clear() {
    }
    @Override
    public Set keySet() {
        return null;
    }
    @Override
    public Collection values() {
        return null;
    }
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return null;
    }
    @Override
    public void forEach(BiConsumer action) {
    }
    @Override
    public void replaceAll(BiFunction function) {
    }
    @Override
    public Object putIfAbsent(Object key, Object value) {
        return null;
    }
    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }
    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        return false;
    }
    @Override
    public Object replace(Object key, Object value) {
        return null;
    }
    @Override
    public Object computeIfAbsent(Object key, Function mappingFunction) {
        return null;
    }
    @Override
    public Object computeIfPresent(Object key, BiFunction remappingFunction) {
        return null;
    }
    @Override
    public Object compute(Object key, BiFunction remappingFunction) {
        return null;
    }
    @Override
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        return null;
    }
}
//Topics covered
//Classes, methods, maps, interface(overriding), objects,instance variables