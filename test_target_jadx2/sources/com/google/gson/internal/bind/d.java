package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class d implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final v f28523c;

    /* renamed from: d, reason: collision with root package name */
    private static final v f28524d;

    /* renamed from: a, reason: collision with root package name */
    private final P8.c f28525a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f28526b = new ConcurrentHashMap();

    private static class b implements v {
        private b() {
        }

        @Override // com.google.gson.v
        public u a(com.google.gson.e eVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f28523c = new b();
        f28524d = new b();
    }

    public d(P8.c cVar) {
        this.f28525a = cVar;
    }

    private static Object b(P8.c cVar, Class cls) {
        return cVar.b(TypeToken.get(cls)).a();
    }

    private static O8.b c(Class cls) {
        return (O8.b) cls.getAnnotation(O8.b.class);
    }

    private v f(Class cls, v vVar) {
        v vVar2 = (v) this.f28526b.putIfAbsent(cls, vVar);
        return vVar2 != null ? vVar2 : vVar;
    }

    @Override // com.google.gson.v
    public u a(com.google.gson.e eVar, TypeToken typeToken) {
        O8.b c10 = c(typeToken.getRawType());
        if (c10 == null) {
            return null;
        }
        return d(this.f28525a, eVar, typeToken, c10, true);
    }

    u d(P8.c cVar, com.google.gson.e eVar, TypeToken typeToken, O8.b bVar, boolean z10) {
        u a10;
        Object b10 = b(cVar, bVar.value());
        boolean nullSafe = bVar.nullSafe();
        if (b10 instanceof u) {
            a10 = (u) b10;
        } else {
            if (!(b10 instanceof v)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + b10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            v vVar = (v) b10;
            if (z10) {
                vVar = f(typeToken.getRawType(), vVar);
            }
            a10 = vVar.a(eVar, typeToken);
        }
        return (a10 == null || !nullSafe) ? a10 : a10.a();
    }

    public boolean e(TypeToken typeToken, v vVar) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(vVar);
        if (vVar == f28523c) {
            return true;
        }
        Class rawType = typeToken.getRawType();
        v vVar2 = (v) this.f28526b.get(rawType);
        if (vVar2 != null) {
            return vVar2 == vVar;
        }
        O8.b c10 = c(rawType);
        if (c10 == null) {
            return false;
        }
        Class value = c10.value();
        return v.class.isAssignableFrom(value) && f(rawType, (v) b(this.f28525a, value)) == vVar;
    }
}
