package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587d implements InterfaceC1596m {

    /* renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f17122a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1596m f17123b;

    /* renamed from: androidx.lifecycle.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17124a;

        static {
            int[] iArr = new int[AbstractC1592i.a.values().length];
            try {
                iArr[AbstractC1592i.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1592i.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1592i.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1592i.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1592i.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1592i.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1592i.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f17124a = iArr;
        }
    }

    public C1587d(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1596m interfaceC1596m) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f17122a = defaultLifecycleObserver;
        this.f17123b = interfaceC1596m;
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f17124a[event.ordinal()]) {
            case 1:
                this.f17122a.onCreate(source);
                break;
            case 2:
                this.f17122a.onStart(source);
                break;
            case 3:
                this.f17122a.onResume(source);
                break;
            case 4:
                this.f17122a.onPause(source);
                break;
            case 5:
                this.f17122a.onStop(source);
                break;
            case 6:
                this.f17122a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1596m interfaceC1596m = this.f17123b;
        if (interfaceC1596m != null) {
            interfaceC1596m.d(source, event);
        }
    }
}
