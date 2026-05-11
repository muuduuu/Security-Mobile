package com.swmansion.rnscreens;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2947q extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29995b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ScreenDummyLayoutHelper f29996a;

    /* renamed from: com.swmansion.rnscreens.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f29996a = new ScreenDummyLayoutHelper(reactContext);
        C2939i.f29960a.e(reactContext);
        return CollectionsKt.m(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String s10, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (Intrinsics.b(s10, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.swmansion.rnscreens.p
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = C2947q.f();
                return f10;
            }
        };
    }
}
