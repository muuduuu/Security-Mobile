package Q0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7880c;

        a(Function0 function0, Function1 function1) {
            this.f7879b = function0;
            this.f7880c = function1;
        }

        @Override // Q0.e
        public float a() {
            return ((Number) this.f7879b.invoke()).floatValue();
        }

        @Override // Q0.e
        public void b(float f10) {
            this.f7880c.invoke(Float.valueOf(f10));
        }
    }

    private static final e a(Function1 function1, Function0 function0) {
        return new a(function0, function1);
    }

    public static final f b(Function1 setter, Function0 getter, float f10) {
        Intrinsics.f(setter, "setter");
        Intrinsics.f(getter, "getter");
        e a10 = a(setter, getter);
        return Float.isNaN(f10) ? new f(a10) : new f(a10, f10);
    }
}
