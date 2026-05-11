package Dd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1503a;

    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1504b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final String f1505b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f1505b = error;
        }
    }

    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1506b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f1503a;
    }

    private g(boolean z10) {
        this.f1503a = z10;
    }
}
