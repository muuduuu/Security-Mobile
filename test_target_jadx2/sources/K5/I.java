package K5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import v5.InterfaceC4938e;

/* loaded from: classes2.dex */
public interface I {
    boolean a(j jVar);

    boolean b(C0926g c0926g);

    I c(InterfaceC4938e.c cVar);

    I d(InterfaceC4938e.c cVar);

    I e(InterfaceC4938e.c cVar);

    I f(InterfaceC4938e interfaceC4938e);

    I g(InterfaceC4938e.c cVar);

    boolean h(j jVar);

    I i(InterfaceC4938e.b bVar);

    I j(InterfaceC4938e.c cVar);

    boolean k(j jVar);

    public static class a implements I, Serializable {

        /* renamed from: f, reason: collision with root package name */
        protected static final a f5346f;

        /* renamed from: g, reason: collision with root package name */
        protected static final a f5347g;

        /* renamed from: a, reason: collision with root package name */
        protected final InterfaceC4938e.c f5348a;

        /* renamed from: b, reason: collision with root package name */
        protected final InterfaceC4938e.c f5349b;

        /* renamed from: c, reason: collision with root package name */
        protected final InterfaceC4938e.c f5350c;

        /* renamed from: d, reason: collision with root package name */
        protected final InterfaceC4938e.c f5351d;

        /* renamed from: e, reason: collision with root package name */
        protected final InterfaceC4938e.c f5352e;

        static {
            InterfaceC4938e.c cVar = InterfaceC4938e.c.PUBLIC_ONLY;
            InterfaceC4938e.c cVar2 = InterfaceC4938e.c.ANY;
            f5346f = new a(cVar, cVar, cVar2, cVar2, cVar);
            f5347g = new a(cVar, cVar, cVar, cVar, cVar);
        }

        public a(InterfaceC4938e.c cVar, InterfaceC4938e.c cVar2, InterfaceC4938e.c cVar3, InterfaceC4938e.c cVar4, InterfaceC4938e.c cVar5) {
            this.f5348a = cVar;
            this.f5349b = cVar2;
            this.f5350c = cVar3;
            this.f5351d = cVar4;
            this.f5352e = cVar5;
        }

        private InterfaceC4938e.c l(InterfaceC4938e.c cVar, InterfaceC4938e.c cVar2) {
            return cVar2 == InterfaceC4938e.c.DEFAULT ? cVar : cVar2;
        }

        public static a n() {
            return f5347g;
        }

        public static a o() {
            return f5346f;
        }

        @Override // K5.I
        public boolean a(j jVar) {
            return s(jVar.s());
        }

        @Override // K5.I
        public boolean b(C0926g c0926g) {
            return p(c0926g.o());
        }

        @Override // K5.I
        public boolean h(j jVar) {
            return r(jVar.s());
        }

        @Override // K5.I
        public boolean k(j jVar) {
            return q(jVar.s());
        }

        protected a m(InterfaceC4938e.c cVar, InterfaceC4938e.c cVar2, InterfaceC4938e.c cVar3, InterfaceC4938e.c cVar4, InterfaceC4938e.c cVar5) {
            return (cVar == this.f5348a && cVar2 == this.f5349b && cVar3 == this.f5350c && cVar4 == this.f5351d && cVar5 == this.f5352e) ? this : new a(cVar, cVar2, cVar3, cVar4, cVar5);
        }

        public boolean p(Field field) {
            return this.f5352e.isVisible(field);
        }

        public boolean q(Method method) {
            return this.f5348a.isVisible(method);
        }

        public boolean r(Method method) {
            return this.f5349b.isVisible(method);
        }

        public boolean s(Method method) {
            return this.f5350c.isVisible(method);
        }

        @Override // K5.I
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a f(InterfaceC4938e interfaceC4938e) {
            return interfaceC4938e != null ? m(l(this.f5348a, interfaceC4938e.getterVisibility()), l(this.f5349b, interfaceC4938e.isGetterVisibility()), l(this.f5350c, interfaceC4938e.setterVisibility()), l(this.f5351d, interfaceC4938e.creatorVisibility()), l(this.f5352e, interfaceC4938e.fieldVisibility())) : this;
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.f5348a, this.f5349b, this.f5350c, this.f5351d, this.f5352e);
        }

        @Override // K5.I
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a d(InterfaceC4938e.c cVar) {
            if (cVar == InterfaceC4938e.c.DEFAULT) {
                cVar = f5346f.f5351d;
            }
            InterfaceC4938e.c cVar2 = cVar;
            return this.f5351d == cVar2 ? this : new a(this.f5348a, this.f5349b, this.f5350c, cVar2, this.f5352e);
        }

        @Override // K5.I
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public a g(InterfaceC4938e.c cVar) {
            if (cVar == InterfaceC4938e.c.DEFAULT) {
                cVar = f5346f.f5352e;
            }
            InterfaceC4938e.c cVar2 = cVar;
            return this.f5352e == cVar2 ? this : new a(this.f5348a, this.f5349b, this.f5350c, this.f5351d, cVar2);
        }

        @Override // K5.I
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public a e(InterfaceC4938e.c cVar) {
            if (cVar == InterfaceC4938e.c.DEFAULT) {
                cVar = f5346f.f5348a;
            }
            InterfaceC4938e.c cVar2 = cVar;
            return this.f5348a == cVar2 ? this : new a(cVar2, this.f5349b, this.f5350c, this.f5351d, this.f5352e);
        }

        @Override // K5.I
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a c(InterfaceC4938e.c cVar) {
            if (cVar == InterfaceC4938e.c.DEFAULT) {
                cVar = f5346f.f5349b;
            }
            InterfaceC4938e.c cVar2 = cVar;
            return this.f5349b == cVar2 ? this : new a(this.f5348a, cVar2, this.f5350c, this.f5351d, this.f5352e);
        }

        @Override // K5.I
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public a j(InterfaceC4938e.c cVar) {
            if (cVar == InterfaceC4938e.c.DEFAULT) {
                cVar = f5346f.f5350c;
            }
            InterfaceC4938e.c cVar2 = cVar;
            return this.f5350c == cVar2 ? this : new a(this.f5348a, this.f5349b, cVar2, this.f5351d, this.f5352e);
        }

        @Override // K5.I
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public a i(InterfaceC4938e.b bVar) {
            return this;
        }
    }
}
