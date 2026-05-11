package Q5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final a[] f8213a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8214b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8215c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final D5.o f8216a;

        /* renamed from: b, reason: collision with root package name */
        public final a f8217b;

        /* renamed from: c, reason: collision with root package name */
        protected final Class f8218c;

        /* renamed from: d, reason: collision with root package name */
        protected final D5.j f8219d;

        /* renamed from: e, reason: collision with root package name */
        protected final boolean f8220e;

        public a(a aVar, T5.r rVar, D5.o oVar) {
            this.f8217b = aVar;
            this.f8216a = oVar;
            this.f8220e = rVar.c();
            this.f8218c = rVar.a();
            this.f8219d = rVar.b();
        }

        public boolean a(Class cls) {
            return this.f8218c == cls && this.f8220e;
        }

        public boolean b(D5.j jVar) {
            return !this.f8220e && jVar.equals(this.f8219d);
        }

        public boolean c(Class cls) {
            return this.f8218c == cls && !this.f8220e;
        }
    }

    public l(Map map) {
        int a10 = a(map.size());
        this.f8214b = a10;
        this.f8215c = a10 - 1;
        a[] aVarArr = new a[a10];
        for (Map.Entry entry : map.entrySet()) {
            T5.r rVar = (T5.r) entry.getKey();
            int hashCode = rVar.hashCode() & this.f8215c;
            aVarArr[hashCode] = new a(aVarArr[hashCode], rVar, (D5.o) entry.getValue());
        }
        this.f8213a = aVarArr;
    }

    private static final int a(int i10) {
        int i11 = 8;
        while (i11 < (i10 <= 64 ? i10 + i10 : i10 + (i10 >> 2))) {
            i11 += i11;
        }
        return i11;
    }

    public static l b(HashMap hashMap) {
        return new l(hashMap);
    }

    public D5.o c(Class cls) {
        a aVar = this.f8213a[T5.r.e(cls) & this.f8215c];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(cls)) {
            return aVar.f8216a;
        }
        do {
            aVar = aVar.f8217b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(cls));
        return aVar.f8216a;
    }

    public D5.o d(D5.j jVar) {
        a aVar = this.f8213a[T5.r.f(jVar) & this.f8215c];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(jVar)) {
            return aVar.f8216a;
        }
        do {
            aVar = aVar.f8217b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(jVar));
        return aVar.f8216a;
    }

    public D5.o e(Class cls) {
        a aVar = this.f8213a[T5.r.g(cls) & this.f8215c];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(cls)) {
            return aVar.f8216a;
        }
        do {
            aVar = aVar.f8217b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(cls));
        return aVar.f8216a;
    }
}
