package Ee;

import De.A;
import De.f;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f2155a;

    private a(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("gson == null");
        }
        this.f2155a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        return new a(eVar);
    }

    @Override // De.f.a
    public f c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, A a10) {
        return new b(this.f2155a, this.f2155a.m(TypeToken.get(type)));
    }

    @Override // De.f.a
    public f d(Type type, Annotation[] annotationArr, A a10) {
        return new c(this.f2155a, this.f2155a.m(TypeToken.get(type)));
    }
}
