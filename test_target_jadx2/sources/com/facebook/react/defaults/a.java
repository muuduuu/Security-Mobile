package com.facebook.react.defaults;

import G4.e;
import com.facebook.react.config.ReactFeatureFlags;
import kotlin.Pair;
import lc.t;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21441a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f21442b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f21443c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f21444d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f21445e;

    /* renamed from: com.facebook.react.defaults.a$a, reason: collision with other inner class name */
    public static final class C0374a extends e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0374a(boolean z10) {
            super(true);
            this.f21446b = z10;
        }

        @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
        public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
            return this.f21446b;
        }

        @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
        public boolean useFabricInterop() {
            return this.f21446b;
        }
    }

    private a() {
    }

    public static final boolean a() {
        return f21442b;
    }

    public static final void c(boolean z10, boolean z11, boolean z12) {
        Pair b10 = f21441a.b(z10, z11, z12);
        boolean booleanValue = ((Boolean) b10.getFirst()).booleanValue();
        String str = (String) b10.getSecond();
        if (!booleanValue) {
            throw new IllegalStateException(str.toString());
        }
        ReactFeatureFlags.useTurboModules = z10;
        ReactFeatureFlags.enableFabricRenderer = z11;
        if (z12) {
            G4.a.n(new C0374a(z11));
        }
        f21442b = z11;
        f21443c = z10;
        f21444d = z11;
        f21445e = z12;
        c.f21448a.a();
    }

    public static /* synthetic */ void d(boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        c(z10, z11, z12);
    }

    public final Pair b(boolean z10, boolean z11, boolean z12) {
        return (!z11 || z10) ? (!z12 || (z10 && z11)) ? t.a(Boolean.TRUE, BuildConfig.FLAVOR) : t.a(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.") : t.a(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }
}
