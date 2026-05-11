package I0;

import Jd.InterfaceC0914w;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* renamed from: a, reason: collision with root package name */
        private final Function2 f4242a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0914w f4243b;

        /* renamed from: c, reason: collision with root package name */
        private final D f4244c;

        /* renamed from: d, reason: collision with root package name */
        private final CoroutineContext f4245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC0914w ack, D d10, CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f4242a = transform;
            this.f4243b = ack;
            this.f4244c = d10;
            this.f4245d = callerContext;
        }

        public final InterfaceC0914w a() {
            return this.f4243b;
        }

        public final CoroutineContext b() {
            return this.f4245d;
        }

        public D c() {
            return this.f4244c;
        }

        public final Function2 d() {
            return this.f4242a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
