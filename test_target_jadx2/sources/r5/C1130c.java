package R5;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1130c extends z {
    public C1130c(S5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        super(jVar, z10, gVar, oVar);
    }

    @Override // R5.z
    public z B(Object obj, boolean z10) {
        return new C1130c(this, this.f8553d, this.f8554e, this.f8555f, this.f8556g, obj, z10);
    }

    @Override // R5.z
    protected z C(D5.d dVar, M5.g gVar, D5.o oVar, T5.m mVar) {
        return new C1130c(this, dVar, gVar, oVar, mVar, this.f8558i, this.f8559j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R5.z
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Object x(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R5.z
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Object y(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R5.z
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean z(AtomicReference atomicReference) {
        return atomicReference.get() != null;
    }

    protected C1130c(C1130c c1130c, D5.d dVar, M5.g gVar, D5.o oVar, T5.m mVar, Object obj, boolean z10) {
        super(c1130c, dVar, gVar, oVar, mVar, obj, z10);
    }
}
