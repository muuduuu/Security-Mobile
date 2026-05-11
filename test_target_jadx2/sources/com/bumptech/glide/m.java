package com.bumptech.glide;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private B2.c f20339a = B2.a.a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final B2.c b() {
        return this.f20339a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return D2.l.e(this.f20339a, ((m) obj).f20339a);
        }
        return false;
    }

    public int hashCode() {
        B2.c cVar = this.f20339a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
