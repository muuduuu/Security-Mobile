package M;

import M.C0972t;
import androidx.concurrent.futures.c;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0954a extends C0972t.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f5887a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5888b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f5889c;

    C0954a(int i10, int i11, c.a aVar) {
        this.f5887a = i10;
        this.f5888b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f5889c = aVar;
    }

    @Override // M.C0972t.b
    c.a a() {
        return this.f5889c;
    }

    @Override // M.C0972t.b
    int b() {
        return this.f5887a;
    }

    @Override // M.C0972t.b
    int c() {
        return this.f5888b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0972t.b)) {
            return false;
        }
        C0972t.b bVar = (C0972t.b) obj;
        return this.f5887a == bVar.b() && this.f5888b == bVar.c() && this.f5889c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f5887a ^ 1000003) * 1000003) ^ this.f5888b) * 1000003) ^ this.f5889c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f5887a + ", rotationDegrees=" + this.f5888b + ", completer=" + this.f5889c + "}";
    }
}
