package com.th3rdwave.safeareacontext;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float f30091a;

    /* renamed from: b, reason: collision with root package name */
    private final float f30092b;

    /* renamed from: c, reason: collision with root package name */
    private final float f30093c;

    /* renamed from: d, reason: collision with root package name */
    private final float f30094d;

    public c(float f10, float f11, float f12, float f13) {
        this.f30091a = f10;
        this.f30092b = f11;
        this.f30093c = f12;
        this.f30094d = f13;
    }

    public final float a() {
        return this.f30094d;
    }

    public final float b() {
        return this.f30093c;
    }

    public final float c() {
        return this.f30091a;
    }

    public final float d() {
        return this.f30092b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f30091a, cVar.f30091a) == 0 && Float.compare(this.f30092b, cVar.f30092b) == 0 && Float.compare(this.f30093c, cVar.f30093c) == 0 && Float.compare(this.f30094d, cVar.f30094d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f30091a) * 31) + Float.hashCode(this.f30092b)) * 31) + Float.hashCode(this.f30093c)) * 31) + Float.hashCode(this.f30094d);
    }

    public String toString() {
        return "Rect(x=" + this.f30091a + ", y=" + this.f30092b + ", width=" + this.f30093c + ", height=" + this.f30094d + ")";
    }
}
