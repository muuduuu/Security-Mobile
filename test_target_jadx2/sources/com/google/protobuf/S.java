package com.google.protobuf;

import com.google.protobuf.AbstractC2874e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class S implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final N f28699a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f28700b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28701c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2885p f28702d;

    private S(i0 i0Var, AbstractC2885p abstractC2885p, N n10) {
        this.f28700b = i0Var;
        this.f28701c = abstractC2885p.d(n10);
        this.f28702d = abstractC2885p;
        this.f28699a = n10;
    }

    private int j(i0 i0Var, Object obj) {
        return i0Var.e(i0Var.c(obj));
    }

    static S k(i0 i0Var, AbstractC2885p abstractC2885p, N n10) {
        return new S(i0Var, abstractC2885p, n10);
    }

    private void l(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.j(i0Var.c(obj), p0Var);
    }

    @Override // com.google.protobuf.c0
    public void a(Object obj, Object obj2) {
        e0.F(this.f28700b, obj, obj2);
        if (this.f28701c) {
            e0.D(this.f28702d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.c0
    public Object b() {
        N n10 = this.f28699a;
        return n10 instanceof AbstractC2891w ? ((AbstractC2891w) n10).newMutableInstance() : n10.newBuilderForType().I();
    }

    @Override // com.google.protobuf.c0
    public boolean c(Object obj, Object obj2) {
        if (!this.f28700b.c(obj).equals(this.f28700b.c(obj2))) {
            return false;
        }
        if (this.f28701c) {
            return this.f28702d.b(obj).equals(this.f28702d.b(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.c0
    public int d(Object obj) {
        int hashCode = this.f28700b.c(obj).hashCode();
        return this.f28701c ? (hashCode * 53) + this.f28702d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.c0
    public void e(Object obj) {
        this.f28700b.f(obj);
        this.f28702d.e(obj);
    }

    @Override // com.google.protobuf.c0
    public final boolean f(Object obj) {
        return this.f28702d.b(obj).e();
    }

    @Override // com.google.protobuf.c0
    public int g(Object obj) {
        int j10 = j(this.f28700b, obj);
        return this.f28701c ? j10 + this.f28702d.b(obj).b() : j10;
    }

    @Override // com.google.protobuf.c0
    public void h(Object obj, p0 p0Var) {
        Iterator f10 = this.f28702d.b(obj).f();
        if (f10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) f10.next()).getKey());
            throw null;
        }
        l(this.f28700b, obj, p0Var);
    }

    @Override // com.google.protobuf.c0
    public void i(Object obj, byte[] bArr, int i10, int i11, AbstractC2874e.a aVar) {
        AbstractC2891w abstractC2891w = (AbstractC2891w) obj;
        if (abstractC2891w.unknownFields == j0.c()) {
            abstractC2891w.unknownFields = j0.k();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
