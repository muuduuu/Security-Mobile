package O3;

import O3.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d extends O3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7023c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final List f7024b = new ArrayList(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // O3.a, O3.b
    public void a(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).a(id2, obj);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // O3.a, O3.b
    public void c(String id2, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).c(id2, aVar);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // O3.a, O3.b
    public void d(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).d(id2);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // O3.a, O3.b
    public void e(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).e(id2, obj, aVar);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // O3.a, O3.b
    public void f(String id2, Throwable th, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).f(id2, th, aVar);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // O3.a, O3.b
    public void g(String id2, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f7024b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f7024b.get(i10)).g(id2, obj, aVar);
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void i(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7024b.add(listener);
    }

    public final synchronized void j(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7024b.remove(listener);
    }
}
