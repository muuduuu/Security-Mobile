package t;

import A.AbstractC0700h0;
import A.AbstractC0715s;
import androidx.camera.core.impl.H;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import java.util.Objects;

/* loaded from: classes.dex */
class O0 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.O f41873a;

    /* renamed from: b, reason: collision with root package name */
    private final C1607y f41874b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41875a;

        static {
            int[] iArr = new int[H.a.values().length];
            f41875a = iArr;
            try {
                iArr[H.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41875a[H.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41875a[H.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41875a[H.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41875a[H.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41875a[H.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41875a[H.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41875a[H.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    O0(androidx.camera.core.impl.O o10) {
        this.f41873a = o10;
        C1607y c1607y = new C1607y();
        this.f41874b = c1607y;
        c1607y.m(AbstractC0715s.a(AbstractC0715s.b.CLOSED));
    }

    private AbstractC0715s b() {
        return this.f41873a.c() ? AbstractC0715s.a(AbstractC0715s.b.OPENING) : AbstractC0715s.a(AbstractC0715s.b.PENDING_OPEN);
    }

    public AbstractC1604v a() {
        return this.f41874b;
    }

    public void c(H.a aVar, AbstractC0715s.a aVar2) {
        AbstractC0715s b10;
        switch (a.f41875a[aVar.ordinal()]) {
            case 1:
                b10 = b();
                break;
            case 2:
                b10 = AbstractC0715s.b(AbstractC0715s.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                b10 = AbstractC0715s.b(AbstractC0715s.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                b10 = AbstractC0715s.b(AbstractC0715s.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                b10 = AbstractC0715s.b(AbstractC0715s.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        AbstractC0700h0.a("CameraStateMachine", "New public camera state " + b10 + " from " + aVar + " and " + aVar2);
        if (Objects.equals((AbstractC0715s) this.f41874b.f(), b10)) {
            return;
        }
        AbstractC0700h0.a("CameraStateMachine", "Publishing new public camera state " + b10);
        this.f41874b.m(b10);
    }
}
