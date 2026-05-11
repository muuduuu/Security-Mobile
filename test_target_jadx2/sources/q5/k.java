package Q5;

import D5.B;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f8199a;

    private static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        private final Class f8200b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f8201c;

        /* renamed from: d, reason: collision with root package name */
        private final D5.o f8202d;

        /* renamed from: e, reason: collision with root package name */
        private final D5.o f8203e;

        public a(k kVar, Class cls, D5.o oVar, Class cls2, D5.o oVar2) {
            super(kVar);
            this.f8200b = cls;
            this.f8202d = oVar;
            this.f8201c = cls2;
            this.f8203e = oVar2;
        }

        @Override // Q5.k
        public k i(Class cls, D5.o oVar) {
            return new c(this, new f[]{new f(this.f8200b, this.f8202d), new f(this.f8201c, this.f8203e), new f(cls, oVar)});
        }

        @Override // Q5.k
        public D5.o j(Class cls) {
            if (cls == this.f8200b) {
                return this.f8202d;
            }
            if (cls == this.f8201c) {
                return this.f8203e;
            }
            return null;
        }
    }

    private static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8204b = new b(false);

        /* renamed from: c, reason: collision with root package name */
        public static final b f8205c = new b(true);

        protected b(boolean z10) {
            super(z10);
        }

        @Override // Q5.k
        public k i(Class cls, D5.o oVar) {
            return new e(this, cls, oVar);
        }

        @Override // Q5.k
        public D5.o j(Class cls) {
            return null;
        }
    }

    private static final class c extends k {

        /* renamed from: b, reason: collision with root package name */
        private final f[] f8206b;

        public c(k kVar, f[] fVarArr) {
            super(kVar);
            this.f8206b = fVarArr;
        }

        @Override // Q5.k
        public k i(Class cls, D5.o oVar) {
            f[] fVarArr = this.f8206b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.f8199a ? new e(this, cls, oVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, oVar);
            return new c(this, fVarArr2);
        }

        @Override // Q5.k
        public D5.o j(Class cls) {
            f[] fVarArr = this.f8206b;
            f fVar = fVarArr[0];
            if (fVar.f8211a == cls) {
                return fVar.f8212b;
            }
            f fVar2 = fVarArr[1];
            if (fVar2.f8211a == cls) {
                return fVar2.f8212b;
            }
            f fVar3 = fVarArr[2];
            if (fVar3.f8211a == cls) {
                return fVar3.f8212b;
            }
            switch (fVarArr.length) {
                case 8:
                    f fVar4 = fVarArr[7];
                    if (fVar4.f8211a == cls) {
                        return fVar4.f8212b;
                    }
                case 7:
                    f fVar5 = fVarArr[6];
                    if (fVar5.f8211a == cls) {
                        return fVar5.f8212b;
                    }
                case 6:
                    f fVar6 = fVarArr[5];
                    if (fVar6.f8211a == cls) {
                        return fVar6.f8212b;
                    }
                case 5:
                    f fVar7 = fVarArr[4];
                    if (fVar7.f8211a == cls) {
                        return fVar7.f8212b;
                    }
                case 4:
                    f fVar8 = fVarArr[3];
                    if (fVar8.f8211a == cls) {
                        return fVar8.f8212b;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final D5.o f8207a;

        /* renamed from: b, reason: collision with root package name */
        public final k f8208b;

        public d(D5.o oVar, k kVar) {
            this.f8207a = oVar;
            this.f8208b = kVar;
        }
    }

    private static final class e extends k {

        /* renamed from: b, reason: collision with root package name */
        private final Class f8209b;

        /* renamed from: c, reason: collision with root package name */
        private final D5.o f8210c;

        public e(k kVar, Class cls, D5.o oVar) {
            super(kVar);
            this.f8209b = cls;
            this.f8210c = oVar;
        }

        @Override // Q5.k
        public k i(Class cls, D5.o oVar) {
            return new a(this, this.f8209b, this.f8210c, cls, oVar);
        }

        @Override // Q5.k
        public D5.o j(Class cls) {
            if (cls == this.f8209b) {
                return this.f8210c;
            }
            return null;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Class f8211a;

        /* renamed from: b, reason: collision with root package name */
        public final D5.o f8212b;

        public f(Class cls, D5.o oVar) {
            this.f8211a = cls;
            this.f8212b = oVar;
        }
    }

    protected k(boolean z10) {
        this.f8199a = z10;
    }

    public static k c() {
        return b.f8204b;
    }

    public final d a(D5.j jVar, D5.o oVar) {
        return new d(oVar, i(jVar.q(), oVar));
    }

    public final d b(Class cls, D5.o oVar) {
        return new d(oVar, i(cls, oVar));
    }

    public final d d(Class cls, B b10, D5.d dVar) {
        D5.o z10 = b10.z(cls, dVar);
        return new d(z10, i(cls, z10));
    }

    public final d e(D5.j jVar, B b10, D5.d dVar) {
        D5.o D10 = b10.D(jVar, dVar);
        return new d(D10, i(jVar.q(), D10));
    }

    public final d f(Class cls, B b10, D5.d dVar) {
        D5.o E10 = b10.E(cls, dVar);
        return new d(E10, i(cls, E10));
    }

    public final d g(D5.j jVar, B b10, D5.d dVar) {
        D5.o w10 = b10.w(jVar, dVar);
        return new d(w10, i(jVar.q(), w10));
    }

    public final d h(Class cls, B b10, D5.d dVar) {
        D5.o x10 = b10.x(cls, dVar);
        return new d(x10, i(cls, x10));
    }

    public abstract k i(Class cls, D5.o oVar);

    public abstract D5.o j(Class cls);

    protected k(k kVar) {
        this.f8199a = kVar.f8199a;
    }
}
