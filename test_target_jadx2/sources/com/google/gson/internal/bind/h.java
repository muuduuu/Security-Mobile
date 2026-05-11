package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final v f28542c = f(s.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f28543a;

    /* renamed from: b, reason: collision with root package name */
    private final t f28544b;

    class a implements v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f28545a;

        a(t tVar) {
            this.f28545a = tVar;
        }

        @Override // com.google.gson.v
        public u a(com.google.gson.e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Object.class) {
                return new h(eVar, this.f28545a, aVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28546a;

        static {
            int[] iArr = new int[S8.b.values().length];
            f28546a = iArr;
            try {
                iArr[S8.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28546a[S8.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28546a[S8.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28546a[S8.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28546a[S8.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28546a[S8.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ h(com.google.gson.e eVar, t tVar, a aVar) {
        this(eVar, tVar);
    }

    public static v e(t tVar) {
        return tVar == s.DOUBLE ? f28542c : f(tVar);
    }

    private static v f(t tVar) {
        return new a(tVar);
    }

    private Object g(S8.a aVar, S8.b bVar) {
        int i10 = b.f28546a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.I();
        }
        if (i10 == 4) {
            return this.f28544b.readNumber(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.t());
        }
        if (i10 == 6) {
            aVar.F();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(S8.a aVar, S8.b bVar) {
        int i10 = b.f28546a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.b();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.c();
        return new P8.h();
    }

    @Override // com.google.gson.u
    public Object b(S8.a aVar) {
        S8.b N10 = aVar.N();
        Object h10 = h(aVar, N10);
        if (h10 == null) {
            return g(aVar, N10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.p()) {
                String z10 = h10 instanceof Map ? aVar.z() : null;
                S8.b N11 = aVar.N();
                Object h11 = h(aVar, N11);
                boolean z11 = h11 != null;
                if (h11 == null) {
                    h11 = g(aVar, N11);
                }
                if (h10 instanceof List) {
                    ((List) h10).add(h11);
                } else {
                    ((Map) h10).put(z10, h11);
                }
                if (z11) {
                    arrayDeque.addLast(h10);
                    h10 = h11;
                }
            } else {
                if (h10 instanceof List) {
                    aVar.g();
                } else {
                    aVar.i();
                }
                if (arrayDeque.isEmpty()) {
                    return h10;
                }
                h10 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.u
    public void d(S8.c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        u n10 = this.f28543a.n(obj.getClass());
        if (!(n10 instanceof h)) {
            n10.d(cVar, obj);
        } else {
            cVar.d();
            cVar.g();
        }
    }

    private h(com.google.gson.e eVar, t tVar) {
        this.f28543a = eVar;
        this.f28544b = tVar;
    }
}
