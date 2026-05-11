package I0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J implements CoroutineContext.Element {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4022c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String f4023d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a, reason: collision with root package name */
    private final J f4024a;

    /* renamed from: b, reason: collision with root package name */
    private final C0845k f4025b;

    public static final class a {

        /* renamed from: I0.J$a$a, reason: collision with other inner class name */
        public static final class C0080a implements CoroutineContext.b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0080a f4026a = new C0080a();

            private C0080a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(J j10, C0845k instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f4024a = j10;
        this.f4025b = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    public final void e(InterfaceC0843i candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f4025b == candidate) {
            throw new IllegalStateException(f4023d.toString());
        }
        J j10 = this.f4024a;
        if (j10 != null) {
            j10.e(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return a.C0080a.f4026a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }
}
