package v9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f44063a;

    /* renamed from: b, reason: collision with root package name */
    private String f44064b;

    /* renamed from: c, reason: collision with root package name */
    private String f44065c;

    /* renamed from: d, reason: collision with root package name */
    private String f44066d;

    public i(String name, String emailId, String accountId, String cuid) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cuid, "cuid");
        this.f44063a = name;
        this.f44064b = emailId;
        this.f44065c = accountId;
        this.f44066d = cuid;
    }

    public final String a() {
        return this.f44065c;
    }

    public final String b() {
        return this.f44066d;
    }

    public final String c() {
        return this.f44064b;
    }

    public final String d() {
        return this.f44063a;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44065c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.b(this.f44063a, iVar.f44063a) && Intrinsics.b(this.f44064b, iVar.f44064b) && Intrinsics.b(this.f44065c, iVar.f44065c) && Intrinsics.b(this.f44066d, iVar.f44066d);
    }

    public final void f(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44066d = str;
    }

    public final void g(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44064b = str;
    }

    public final void h(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44063a = str;
    }

    public int hashCode() {
        return (((((this.f44063a.hashCode() * 31) + this.f44064b.hashCode()) * 31) + this.f44065c.hashCode()) * 31) + this.f44066d.hashCode();
    }

    public String toString() {
        return "User(name=" + this.f44063a + ", emailId=" + this.f44064b + ", accountId=" + this.f44065c + ", cuid=" + this.f44066d + ")";
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BuildConfig.FLAVOR : str, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str2, (i10 & 4) != 0 ? BuildConfig.FLAVOR : str3, (i10 & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }
}
