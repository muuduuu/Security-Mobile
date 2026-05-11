package mb;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3664b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37428c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f37429a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37430b;

    /* renamed from: mb.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3664b(d status, boolean z10) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f37429a = status;
        this.f37430b = z10;
    }

    public final boolean a() {
        return this.f37430b;
    }

    public final d b() {
        return this.f37429a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3664b)) {
            return false;
        }
        C3664b c3664b = (C3664b) obj;
        return this.f37429a == c3664b.f37429a && this.f37430b == c3664b.f37430b;
    }

    public int hashCode() {
        return (this.f37429a.hashCode() * 31) + Boolean.hashCode(this.f37430b);
    }

    public String toString() {
        return "PermissionsResponse(status=" + this.f37429a + ", canAskAgain=" + this.f37430b + ")";
    }
}
