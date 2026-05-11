package Xb;

import android.os.Build;
import android.util.Log;
import androidx.appcompat.app.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11849a = new a();

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11851a = new b();

        b() {
            super(1);
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            Log.e("SystemUI", m10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    private a() {
    }

    public static final void a(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        f11849a.b(style, C0221a.f11850a, b.f11851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r4.equals("light") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r4.equals(org.conscrypt.BuildConfig.FLAVOR) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(String str, Function0 function0, Function1 function1) {
        int i10 = -1;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 0) {
                if (hashCode == 3075958) {
                    if (str.equals("dark")) {
                        i10 = 2;
                    }
                    function1.invoke("Invalid user interface style: \"" + str + "\"");
                    return;
                }
                if (hashCode != 102970646) {
                    if (hashCode == 1673671211 && str.equals("automatic")) {
                        if (Build.VERSION.SDK_INT < 28) {
                            i10 = 3;
                        }
                    }
                }
                function1.invoke("Invalid user interface style: \"" + str + "\"");
                return;
            }
        }
        g.N(i10);
        function0.invoke();
    }

    /* renamed from: Xb.a$a, reason: collision with other inner class name */
    static final class C0221a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0221a f11850a = new C0221a();

        C0221a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }
}
