package i4;

import c3.AbstractC1721a;
import com.facebook.imagepipeline.producers.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34137b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f34138a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Set set) {
        if (set == null) {
            this.f34138a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f34138a = arrayList;
        CollectionsKt.b0(set, arrayList);
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 producerContext, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).a(producerContext, producerName, producerEventName);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // i4.d
    public void b(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).b(producerContext);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 producerContext, String producerName, boolean z10) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).c(producerContext, producerName, z10);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 e0Var, String str, Map map) {
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).d(e0Var, str, map);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).e(producerContext, producerName);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // i4.d
    public void f(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).f(producerContext);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        List list = this.f34138a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // i4.d
    public void h(e0 producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).h(producerContext, throwable);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // i4.d
    public void i(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).i(producerContext);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 e0Var, String str, Map map) {
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).j(e0Var, str, map);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 e0Var, String str, Throwable th, Map map) {
        Iterator it = this.f34138a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).k(e0Var, str, th, map);
            } catch (Exception e10) {
                AbstractC1721a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }
}
