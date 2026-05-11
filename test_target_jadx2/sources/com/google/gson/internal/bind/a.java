package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final v f28512c = new C0419a();

    /* renamed from: a, reason: collision with root package name */
    private final Class f28513a;

    /* renamed from: b, reason: collision with root package name */
    private final u f28514b;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0419a implements v {
        C0419a() {
        }

        @Override // com.google.gson.v
        public u a(com.google.gson.e eVar, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = P8.b.g(type);
            return new a(eVar, eVar.m(TypeToken.get(g10)), P8.b.k(g10));
        }
    }

    public a(com.google.gson.e eVar, u uVar, Class cls) {
        this.f28514b = new k(eVar, uVar, cls);
        this.f28513a = cls;
    }

    @Override // com.google.gson.u
    public Object b(S8.a aVar) {
        if (aVar.N() == S8.b.NULL) {
            aVar.F();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.p()) {
            arrayList.add(this.f28514b.b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        if (!this.f28513a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f28513a, size));
        }
        Object newInstance = Array.newInstance((Class<?>) this.f28513a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // com.google.gson.u
    public void d(S8.c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f28514b.d(cVar, Array.get(obj, i10));
        }
        cVar.f();
    }
}
