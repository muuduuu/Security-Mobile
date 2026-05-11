package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2950u extends com.facebook.react.views.view.j {

    /* renamed from: a, reason: collision with root package name */
    private a f30039a;

    /* renamed from: com.swmansion.rnscreens.u$a */
    public interface a {
        void a(boolean z10, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950u(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final a getDelegate$react_native_screens_release() {
        return this.f30039a;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f30039a;
        if (aVar != null) {
            aVar.a(z10, i10, i11, i12, i13);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.f30039a = aVar;
    }
}
