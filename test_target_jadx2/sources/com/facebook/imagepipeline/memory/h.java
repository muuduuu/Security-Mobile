package com.facebook.imagepipeline.memory;

import b3.l;
import java.util.LinkedList;

/* loaded from: classes.dex */
class h extends b {

    /* renamed from: f, reason: collision with root package name */
    private LinkedList f20718f;

    public h(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f20718f = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(Object obj) {
        f3.f fVar = (f3.f) this.f20718f.poll();
        if (fVar == null) {
            fVar = new f3.f();
        }
        fVar.c(obj);
        this.f20707c.add(fVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public Object g() {
        f3.f fVar = (f3.f) this.f20707c.poll();
        l.g(fVar);
        Object b10 = fVar.b();
        fVar.a();
        this.f20718f.add(fVar);
        return b10;
    }
}
