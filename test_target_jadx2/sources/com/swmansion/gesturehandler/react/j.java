package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.A0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends com.facebook.react.views.view.j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29784c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f29785a;

    /* renamed from: b, reason: collision with root package name */
    private i f29786b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof j) {
                    return true;
                }
                if (parent instanceof A0) {
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public j(Context context) {
        super(context);
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f29785a) {
            i iVar = this.f29786b;
            Intrinsics.d(iVar);
            if (iVar.e(event)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f29785a) {
            i iVar = this.f29786b;
            Intrinsics.d(iVar);
            if (iVar.e(ev)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean b10 = f29784c.b(this);
        this.f29785a = !b10;
        if (b10) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f29785a && this.f29786b == null) {
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f29786b = new i((ReactContext) context, this);
        }
    }

    public final void r(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        i iVar = this.f29786b;
        if (iVar != null) {
            iVar.d(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f29785a) {
            i iVar = this.f29786b;
            Intrinsics.d(iVar);
            iVar.i();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s() {
        i iVar = this.f29786b;
        if (iVar != null) {
            iVar.j();
        }
    }
}
