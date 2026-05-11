package N2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f6532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6533b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6534c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6535d;

    public a(String title, String message, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f6532a = title;
        this.f6533b = message;
        this.f6534c = str;
        this.f6535d = str2;
    }

    public final String a() {
        return this.f6533b;
    }

    public final String b() {
        return this.f6535d;
    }

    public final String c() {
        return this.f6534c;
    }

    public final String d() {
        return this.f6532a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f6532a, aVar.f6532a) && Intrinsics.b(this.f6533b, aVar.f6533b) && Intrinsics.b(this.f6534c, aVar.f6534c) && Intrinsics.b(this.f6535d, aVar.f6535d);
    }

    public int hashCode() {
        int hashCode = ((this.f6532a.hashCode() * 31) + this.f6533b.hashCode()) * 31;
        String str = this.f6534c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6535d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DialogData(title=" + this.f6532a + ", message=" + this.f6533b + ", positiveButtonText=" + ((Object) this.f6534c) + ", negativeButtonText=" + ((Object) this.f6535d) + ')';
    }
}
