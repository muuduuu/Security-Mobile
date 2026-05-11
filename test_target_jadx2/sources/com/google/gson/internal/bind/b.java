package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final P8.c f28515a;

    private static final class a extends u {

        /* renamed from: a, reason: collision with root package name */
        private final u f28516a;

        /* renamed from: b, reason: collision with root package name */
        private final P8.j f28517b;

        public a(com.google.gson.e eVar, Type type, u uVar, P8.j jVar) {
            this.f28516a = new k(eVar, uVar, type);
            this.f28517b = jVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            Collection collection = (Collection) this.f28517b.a();
            aVar.b();
            while (aVar.p()) {
                collection.add(this.f28516a.b(aVar));
            }
            aVar.g();
            return collection;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Collection collection) {
            if (collection == null) {
                cVar.r();
                return;
            }
            cVar.c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f28516a.d(cVar, it.next());
            }
            cVar.f();
        }
    }

    public b(P8.c cVar) {
        this.f28515a = cVar;
    }

    @Override // com.google.gson.v
    public u a(com.google.gson.e eVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = P8.b.h(type, rawType);
        return new a(eVar, h10, eVar.m(TypeToken.get(h10)), this.f28515a.b(typeToken));
    }
}
