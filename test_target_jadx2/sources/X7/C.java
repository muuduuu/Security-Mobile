package x7;

import V6.AbstractC1287s;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class C implements Comparator {
    C() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5119b c5119b = (C5119b) obj;
        C5119b c5119b2 = (C5119b) obj2;
        AbstractC1287s.m(c5119b);
        AbstractC1287s.m(c5119b2);
        int compareTo = Integer.valueOf(c5119b2.j()).compareTo(Integer.valueOf(c5119b.j()));
        return compareTo == 0 ? Integer.valueOf(c5119b.u()).compareTo(Integer.valueOf(c5119b2.u())) : compareTo;
    }
}
