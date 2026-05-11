package Q2;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f8102a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f8103b = lc.i.a(a.f8104a);

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8104a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.gson.e invoke() {
            return new com.google.gson.f().c().d().f().b();
        }
    }

    private m() {
    }

    public final com.google.gson.e a() {
        Object value = f8103b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-instance>(...)");
        return (com.google.gson.e) value;
    }
}
