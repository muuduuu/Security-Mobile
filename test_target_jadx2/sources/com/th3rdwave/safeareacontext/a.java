package com.th3rdwave.safeareacontext;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f30084a;

    /* renamed from: b, reason: collision with root package name */
    private final float f30085b;

    /* renamed from: c, reason: collision with root package name */
    private final float f30086c;

    /* renamed from: d, reason: collision with root package name */
    private final float f30087d;

    public a(float f10, float f11, float f12, float f13) {
        this.f30084a = f10;
        this.f30085b = f11;
        this.f30086c = f12;
        this.f30087d = f13;
    }

    public final float a() {
        return this.f30086c;
    }

    public final float b() {
        return this.f30087d;
    }

    public final float c() {
        return this.f30085b;
    }

    public final float d() {
        return this.f30084a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f30084a, aVar.f30084a) == 0 && Float.compare(this.f30085b, aVar.f30085b) == 0 && Float.compare(this.f30086c, aVar.f30086c) == 0 && Float.compare(this.f30087d, aVar.f30087d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f30084a) * 31) + Float.hashCode(this.f30085b)) * 31) + Float.hashCode(this.f30086c)) * 31) + Float.hashCode(this.f30087d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f30084a + ", right=" + this.f30085b + ", bottom=" + this.f30086c + ", left=" + this.f30087d + ")";
    }
}
