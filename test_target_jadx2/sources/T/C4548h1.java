package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.impl.AbstractC1424a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import u.C4832C;
import v.AbstractC4893d;
import v.C4896g;

/* renamed from: t.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4548h1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4832C f42089a;

    /* renamed from: b, reason: collision with root package name */
    private final C4896g f42090b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42091c;

    /* renamed from: t.h1$a */
    static final class a {
        static A.B a(C4832C c4832c) {
            Long l10 = (Long) c4832c.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return AbstractC4893d.b(l10.longValue());
            }
            return null;
        }
    }

    C4548h1(C4832C c4832c) {
        this.f42089a = c4832c;
        this.f42090b = C4896g.a(c4832c);
        int[] iArr = (int[]) c4832c.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f42091c = z10;
    }

    private static boolean a(A.B b10, A.B b11) {
        y0.f.j(b11.e(), "Fully specified range is not actually fully specified.");
        if (b10.b() == 2 && b11.b() == 1) {
            return false;
        }
        if (b10.b() == 2 || b10.b() == 0 || b10.b() == b11.b()) {
            return b10.a() == 0 || b10.a() == b11.a();
        }
        return false;
    }

    private static boolean b(A.B b10, A.B b11, Set set) {
        if (set.contains(b11)) {
            return a(b10, b11);
        }
        AbstractC0700h0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", b10, b11));
        return false;
    }

    private static A.B c(A.B b10, Collection collection, Set set) {
        if (b10.b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A.B b11 = (A.B) it.next();
            y0.f.h(b11, "Fully specified DynamicRange cannot be null.");
            int b12 = b11.b();
            y0.f.j(b11.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (b12 != 1 && b(b10, b11, set)) {
                return b11;
            }
        }
        return null;
    }

    private static boolean e(A.B b10) {
        return Objects.equals(b10, A.B.f6c);
    }

    private static boolean f(A.B b10) {
        return b10.b() == 2 || (b10.b() != 0 && b10.a() == 0) || (b10.b() == 0 && b10.a() != 0);
    }

    private A.B h(A.B b10, Set set, Set set2, Set set3, String str) {
        A.B b11;
        if (b10.e()) {
            if (set.contains(b10)) {
                return b10;
            }
            return null;
        }
        int b12 = b10.b();
        int a10 = b10.a();
        if (b12 == 1 && a10 == 0) {
            A.B b13 = A.B.f7d;
            if (set.contains(b13)) {
                return b13;
            }
            return null;
        }
        A.B c10 = c(b10, set2, set);
        if (c10 != null) {
            AbstractC0700h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, b10, c10));
            return c10;
        }
        A.B c11 = c(b10, set3, set);
        if (c11 != null) {
            AbstractC0700h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, b10, c11));
            return c11;
        }
        A.B b14 = A.B.f7d;
        if (b(b10, b14, set)) {
            AbstractC0700h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, b10, b14));
            return b14;
        }
        if (b12 == 2 && (a10 == 10 || a10 == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                b11 = a.a(this.f42089a);
                if (b11 != null) {
                    linkedHashSet.add(b11);
                }
            } else {
                b11 = null;
            }
            linkedHashSet.add(A.B.f9f);
            A.B c12 = c(b10, linkedHashSet, set);
            if (c12 != null) {
                AbstractC0700h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, c12.equals(b11) ? "recommended" : "required", b10, c12));
                return c12;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A.B b15 = (A.B) it.next();
            y0.f.j(b15.e(), "Candidate dynamic range must be fully specified.");
            if (!b15.equals(A.B.f7d) && a(b10, b15)) {
                AbstractC0700h0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, b10, b15));
                return b15;
            }
        }
        return null;
    }

    private A.B i(Set set, Set set2, Set set3, androidx.camera.core.impl.l1 l1Var, Set set4) {
        A.B k10 = l1Var.k();
        A.B h10 = h(k10, set4, set2, set3, l1Var.J());
        if (h10 == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", l1Var.J(), k10, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, h10, this.f42090b);
        return h10;
    }

    private static void j(Set set, A.B b10, C4896g c4896g) {
        y0.f.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set b11 = c4896g.b(b10);
        if (b11.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(b11);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", b10, TextUtils.join("\n  ", b11), TextUtils.join("\n  ", hashSet)));
        }
    }

    boolean d() {
        return this.f42091c;
    }

    Map g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AbstractC1424a) it.next()).c());
        }
        Set c10 = this.f42090b.c();
        HashSet hashSet = new HashSet(c10);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, (A.B) it2.next(), this.f42090b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) list2.get(((Integer) it3.next()).intValue());
            A.B k10 = l1Var.k();
            if (e(k10)) {
                arrayList3.add(l1Var);
            } else if (f(k10)) {
                arrayList2.add(l1Var);
            } else {
                arrayList.add(l1Var);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<androidx.camera.core.impl.l1> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.l1 l1Var2 : arrayList4) {
            A.B i10 = i(c10, linkedHashSet, linkedHashSet2, l1Var2, hashSet);
            hashMap.put(l1Var2, i10);
            if (!linkedHashSet.contains(i10)) {
                linkedHashSet2.add(i10);
            }
        }
        return hashMap;
    }
}
