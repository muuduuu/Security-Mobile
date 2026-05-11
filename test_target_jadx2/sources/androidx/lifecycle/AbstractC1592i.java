package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1592i {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f17128a = new AtomicReference(null);

    /* renamed from: androidx.lifecycle.i$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0292a Companion = new C0292a(null);

        /* renamed from: androidx.lifecycle.i$a$a, reason: collision with other inner class name */
        public static final class C0292a {

            /* renamed from: androidx.lifecycle.i$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0293a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f17129a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f17129a = iArr;
                }
            }

            public /* synthetic */ C0292a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0293a.f17129a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0293a.f17129a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_STOP;
                }
                if (i10 == 2) {
                    return a.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            public final a c(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0293a.f17129a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a d(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0293a.f17129a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0292a() {
            }
        }

        /* renamed from: androidx.lifecycle.i$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17130a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f17130a = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            return Companion.a(bVar);
        }

        public static final a downTo(b bVar) {
            return Companion.b(bVar);
        }

        public static final a upFrom(b bVar) {
            return Companion.c(bVar);
        }

        public static final a upTo(b bVar) {
            return Companion.d(bVar);
        }

        public final b getTargetState() {
            switch (b.f17130a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(InterfaceC1598o interfaceC1598o);

    public abstract b b();

    public final AtomicReference c() {
        return this.f17128a;
    }

    public abstract void d(InterfaceC1598o interfaceC1598o);
}
