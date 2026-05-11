package Ib;

import Db.J;
import Db.K;
import Ga.d;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.adapters.react.NativeModulesProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pb.AbstractC3864c;
import pb.C3862a;
import pb.j;
import pb.o;
import vb.InterfaceC5007b;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4393a;

    /* renamed from: b, reason: collision with root package name */
    private final View f4394b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f4395c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4396d;

    public a(String name, View view, Function1 function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f4393a = name;
        this.f4394b = view;
        this.f4395c = function1;
    }

    private final WritableMap a(Object obj) {
        Object b10 = J.b(J.f1409a, obj, null, false, 6, null);
        if ((b10 instanceof Unit) || b10 == null) {
            return null;
        }
        if (b10 instanceof WritableMap) {
            return (WritableMap) b10;
        }
        WritableMap b11 = J.b.f1410a.b();
        K.b(b11, "payload", b10);
        return b11;
    }

    @Override // Ib.b
    public void invoke(Object obj) {
        Context context = this.f4394b.getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        NativeModulesProxy a10 = o.a((ReactContext) context);
        if (a10 == null) {
            return;
        }
        C3862a f10 = a10.getKotlinInteropModuleRegistry().f();
        if (!this.f4396d) {
            j r10 = f10.p().h().r(this.f4394b.getClass());
            if (r10 == null) {
                d.g(AbstractC3864c.a(), "⚠️ Cannot get module holder for " + this.f4394b.getClass(), null, 2, null);
                return;
            }
            expo.modules.kotlin.views.o h10 = r10.e().h();
            expo.modules.kotlin.views.b c10 = h10 != null ? h10.c() : null;
            if (c10 == null) {
                d.g(AbstractC3864c.a(), "⚠️ Cannot get callbacks for " + r10.g().getClass(), null, 2, null);
                return;
            }
            for (String str : c10.a()) {
                if (Intrinsics.b(str, this.f4393a)) {
                    this.f4396d = true;
                }
            }
            d.g(AbstractC3864c.a(), "⚠️ Event " + this.f4393a + " wasn't exported from " + r10.g().getClass(), null, 2, null);
            return;
        }
        InterfaceC5007b k10 = f10.k();
        if (k10 != null) {
            View view = this.f4394b;
            String str2 = this.f4393a;
            WritableMap a11 = a(obj);
            Function1 function1 = this.f4395c;
            k10.a(view, str2, a11, function1 != null ? (Short) function1.invoke(obj) : null);
        }
    }
}
