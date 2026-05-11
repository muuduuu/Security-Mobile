package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2360t4 implements G5 {
    private static void i(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String sb3 = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(sb3);
            }
            list.remove(size2);
        }
    }

    protected static void m(Iterable iterable, List list) {
        byte[] bArr = AbstractC2308n5.f24582b;
        iterable.getClass();
        if (iterable instanceof InterfaceC2343r5) {
            List zza = ((InterfaceC2343r5) iterable).zza();
            InterfaceC2343r5 interfaceC2343r5 = (InterfaceC2343r5) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = interfaceC2343r5.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = interfaceC2343r5.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(sb3);
                        }
                        interfaceC2343r5.remove(size3);
                    }
                } else if (obj instanceof J4) {
                    interfaceC2343r5.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    J4.r(bArr2, 0, bArr2.length);
                    interfaceC2343r5.zzb();
                } else {
                    interfaceC2343r5.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof O5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof Q5) {
                ((Q5) list).h(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    i(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                i(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final /* synthetic */ G5 i1(byte[] bArr, T4 t42) {
        return l(bArr, 0, bArr.length, t42);
    }

    public abstract AbstractC2360t4 k(byte[] bArr, int i10, int i11);

    public abstract AbstractC2360t4 l(byte[] bArr, int i10, int i11, T4 t42);

    @Override // com.google.android.gms.internal.measurement.G5
    public final /* synthetic */ G5 t1(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }
}
