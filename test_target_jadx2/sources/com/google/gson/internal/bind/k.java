package com.google.gson.internal.bind;

import com.google.gson.internal.bind.i;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f28572a;

    /* renamed from: b, reason: collision with root package name */
    private final u f28573b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f28574c;

    k(com.google.gson.e eVar, u uVar, Type type) {
        this.f28572a = eVar;
        this.f28573b = uVar;
        this.f28574c = type;
    }

    private static Type e(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean f(u uVar) {
        u e10;
        while ((uVar instanceof j) && (e10 = ((j) uVar).e()) != uVar) {
            uVar = e10;
        }
        return uVar instanceof i.c;
    }

    @Override // com.google.gson.u
    public Object b(S8.a aVar) {
        return this.f28573b.b(aVar);
    }

    @Override // com.google.gson.u
    public void d(S8.c cVar, Object obj) {
        u uVar = this.f28573b;
        Type e10 = e(this.f28574c, obj);
        if (e10 != this.f28574c) {
            uVar = this.f28572a.m(TypeToken.get(e10));
            if ((uVar instanceof i.c) && !f(this.f28573b)) {
                uVar = this.f28573b;
            }
        }
        uVar.d(cVar, obj);
    }
}
