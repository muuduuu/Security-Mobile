package N5;

import D5.z;
import java.util.Collection;
import v5.C;

/* loaded from: classes2.dex */
public class j implements M5.f {

    /* renamed from: a, reason: collision with root package name */
    protected C.b f6548a;

    /* renamed from: b, reason: collision with root package name */
    protected C.a f6549b;

    /* renamed from: c, reason: collision with root package name */
    protected String f6550c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f6551d = false;

    /* renamed from: e, reason: collision with root package name */
    protected Class f6552e;

    /* renamed from: f, reason: collision with root package name */
    protected M5.e f6553f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6554a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6555b;

        static {
            int[] iArr = new int[C.b.values().length];
            f6555b = iArr;
            try {
                iArr[C.b.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6555b[C.b.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6555b[C.b.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6555b[C.b.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6555b[C.b.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6555b[C.b.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C.a.values().length];
            f6554a = iArr2;
            try {
                iArr2[C.a.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6554a[C.a.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6554a[C.a.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6554a[C.a.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6554a[C.a.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static j l() {
        return new j().a(C.b.NONE, null);
    }

    @Override // M5.f
    public M5.g d(z zVar, D5.j jVar, Collection collection) {
        if (this.f6548a == C.b.NONE) {
            return null;
        }
        if (jVar.H() && !g(zVar, jVar)) {
            return null;
        }
        M5.e i10 = i(zVar, jVar, m(zVar), collection, true, false);
        if (this.f6548a == C.b.DEDUCTION) {
            return new b(i10, null, this.f6550c);
        }
        int i11 = a.f6554a[this.f6549b.ordinal()];
        if (i11 == 1) {
            return new N5.a(i10, null);
        }
        if (i11 == 2) {
            return new d(i10, null, this.f6550c);
        }
        if (i11 == 3) {
            return new e(i10, null);
        }
        if (i11 == 4) {
            return new c(i10, null, this.f6550c);
        }
        if (i11 == 5) {
            return new b(i10, null, this.f6550c);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f6549b);
    }

    protected boolean g(F5.l lVar, D5.j jVar) {
        return false;
    }

    @Override // M5.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j f(Class cls) {
        this.f6552e = cls;
        return this;
    }

    protected M5.e i(F5.l lVar, D5.j jVar, M5.c cVar, Collection collection, boolean z10, boolean z11) {
        M5.e eVar = this.f6553f;
        if (eVar != null) {
            return eVar;
        }
        C.b bVar = this.f6548a;
        if (bVar == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i10 = a.f6555b[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return f.e(jVar, lVar, cVar);
        }
        if (i10 == 3) {
            return h.f(jVar, lVar, cVar);
        }
        if (i10 == 4) {
            return l.e(lVar, jVar, collection, z10, z11);
        }
        if (i10 == 5) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f6548a);
    }

    @Override // M5.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j b(C.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this.f6549b = aVar;
        return this;
    }

    @Override // M5.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j a(C.b bVar, M5.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.f6548a = bVar;
        this.f6553f = eVar;
        this.f6550c = bVar.getDefaultPropertyName();
        return this;
    }

    public M5.c m(F5.l lVar) {
        return lVar.w();
    }

    @Override // M5.f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j c(boolean z10) {
        this.f6551d = z10;
        return this;
    }

    @Override // M5.f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public j e(String str) {
        if (str == null || str.isEmpty()) {
            str = this.f6548a.getDefaultPropertyName();
        }
        this.f6550c = str;
        return this;
    }
}
