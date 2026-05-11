package com.google.protobuf;

/* loaded from: classes2.dex */
class k0 extends i0 {
    k0() {
    }

    @Override // com.google.protobuf.i0
    void f(Object obj) {
        c(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(j0 j0Var, int i10, long j10) {
        j0Var.n(o0.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public j0 b(Object obj) {
        j0 c10 = c(obj);
        if (c10 != j0.c()) {
            return c10;
        }
        j0 k10 = j0.k();
        i(obj, k10);
        return k10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j0 c(Object obj) {
        return ((AbstractC2891w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int d(j0 j0Var) {
        return j0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(j0 j0Var) {
        return j0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public j0 g(j0 j0Var, j0 j0Var2) {
        return j0.c().equals(j0Var2) ? j0Var : j0.c().equals(j0Var) ? j0.j(j0Var, j0Var2) : j0Var.i(j0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(Object obj, j0 j0Var) {
        i(obj, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void i(Object obj, j0 j0Var) {
        ((AbstractC2891w) obj).unknownFields = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void j(j0 j0Var, p0 p0Var) {
        j0Var.p(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(j0 j0Var, p0 p0Var) {
        j0Var.r(p0Var);
    }
}
