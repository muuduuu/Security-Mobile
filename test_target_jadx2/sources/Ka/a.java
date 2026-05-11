package Ka;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import oa.AbstractC3772c;
import oa.InterfaceC3770a;
import oa.InterfaceC3771b;
import xc.m;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3770a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5502a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList f5503b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy f5504c = i.a(b.f5507a);

    /* renamed from: Ka.a$a, reason: collision with other inner class name */
    public static final class C0105a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5505a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5506b;

        public C0105a(String name, boolean z10) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5505a = name;
            this.f5506b = z10;
        }

        public final String a() {
            return this.f5505a;
        }

        public final boolean b() {
            return this.f5506b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0105a)) {
                return false;
            }
            C0105a c0105a = (C0105a) obj;
            return Intrinsics.b(this.f5505a, c0105a.f5505a) && this.f5506b == c0105a.f5506b;
        }

        public int hashCode() {
            return (this.f5505a.hashCode() * 31) + Boolean.hashCode(this.f5506b);
        }

        public String toString() {
            return "Callback(name=" + this.f5505a + ", shouldCollapse=" + this.f5506b + ")";
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5507a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            throw new IllegalStateException("DevMenu isn't available in release builds");
        }
    }

    private a() {
    }

    @Override // oa.InterfaceC3770a
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public void b() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final AbstractC3772c c() {
        return null;
    }

    public final ArrayList d() {
        return f5503b;
    }

    public InterfaceC3771b e() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public void f() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void h() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void i() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public void j(String eventName, Object obj) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void k() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void l() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void m() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }

    public final void n() {
        throw new IllegalStateException("DevMenu isn't available in release builds");
    }
}
