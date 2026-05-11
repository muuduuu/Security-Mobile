package H;

import A.AbstractC0700h0;
import A.W;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements W.i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3064e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W.i f3065a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3066b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3067c;

    /* renamed from: d, reason: collision with root package name */
    private W.j f3068d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(W.i iVar) {
            return new j(iVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ j(W.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f3066b) {
            try {
                if (this$0.f3068d == null) {
                    AbstractC0700h0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                this$0.e();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        Unit unit;
        synchronized (this.f3066b) {
            try {
                if (this.f3067c) {
                    W.i iVar = this.f3065a;
                    if (iVar != null) {
                        iVar.clear();
                        unit = Unit.f36324a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        AbstractC0700h0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC0700h0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f3067c = false;
                Unit unit2 = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        synchronized (this.f3066b) {
            try {
                W.j jVar = this.f3068d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f3068d = null;
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final j g(W.i iVar) {
        return f3064e.a(iVar);
    }

    @Override // A.W.i
    public void a(long j10, W.j screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.f3066b) {
            this.f3067c = true;
            this.f3068d = screenFlashListener;
            Unit unit2 = Unit.f36324a;
        }
        W.i iVar = this.f3065a;
        if (iVar != null) {
            iVar.a(j10, new W.j() { // from class: H.i
                @Override // A.W.j
                public final void a() {
                    j.c(j.this);
                }
            });
            unit = Unit.f36324a;
        } else {
            unit = null;
        }
        if (unit == null) {
            AbstractC0700h0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // A.W.i
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    public final W.i h() {
        return this.f3065a;
    }

    private j(W.i iVar) {
        this.f3065a = iVar;
        this.f3066b = new Object();
    }
}
