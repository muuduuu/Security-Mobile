package F4;

import F4.b;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2496a = new a();

    /* renamed from: F4.a$a, reason: collision with other inner class name */
    private static final class C0055a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final Choreographer f2497a;

        public C0055a() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
            this.f2497a = choreographer;
        }

        @Override // F4.b.a
        public void a(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f2497a.postFrameCallback(callback);
        }

        @Override // F4.b.a
        public void b(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f2497a.removeFrameCallback(callback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f2496a;
    }

    @Override // F4.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0055a();
    }
}
