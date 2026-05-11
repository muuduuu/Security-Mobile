package kd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.e0;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final i f36294a = new i();

    private i() {
    }

    private static Integer b(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
        int c10 = c(interfaceC0941m2) - c(interfaceC0941m);
        if (c10 != 0) {
            return Integer.valueOf(c10);
        }
        if (f.B(interfaceC0941m) && f.B(interfaceC0941m2)) {
            return 0;
        }
        int compareTo = interfaceC0941m.getName().compareTo(interfaceC0941m2.getName());
        if (compareTo != 0) {
            return Integer.valueOf(compareTo);
        }
        return null;
    }

    private static int c(InterfaceC0941m interfaceC0941m) {
        if (f.B(interfaceC0941m)) {
            return 8;
        }
        if (interfaceC0941m instanceof InterfaceC0940l) {
            return 7;
        }
        if (interfaceC0941m instanceof U) {
            return ((U) interfaceC0941m).s0() == null ? 6 : 5;
        }
        if (interfaceC0941m instanceof InterfaceC0952y) {
            return ((InterfaceC0952y) interfaceC0941m).s0() == null ? 4 : 3;
        }
        if (interfaceC0941m instanceof InterfaceC0933e) {
            return 2;
        }
        return interfaceC0941m instanceof e0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
        Integer b10 = b(interfaceC0941m, interfaceC0941m2);
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }
}
