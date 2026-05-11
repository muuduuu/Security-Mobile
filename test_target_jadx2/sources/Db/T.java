package Db;

import Db.C;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.d f1423a;

    /* renamed from: b, reason: collision with root package name */
    private final C f1424b;

    public T(kotlin.reflect.d klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f1423a = klass;
        C qVar = Intrinsics.b(klass, C5142C.b(Unit.class)) ? new C.q() : Intrinsics.b(klass, C5142C.b(Bundle.class)) ? new C.e() : Intrinsics.b(klass, C5142C.b(int[].class)) ? new C.m() : Intrinsics.b(klass, C5142C.b(float[].class)) ? new C.l() : Intrinsics.b(klass, C5142C.b(double[].class)) ? new C.h() : Intrinsics.b(klass, C5142C.b(boolean[].class)) ? new C.d() : Intrinsics.b(klass, C5142C.b(byte[].class)) ? new C.f() : Intrinsics.b(klass, C5142C.b(URI.class)) ? new C.t() : Intrinsics.b(klass, C5142C.b(URL.class)) ? new C.u() : Intrinsics.b(klass, C5142C.b(Uri.class)) ? new C.a() : Intrinsics.b(klass, C5142C.b(File.class)) ? new C.k() : Intrinsics.b(klass, C5142C.b(Pair.class)) ? new C.p() : Intrinsics.b(klass, C5142C.b(Long.TYPE)) ? new C.n() : Intrinsics.b(klass, C5142C.b(kotlin.time.a.class)) ? new C.i() : Intrinsics.b(klass, C5142C.b(Object.class)) ? new C.b() : null;
        this.f1424b = qVar == null ? Map.class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.o() : Enum.class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.j() : Ab.c.class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.s() : Cb.i.class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.r() : Object[].class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.c() : Collection.class.isAssignableFrom(AbstractC5011a.b(this.f1423a)) ? new C.g() : new C.q() : qVar;
    }

    public final Object b(Object obj) {
        return this.f1424b.a(obj);
    }
}
