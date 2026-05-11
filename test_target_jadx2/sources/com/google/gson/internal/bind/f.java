package com.google.gson.internal.bind;

import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private final P8.c f28532a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f28533b;

    private final class a extends u {

        /* renamed from: a, reason: collision with root package name */
        private final u f28534a;

        /* renamed from: b, reason: collision with root package name */
        private final u f28535b;

        /* renamed from: c, reason: collision with root package name */
        private final P8.j f28536c;

        public a(com.google.gson.e eVar, Type type, u uVar, Type type2, u uVar2, P8.j jVar) {
            this.f28534a = new k(eVar, uVar, type);
            this.f28535b = new k(eVar, uVar2, type2);
            this.f28536c = jVar;
        }

        private String e(com.google.gson.h hVar) {
            if (!hVar.u()) {
                if (hVar.r()) {
                    return "null";
                }
                throw new AssertionError();
            }
            n j10 = hVar.j();
            if (j10.I()) {
                return String.valueOf(j10.D());
            }
            if (j10.F()) {
                return Boolean.toString(j10.A());
            }
            if (j10.J()) {
                return j10.E();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(S8.a aVar) {
            S8.b N10 = aVar.N();
            if (N10 == S8.b.NULL) {
                aVar.F();
                return null;
            }
            Map map = (Map) this.f28536c.a();
            if (N10 == S8.b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.p()) {
                    aVar.b();
                    Object b10 = this.f28534a.b(aVar);
                    if (map.put(b10, this.f28535b.b(aVar)) != null) {
                        throw new o("duplicate key: " + b10);
                    }
                    aVar.g();
                }
                aVar.g();
            } else {
                aVar.c();
                while (aVar.p()) {
                    P8.f.f7590a.a(aVar);
                    Object b11 = this.f28534a.b(aVar);
                    if (map.put(b11, this.f28535b.b(aVar)) != null) {
                        throw new o("duplicate key: " + b11);
                    }
                }
                aVar.i();
            }
            return map;
        }

        @Override // com.google.gson.u
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Map map) {
            if (map == null) {
                cVar.r();
                return;
            }
            if (!f.this.f28533b) {
                cVar.d();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.p(String.valueOf(entry.getKey()));
                    this.f28535b.d(cVar, entry.getValue());
                }
                cVar.g();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                com.google.gson.h c10 = this.f28534a.c(entry2.getKey());
                arrayList.add(c10);
                arrayList2.add(entry2.getValue());
                z10 |= c10.m() || c10.t();
            }
            if (!z10) {
                cVar.d();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.p(e((com.google.gson.h) arrayList.get(i10)));
                    this.f28535b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.g();
                return;
            }
            cVar.c();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.c();
                P8.n.b((com.google.gson.h) arrayList.get(i10), cVar);
                this.f28535b.d(cVar, arrayList2.get(i10));
                cVar.f();
                i10++;
            }
            cVar.f();
        }
    }

    public f(P8.c cVar, boolean z10) {
        this.f28532a = cVar;
        this.f28533b = z10;
    }

    private u b(com.google.gson.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? l.f28604f : eVar.m(TypeToken.get(type));
    }

    @Override // com.google.gson.v
    public u a(com.google.gson.e eVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j10 = P8.b.j(type, rawType);
        return new a(eVar, j10[0], b(eVar, j10[0]), j10[1], eVar.m(TypeToken.get(j10[1])), this.f28532a.b(typeToken));
    }
}
