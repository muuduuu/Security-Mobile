package Q5;

import D5.B;
import v5.I;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final I f8231a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8232b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f8233c = false;

    public t(I i10) {
        this.f8231a = i10;
    }

    public Object a(Object obj) {
        if (this.f8232b == null) {
            this.f8232b = this.f8231a.c(obj);
        }
        return this.f8232b;
    }

    public void b(com.fasterxml.jackson.core.f fVar, B b10, i iVar) {
        this.f8233c = true;
        if (fVar.f()) {
            Object obj = this.f8232b;
            fVar.m1(obj == null ? null : String.valueOf(obj));
            return;
        }
        com.fasterxml.jackson.core.n nVar = iVar.f8194b;
        if (nVar != null) {
            fVar.i0(nVar);
            iVar.f8196d.f(this.f8232b, fVar, b10);
        }
    }

    public boolean c(com.fasterxml.jackson.core.f fVar, B b10, i iVar) {
        if (this.f8232b == null) {
            return false;
        }
        if (!this.f8233c && !iVar.f8197e) {
            return false;
        }
        if (fVar.f()) {
            fVar.o1(String.valueOf(this.f8232b));
            return true;
        }
        iVar.f8196d.f(this.f8232b, fVar, b10);
        return true;
    }
}
