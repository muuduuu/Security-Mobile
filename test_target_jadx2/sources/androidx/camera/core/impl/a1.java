package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final List f14528a = new ArrayList();

    private static void b(List list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    private List c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean a(b1 b1Var) {
        return this.f14528a.add(b1Var);
    }

    public List d(List list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f14528a.size()) {
            return null;
        }
        List c10 = c(this.f14528a.size());
        b1[] b1VarArr = new b1[list.size()];
        Iterator it = c10.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z10 = true;
            while (i10 < this.f14528a.size()) {
                if (iArr[i10] < list.size()) {
                    z10 &= ((b1) this.f14528a.get(i10)).g((b1) list.get(iArr[i10]));
                    if (!z10) {
                        break;
                    }
                    b1VarArr[iArr[i10]] = (b1) this.f14528a.get(i10);
                }
                i10++;
            }
            if (z10) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(b1VarArr);
        }
        return null;
    }
}
