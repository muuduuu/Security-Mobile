package y9;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5180a {

    /* renamed from: a, reason: collision with root package name */
    private final String f45377a;

    /* renamed from: b, reason: collision with root package name */
    private final long f45378b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f45379c;

    /* renamed from: d, reason: collision with root package name */
    private final String f45380d;

    /* renamed from: e, reason: collision with root package name */
    private final String f45381e;

    public C5180a(String eventId, long j10, byte[] eventBytes, String syncStatus, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventBytes, "eventBytes");
        Intrinsics.checkNotNullParameter(syncStatus, "syncStatus");
        this.f45377a = eventId;
        this.f45378b = j10;
        this.f45379c = eventBytes;
        this.f45380d = syncStatus;
        this.f45381e = str;
    }

    public long a() {
        return this.f45378b;
    }

    public byte[] b() {
        return this.f45379c;
    }

    public String c() {
        return this.f45377a;
    }

    public String d() {
        return this.f45381e;
    }

    public String e() {
        return this.f45380d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type com.nextbillion.gobbler.internal.db.entity.BaseEntity");
        C5180a c5180a = (C5180a) obj;
        return Intrinsics.b(c(), c5180a.c()) && a() == c5180a.a() && Arrays.equals(b(), c5180a.b()) && Intrinsics.b(e(), c5180a.e()) && Intrinsics.b(d(), c5180a.d());
    }

    public int hashCode() {
        int hashCode = ((((((c().hashCode() * 31) + Long.hashCode(a())) * 31) + Arrays.hashCode(b())) * 31) + e().hashCode()) * 31;
        String d10 = d();
        return hashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public /* synthetic */ C5180a(String str, long j10, byte[] bArr, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, bArr, str2, (i10 & 16) != 0 ? null : str3);
    }
}
