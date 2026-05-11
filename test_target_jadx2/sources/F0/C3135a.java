package f0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3135a {

    /* renamed from: k, reason: collision with root package name */
    public static final C0477a f32783k = new C0477a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f32784a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32785b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32786c;

    /* renamed from: d, reason: collision with root package name */
    private final b f32787d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32788e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32789f;

    /* renamed from: g, reason: collision with root package name */
    private float f32790g;

    /* renamed from: h, reason: collision with root package name */
    private float f32791h;

    /* renamed from: i, reason: collision with root package name */
    private int f32792i;

    /* renamed from: j, reason: collision with root package name */
    private GestureDetector f32793j;

    /* renamed from: f0.a$a, reason: collision with other inner class name */
    public static final class C0477a {
        public /* synthetic */ C0477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0477a() {
        }
    }

    /* renamed from: f0.a$b */
    public interface b {
    }

    /* renamed from: f0.a$c */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            C3135a.this.f32790g = e10.getX();
            C3135a.this.f32791h = e10.getY();
            C3135a.this.f32792i = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3135a(Context context, b listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public C3135a(Context context, int i10, int i11, b listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f32784a = context;
        this.f32785b = i10;
        this.f32786c = i11;
        this.f32787d = listener;
        this.f32788e = true;
        this.f32789f = true;
        this.f32793j = new GestureDetector(context, new c());
    }

    public /* synthetic */ C3135a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
