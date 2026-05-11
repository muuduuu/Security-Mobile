package V9;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import xc.m;

/* loaded from: classes2.dex */
public final class b extends S {

    /* renamed from: l, reason: collision with root package name */
    public static final a f11076l = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f11077k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: V9.b$b, reason: collision with other inner class name */
    static final class C0204b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0204b f11078a = new C0204b();

        C0204b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                try {
                    return S.class.getMethod("k", MotionEvent.class, EventDispatcher.class, Boolean.TYPE);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            } catch (NoSuchMethodException unused2) {
                return S.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup) {
        super(viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.f11077k = i.a(C0204b.f11078a);
    }

    private final Method u() {
        return (Method) this.f11077k.getValue();
    }

    public final void v(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z10) {
        Method u10 = u();
        if (u10 != null) {
            if (V9.a.a(u10) == 3) {
                u10.invoke(this, motionEvent, eventDispatcher, Boolean.valueOf(z10));
            } else {
                u10.invoke(this, motionEvent, eventDispatcher);
            }
        }
    }
}
