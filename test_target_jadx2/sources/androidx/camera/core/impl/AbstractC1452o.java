package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1452o {

    /* renamed from: androidx.camera.core.impl.o$a */
    public static final class a extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        private final List f14657a = new ArrayList();

        a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1450n abstractC1450n = (AbstractC1450n) it.next();
                if (!(abstractC1450n instanceof b)) {
                    this.f14657a.add(abstractC1450n);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void a(int i10) {
            Iterator it = this.f14657a.iterator();
            while (it.hasNext()) {
                ((AbstractC1450n) it.next()).a(i10);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            Iterator it = this.f14657a.iterator();
            while (it.hasNext()) {
                ((AbstractC1450n) it.next()).b(i10, interfaceC1469x);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void c(int i10, C1454p c1454p) {
            Iterator it = this.f14657a.iterator();
            while (it.hasNext()) {
                ((AbstractC1450n) it.next()).c(i10, c1454p);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void d(int i10) {
            Iterator it = this.f14657a.iterator();
            while (it.hasNext()) {
                ((AbstractC1450n) it.next()).d(i10);
            }
        }

        public List e() {
            return this.f14657a;
        }
    }

    /* renamed from: androidx.camera.core.impl.o$b */
    static final class b extends AbstractC1450n {
        b() {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void c(int i10, C1454p c1454p) {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void d(int i10) {
        }
    }

    static AbstractC1450n a(List list) {
        return list.isEmpty() ? c() : list.size() == 1 ? (AbstractC1450n) list.get(0) : new a(list);
    }

    public static AbstractC1450n b(AbstractC1450n... abstractC1450nArr) {
        return a(Arrays.asList(abstractC1450nArr));
    }

    public static AbstractC1450n c() {
        return new b();
    }
}
