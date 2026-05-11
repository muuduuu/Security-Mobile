package S3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f8735c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final c f8736d = new c("UNKNOWN", null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8737a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8738b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        int a();

        c b(byte[] bArr, int i10);
    }

    public c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8737a = name;
        this.f8738b = str;
    }

    public final String a() {
        return this.f8737a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f8737a, cVar.f8737a) && Intrinsics.b(this.f8738b, cVar.f8738b);
    }

    public int hashCode() {
        int hashCode = this.f8737a.hashCode() * 31;
        String str = this.f8738b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f8737a;
    }
}
