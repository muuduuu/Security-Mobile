package La;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import oa.InterfaceC3771b;
import xc.m;

/* loaded from: classes2.dex */
public final class d implements InterfaceC3771b {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f5738a;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f5739a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return this.f5739a.getSharedPreferences("expo.modules.devmenu.sharedpreferences", 0);
        }
    }

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5738a = i.a(new a(context));
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.f5738a.getValue();
    }

    private final void h(String str, boolean z10) {
        d().edit().putBoolean(str, z10).apply();
    }

    @Override // oa.InterfaceC3771b
    public void a(boolean z10) {
        h("isOnboardingFinished", z10);
    }

    public boolean b() {
        return d().getBoolean("keyCommandsEnabled", true);
    }

    public boolean c() {
        return d().getBoolean("motionGestureEnabled", true);
    }

    public boolean e() {
        return d().getBoolean("showsAtLaunch", false);
    }

    public boolean f() {
        return d().getBoolean("touchGestureEnabled", true);
    }

    public boolean g() {
        return d().getBoolean("isOnboardingFinished", false);
    }

    public WritableMap i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("motionGestureEnabled", c());
        createMap.putBoolean("touchGestureEnabled", f());
        createMap.putBoolean("keyCommandsEnabled", b());
        createMap.putBoolean("showsAtLaunch", e());
        createMap.putBoolean("isOnboardingFinished", g());
        Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
        return createMap;
    }

    public void j(boolean z10) {
        h("keyCommandsEnabled", z10);
    }

    public void k(boolean z10) {
        h("motionGestureEnabled", z10);
    }

    public void l(ReadableMap settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (settings.hasKey("motionGestureEnabled")) {
            k(settings.getBoolean("motionGestureEnabled"));
        }
        if (settings.hasKey("keyCommandsEnabled")) {
            j(settings.getBoolean("keyCommandsEnabled"));
        }
        if (settings.hasKey("showsAtLaunch")) {
            m(settings.getBoolean("showsAtLaunch"));
        }
        if (settings.hasKey("touchGestureEnabled")) {
            n(settings.getBoolean("touchGestureEnabled"));
        }
    }

    public void m(boolean z10) {
        h("showsAtLaunch", z10);
    }

    public void n(boolean z10) {
        h("touchGestureEnabled", z10);
    }
}
