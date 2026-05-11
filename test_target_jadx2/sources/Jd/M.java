package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M extends kotlin.coroutines.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5003c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f5004b;

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public M(String str) {
        super(f5003c);
        this.f5004b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && Intrinsics.b(this.f5004b, ((M) obj).f5004b);
    }

    public int hashCode() {
        return this.f5004b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f5004b + ')';
    }
}
