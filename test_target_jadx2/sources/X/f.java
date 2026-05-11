package X;

import A.B;
import V.AbstractC1258v;
import V.C1252o;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import b0.k;
import c0.r0;
import d0.AbstractC2971b;
import d0.AbstractC2972c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class f implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f11615c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f11616d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f11617e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f11618f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3735a f11619g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f11620h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map f11621i = new HashMap();

    public f(InterfaceC1439h0 interfaceC1439h0, Collection collection, Collection collection2, Collection collection3, InterfaceC3735a interfaceC3735a) {
        c(collection2);
        this.f11615c = interfaceC1439h0;
        this.f11616d = new HashSet(collection);
        this.f11618f = new HashSet(collection2);
        this.f11617e = new HashSet(collection3);
        this.f11619g = interfaceC3735a;
    }

    private static void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            B b10 = (B) it.next();
            if (!b10.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + b10);
            }
        }
    }

    private InterfaceC1441i0 d(AbstractC1258v.b bVar) {
        g b10;
        y0.f.a(this.f11616d.contains(bVar));
        InterfaceC1441i0 b11 = this.f11615c.b(bVar.e());
        for (Size size : bVar.d()) {
            if (this.f11617e.contains(size)) {
                TreeMap treeMap = new TreeMap(new E.e());
                ArrayList arrayList = new ArrayList();
                for (B b12 : this.f11618f) {
                    if (!i(b11, b12) && (b10 = f(b12).b(size)) != null) {
                        InterfaceC1441i0.c k10 = b10.k();
                        r0 r0Var = (r0) this.f11619g.apply(k.f(k10));
                        if (r0Var != null && r0Var.a(size.getWidth(), size.getHeight())) {
                            treeMap.put(new Size(k10.k(), k10.h()), b10);
                            arrayList.add(AbstractC2972c.a(k10, size, r0Var.c()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC1441i0 interfaceC1441i0 = (InterfaceC1441i0) L.d.a(size, treeMap);
                    Objects.requireNonNull(interfaceC1441i0);
                    InterfaceC1441i0 interfaceC1441i02 = interfaceC1441i0;
                    return InterfaceC1441i0.b.h(interfaceC1441i02.a(), interfaceC1441i02.b(), interfaceC1441i02.c(), arrayList);
                }
            }
        }
        return null;
    }

    private AbstractC1258v.b e(int i10) {
        Iterator it = this.f11616d.iterator();
        while (it.hasNext()) {
            AbstractC1258v.b bVar = (AbstractC1258v.b) ((AbstractC1258v) it.next());
            if (bVar.e() == i10) {
                return bVar;
            }
        }
        return null;
    }

    private C1252o f(B b10) {
        if (this.f11621i.containsKey(b10)) {
            C1252o c1252o = (C1252o) this.f11621i.get(b10);
            Objects.requireNonNull(c1252o);
            return c1252o;
        }
        C1252o c1252o2 = new C1252o(new e(this.f11615c, b10));
        this.f11621i.put(b10, c1252o2);
        return c1252o2;
    }

    private InterfaceC1441i0 g(int i10) {
        if (this.f11620h.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC1441i0) this.f11620h.get(Integer.valueOf(i10));
        }
        InterfaceC1441i0 b10 = this.f11615c.b(i10);
        AbstractC1258v.b e10 = e(i10);
        if (e10 != null && !h(b10)) {
            b10 = j(b10, d(e10));
        }
        this.f11620h.put(Integer.valueOf(i10), b10);
        return b10;
    }

    private boolean h(InterfaceC1441i0 interfaceC1441i0) {
        if (interfaceC1441i0 == null) {
            return false;
        }
        Iterator it = this.f11618f.iterator();
        while (it.hasNext()) {
            if (!i(interfaceC1441i0, (B) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean i(InterfaceC1441i0 interfaceC1441i0, B b10) {
        if (interfaceC1441i0 == null) {
            return false;
        }
        Iterator it = interfaceC1441i0.d().iterator();
        while (it.hasNext()) {
            if (AbstractC2971b.f((InterfaceC1441i0.c) it.next(), b10)) {
                return true;
            }
        }
        return false;
    }

    private static InterfaceC1441i0 j(InterfaceC1441i0 interfaceC1441i0, InterfaceC1441i0 interfaceC1441i02) {
        if (interfaceC1441i0 == null && interfaceC1441i02 == null) {
            return null;
        }
        int a10 = interfaceC1441i0 != null ? interfaceC1441i0.a() : interfaceC1441i02.a();
        int b10 = interfaceC1441i0 != null ? interfaceC1441i0.b() : interfaceC1441i02.b();
        List c10 = interfaceC1441i0 != null ? interfaceC1441i0.c() : interfaceC1441i02.c();
        ArrayList arrayList = new ArrayList();
        if (interfaceC1441i0 != null) {
            arrayList.addAll(interfaceC1441i0.d());
        }
        if (interfaceC1441i02 != null) {
            arrayList.addAll(interfaceC1441i02.d());
        }
        return InterfaceC1441i0.b.h(a10, b10, c10, arrayList);
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return g(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        return g(i10);
    }
}
