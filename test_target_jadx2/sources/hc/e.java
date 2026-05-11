package Hc;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: h, reason: collision with root package name */
    public static final b f3827h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Lazy f3828i = lc.i.a(a.f3829a);

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3829a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(false, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return (e) e.f3828i.getValue();
        }

        private b() {
        }
    }

    public e(boolean z10) {
        super(new xd.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    public /* synthetic */ e(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
