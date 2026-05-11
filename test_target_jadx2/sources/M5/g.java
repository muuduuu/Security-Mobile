package M5;

import B5.b;
import C5.l;
import com.fasterxml.jackson.core.k;
import v5.C;

/* loaded from: classes2.dex */
public abstract class g {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6074a;

        static {
            int[] iArr = new int[C.a.values().length];
            f6074a = iArr;
            try {
                iArr[C.a.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6074a[C.a.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6074a[C.a.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6074a[C.a.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6074a[C.a.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract g a(D5.d dVar);

    public abstract String b();

    public abstract C.a c();

    public B5.b d(Object obj, k kVar) {
        B5.b bVar = new B5.b(obj, kVar);
        int i10 = a.f6074a[c().ordinal()];
        if (i10 == 1) {
            bVar.f445e = b.a.PAYLOAD_PROPERTY;
            bVar.f444d = b();
        } else if (i10 == 2) {
            bVar.f445e = b.a.PARENT_PROPERTY;
            bVar.f444d = b();
        } else if (i10 == 3) {
            bVar.f445e = b.a.METADATA_PROPERTY;
            bVar.f444d = b();
        } else if (i10 == 4) {
            bVar.f445e = b.a.WRAPPER_ARRAY;
        } else if (i10 != 5) {
            l.a();
        } else {
            bVar.f445e = b.a.WRAPPER_OBJECT;
        }
        return bVar;
    }

    public B5.b e(Object obj, k kVar, Object obj2) {
        B5.b d10 = d(obj, kVar);
        d10.f443c = obj2;
        return d10;
    }

    public B5.b f(Object obj, Class cls, k kVar) {
        B5.b d10 = d(obj, kVar);
        d10.f442b = cls;
        return d10;
    }

    public abstract B5.b g(com.fasterxml.jackson.core.f fVar, B5.b bVar);

    public abstract B5.b h(com.fasterxml.jackson.core.f fVar, B5.b bVar);
}
