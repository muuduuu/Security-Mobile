package u6;

import java.util.Arrays;
import s6.C4317c;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C4317c f43560a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f43561b;

    public h(C4317c c4317c, byte[] bArr) {
        if (c4317c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f43560a = c4317c;
        this.f43561b = bArr;
    }

    public byte[] a() {
        return this.f43561b;
    }

    public C4317c b() {
        return this.f43560a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f43560a.equals(hVar.f43560a)) {
            return Arrays.equals(this.f43561b, hVar.f43561b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f43560a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43561b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f43560a + ", bytes=[...]}";
    }
}
