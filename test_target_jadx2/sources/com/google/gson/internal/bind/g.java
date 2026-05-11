package com.google.gson.internal.bind;

import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;

/* loaded from: classes2.dex */
public final class g extends u {

    /* renamed from: b, reason: collision with root package name */
    private static final v f28538b = f(s.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    private final t f28539a;

    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public u a(com.google.gson.e eVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Number.class) {
                return g.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28541a;

        static {
            int[] iArr = new int[S8.b.values().length];
            f28541a = iArr;
            try {
                iArr[S8.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28541a[S8.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28541a[S8.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private g(t tVar) {
        this.f28539a = tVar;
    }

    public static v e(t tVar) {
        return tVar == s.LAZILY_PARSED_NUMBER ? f28538b : f(tVar);
    }

    private static v f(t tVar) {
        return new g(tVar).new a();
    }

    @Override // com.google.gson.u
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(S8.a aVar) {
        S8.b N10 = aVar.N();
        int i10 = b.f28541a[N10.ordinal()];
        if (i10 == 1) {
            aVar.F();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f28539a.readNumber(aVar);
        }
        throw new o("Expecting number, got: " + N10 + "; at path " + aVar.J());
    }

    @Override // com.google.gson.u
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(S8.c cVar, Number number) {
        cVar.Q(number);
    }
}
