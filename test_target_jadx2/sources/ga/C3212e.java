package ga;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1958n0;
import com.facebook.react.uimanager.InterfaceC1964q0;
import ia.AbstractC3360a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ga.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3212e extends ViewGroup implements InterfaceC1958n0, InterfaceC1964q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33638a = new a(null);

    /* renamed from: ga.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3212e(Context context, float f10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(-16777216);
        setAlpha(f10);
    }

    private final boolean getBlockGestures() {
        return !AbstractC3360a.b(getAlpha(), 0.0f, 0.0f, 2, null);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1964q0
    public EnumC1946h0 getPointerEvents() {
        return getBlockGestures() ? EnumC1946h0.AUTO : EnumC1946h0.NONE;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1958n0
    public boolean interceptsTouchEvent(float f10, float f11) {
        return getBlockGestures();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures()) {
            callOnClick();
        }
        return getBlockGestures();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1956m0
    public int reactTagForTouch(float f10, float f11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
