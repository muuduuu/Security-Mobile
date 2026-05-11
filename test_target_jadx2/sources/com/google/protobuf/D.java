package com.google.protobuf;

import com.google.protobuf.AbstractC2893y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static final D f28669a;

    /* renamed from: b, reason: collision with root package name */
    private static final D f28670b;

    private static final class b extends D {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f28671c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List e(Object obj, long j10) {
            return (List) m0.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List f(Object obj, long j10, int i10) {
            B b10;
            List e10 = e(obj, j10);
            if (e10.isEmpty()) {
                List b11 = e10 instanceof C ? new B(i10) : ((e10 instanceof X) && (e10 instanceof AbstractC2893y.b)) ? ((AbstractC2893y.b) e10).y(i10) : new ArrayList(i10);
                m0.R(obj, j10, b11);
                return b11;
            }
            if (f28671c.isAssignableFrom(e10.getClass())) {
                ArrayList arrayList = new ArrayList(e10.size() + i10);
                arrayList.addAll(e10);
                m0.R(obj, j10, arrayList);
                b10 = arrayList;
            } else {
                if (!(e10 instanceof l0)) {
                    if (!(e10 instanceof X) || !(e10 instanceof AbstractC2893y.b)) {
                        return e10;
                    }
                    AbstractC2893y.b bVar = (AbstractC2893y.b) e10;
                    if (bVar.N()) {
                        return e10;
                    }
                    AbstractC2893y.b y10 = bVar.y(e10.size() + i10);
                    m0.R(obj, j10, y10);
                    return y10;
                }
                B b12 = new B(e10.size() + i10);
                b12.addAll((l0) e10);
                m0.R(obj, j10, b12);
                b10 = b12;
            }
            return b10;
        }

        @Override // com.google.protobuf.D
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) m0.C(obj, j10);
            if (list instanceof C) {
                unmodifiableList = ((C) list).K();
            } else {
                if (f28671c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof X) && (list instanceof AbstractC2893y.b)) {
                    AbstractC2893y.b bVar = (AbstractC2893y.b) list;
                    if (bVar.N()) {
                        bVar.x();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            m0.R(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.D
        void d(Object obj, Object obj2, long j10) {
            List e10 = e(obj2, j10);
            List f10 = f(obj, j10, e10.size());
            int size = f10.size();
            int size2 = e10.size();
            if (size > 0 && size2 > 0) {
                f10.addAll(e10);
            }
            if (size > 0) {
                e10 = f10;
            }
            m0.R(obj, j10, e10);
        }
    }

    private static final class c extends D {
        private c() {
            super();
        }

        static AbstractC2893y.b e(Object obj, long j10) {
            return (AbstractC2893y.b) m0.C(obj, j10);
        }

        @Override // com.google.protobuf.D
        void c(Object obj, long j10) {
            e(obj, j10).x();
        }

        @Override // com.google.protobuf.D
        void d(Object obj, Object obj2, long j10) {
            AbstractC2893y.b e10 = e(obj, j10);
            AbstractC2893y.b e11 = e(obj2, j10);
            int size = e10.size();
            int size2 = e11.size();
            if (size > 0 && size2 > 0) {
                if (!e10.N()) {
                    e10 = e10.y(size2 + size);
                }
                e10.addAll(e11);
            }
            if (size > 0) {
                e11 = e10;
            }
            m0.R(obj, j10, e11);
        }
    }

    static {
        f28669a = new b();
        f28670b = new c();
    }

    static D a() {
        return f28669a;
    }

    static D b() {
        return f28670b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    private D() {
    }
}
