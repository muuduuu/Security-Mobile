package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class X implements InterfaceC2609t1 {
    protected int zza = 0;

    protected static void c(Iterable iterable, List list) {
        R0.d(iterable);
        if (iterable instanceof InterfaceC2560d1) {
            List f10 = ((InterfaceC2560d1) iterable).f();
            InterfaceC2560d1 interfaceC2560d1 = (InterfaceC2560d1) list;
            int size = list.size();
            for (Object obj : f10) {
                if (obj == null) {
                    int size2 = interfaceC2560d1.size() - size;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    for (int size3 = interfaceC2560d1.size() - 1; size3 >= size; size3--) {
                        interfaceC2560d1.remove(size3);
                    }
                    throw new NullPointerException(sb3);
                }
                if (obj instanceof AbstractC2570g0) {
                    interfaceC2560d1.z1((AbstractC2570g0) obj);
                } else {
                    interfaceC2560d1.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof D1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("Element at index ");
                sb4.append(size5);
                sb4.append(" is null.");
                String sb5 = sb4.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(sb5);
            }
            list.add(obj2);
        }
    }

    abstract void d(int i10);

    public final byte[] e() {
        try {
            byte[] bArr = new byte[A()];
            AbstractC2614v0 d10 = AbstractC2614v0.d(bArr);
            a(d10);
            d10.J();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "byte array".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("byte array");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    abstract int f();
}
