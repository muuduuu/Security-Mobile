package c4;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.InterfaceC3606c;

/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727d extends AbstractC1724a {

    /* renamed from: j, reason: collision with root package name */
    public static final a f19370j = new a(null);

    /* renamed from: c4.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC3606c a(d0 producer, l0 settableProducerContext, i4.d listener) {
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new C1727d(producer, settableProducerContext, listener, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C1727d(d0 d0Var, l0 l0Var, i4.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }

    private C1727d(d0 d0Var, l0 l0Var, i4.d dVar) {
        super(d0Var, l0Var, dVar);
    }
}
