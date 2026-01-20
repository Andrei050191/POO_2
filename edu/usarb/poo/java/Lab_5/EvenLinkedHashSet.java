package usarb.poo.java.Lab_5;

import java.util.Collection;
import java.util.LinkedHashSet;

public class EvenLinkedHashSet extends LinkedHashSet<Integer> {

    @Override
    public boolean add(Integer e) {
        if (e != null && e % 2 == 0) {
            return super.add(e);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;
        for (Integer e : c) {
            if (e != null && e % 2 == 0) {
                if (super.add(e)) {
                    modified = true;
                }
            }
        }
        return modified;
    }
}
