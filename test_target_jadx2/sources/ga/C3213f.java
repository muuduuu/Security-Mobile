package ga;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1964q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ga.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3213f extends FrameLayout implements InterfaceC1964q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33639a = new a(null);

    /* renamed from: ga.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3213f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.facebook.react.uimanager.InterfaceC1964q0
    public EnumC1946h0 getPointerEvents() {
        return EnumC1946h0.BOX_NONE;
    }
}
