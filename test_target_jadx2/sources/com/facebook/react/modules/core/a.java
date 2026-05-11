package com.facebook.react.modules.core;

import F4.b;
import android.view.Choreographer;
import c3.AbstractC1721a;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f21757f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static a f21758g;

    /* renamed from: a, reason: collision with root package name */
    private b.a f21759a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f21760b;

    /* renamed from: c, reason: collision with root package name */
    private int f21761c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21762d;

    /* renamed from: e, reason: collision with root package name */
    private final Choreographer.FrameCallback f21763e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.facebook.react.modules.core.a$a, reason: collision with other inner class name */
    public static final class EnumC0379a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0379a[] $VALUES;
        private final int order;
        public static final EnumC0379a PERF_MARKERS = new EnumC0379a("PERF_MARKERS", 0, 0);
        public static final EnumC0379a DISPATCH_UI = new EnumC0379a("DISPATCH_UI", 1, 1);
        public static final EnumC0379a NATIVE_ANIMATED_MODULE = new EnumC0379a("NATIVE_ANIMATED_MODULE", 2, 2);
        public static final EnumC0379a TIMERS_EVENTS = new EnumC0379a("TIMERS_EVENTS", 3, 3);
        public static final EnumC0379a IDLE_EVENT = new EnumC0379a("IDLE_EVENT", 4, 4);

        private static final /* synthetic */ EnumC0379a[] $values() {
            return new EnumC0379a[]{PERF_MARKERS, DISPATCH_UI, NATIVE_ANIMATED_MODULE, TIMERS_EVENTS, IDLE_EVENT};
        }

        static {
            EnumC0379a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private EnumC0379a(String str, int i10, int i11) {
            this.order = i11;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EnumC0379a valueOf(String str) {
            return (EnumC0379a) Enum.valueOf(EnumC0379a.class, str);
        }

        public static EnumC0379a[] values() {
            return (EnumC0379a[]) $VALUES.clone();
        }

        public final int getOrder$ReactAndroid_release() {
            return this.order;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar = a.f21758g;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(F4.b choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (a.f21758g == null) {
                a.f21758g = new a(choreographerProvider, null);
            }
        }

        private b() {
        }
    }

    public /* synthetic */ a(F4.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, F4.b choreographerProvider) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(choreographerProvider, "$choreographerProvider");
        this$0.f21759a = choreographerProvider.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a this$0, long j10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f21760b) {
            try {
                this$0.f21762d = false;
                int length = this$0.f21760b.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayDeque arrayDeque = this$0.f21760b[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j10);
                            this$0.f21761c--;
                        } else {
                            AbstractC1721a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                this$0.j();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final a h() {
        return f21757f.a();
    }

    public static final void i(F4.b bVar) {
        f21757f.b(bVar);
    }

    private final void j() {
        AbstractC4012a.a(this.f21761c >= 0);
        if (this.f21761c == 0 && this.f21762d) {
            b.a aVar = this.f21759a;
            if (aVar != null) {
                aVar.b(this.f21763e);
            }
            this.f21762d = false;
        }
    }

    private final void l() {
        if (this.f21762d) {
            return;
        }
        b.a aVar = this.f21759a;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: O4.k
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.react.modules.core.a.m(com.facebook.react.modules.core.a.this);
                }
            });
        } else {
            aVar.a(this.f21763e);
            this.f21762d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f21760b) {
            this$0.l();
            Unit unit = Unit.f36324a;
        }
    }

    public final void k(EnumC0379a type, Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f21760b) {
            this.f21760b[type.getOrder$ReactAndroid_release()].addLast(callback);
            boolean z10 = true;
            int i10 = this.f21761c + 1;
            this.f21761c = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            AbstractC4012a.a(z10);
            l();
            Unit unit = Unit.f36324a;
        }
    }

    public final void n(EnumC0379a type, Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.f21760b) {
            try {
                if (this.f21760b[type.getOrder$ReactAndroid_release()].removeFirstOccurrence(frameCallback)) {
                    this.f21761c--;
                    j();
                } else {
                    AbstractC1721a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private a(final F4.b bVar) {
        int size = EnumC0379a.getEntries().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque();
        }
        this.f21760b = arrayDequeArr;
        this.f21763e = new Choreographer.FrameCallback() { // from class: O4.i
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                com.facebook.react.modules.core.a.g(com.facebook.react.modules.core.a.this, j10);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: O4.j
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.react.modules.core.a.d(com.facebook.react.modules.core.a.this, bVar);
            }
        });
    }
}
