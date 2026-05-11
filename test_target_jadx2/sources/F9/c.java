package F9;

import Jd.C0874b0;
import Jd.G0;
import Jd.J;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lc.i;
import xc.m;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2651a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f2652b = i.a(a.f2655a);

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy f2653c = i.a(b.f2656a);

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy f2654d = i.a(C0057c.f2657a);

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2655a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return C0874b0.a();
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2656a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return C0874b0.b();
        }
    }

    /* renamed from: F9.c$c, reason: collision with other inner class name */
    static final class C0057c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0057c f2657a = new C0057c();

        C0057c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G0 invoke() {
            return C0874b0.c();
        }
    }

    private c() {
    }

    public J a() {
        return (J) f2653c.getValue();
    }
}
