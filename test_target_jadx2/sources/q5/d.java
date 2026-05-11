package Q5;

import D5.B;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class d {

    private static final class a extends P5.c implements Serializable {

        /* renamed from: t, reason: collision with root package name */
        protected final P5.c f8175t;

        /* renamed from: u, reason: collision with root package name */
        protected final Class[] f8176u;

        protected a(P5.c cVar, Class[] clsArr) {
            super(cVar);
            this.f8175t = cVar;
            this.f8176u = clsArr;
        }

        private final boolean A(Class cls) {
            if (cls == null) {
                return true;
            }
            int length = this.f8176u.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f8176u[i10].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // P5.c
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public a r(T5.m mVar) {
            return new a(this.f8175t.r(mVar), this.f8176u);
        }

        @Override // P5.c
        public void g(D5.o oVar) {
            this.f8175t.g(oVar);
        }

        @Override // P5.c
        public void h(D5.o oVar) {
            this.f8175t.h(oVar);
        }

        @Override // P5.c
        public void s(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
            if (A(b10.I())) {
                this.f8175t.s(obj, fVar, b10);
            } else {
                this.f8175t.v(obj, fVar, b10);
            }
        }

        @Override // P5.c
        public void t(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
            if (A(b10.I())) {
                this.f8175t.t(obj, fVar, b10);
            } else {
                this.f8175t.u(obj, fVar, b10);
            }
        }
    }

    private static final class b extends P5.c implements Serializable {

        /* renamed from: t, reason: collision with root package name */
        protected final P5.c f8177t;

        /* renamed from: u, reason: collision with root package name */
        protected final Class f8178u;

        protected b(P5.c cVar, Class cls) {
            super(cVar);
            this.f8177t = cVar;
            this.f8178u = cls;
        }

        @Override // P5.c
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b r(T5.m mVar) {
            return new b(this.f8177t.r(mVar), this.f8178u);
        }

        @Override // P5.c
        public void g(D5.o oVar) {
            this.f8177t.g(oVar);
        }

        @Override // P5.c
        public void h(D5.o oVar) {
            this.f8177t.h(oVar);
        }

        @Override // P5.c
        public void s(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
            Class<?> I10 = b10.I();
            if (I10 == null || this.f8178u.isAssignableFrom(I10)) {
                this.f8177t.s(obj, fVar, b10);
            } else {
                this.f8177t.v(obj, fVar, b10);
            }
        }

        @Override // P5.c
        public void t(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
            Class<?> I10 = b10.I();
            if (I10 == null || this.f8178u.isAssignableFrom(I10)) {
                this.f8177t.t(obj, fVar, b10);
            } else {
                this.f8177t.u(obj, fVar, b10);
            }
        }
    }

    public static P5.c a(P5.c cVar, Class[] clsArr) {
        return clsArr.length == 1 ? new b(cVar, clsArr[0]) : new a(cVar, clsArr);
    }
}
