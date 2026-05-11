package Q5;

import D5.B;
import R5.H;

/* loaded from: classes2.dex */
public class q extends H {

    /* renamed from: c, reason: collision with root package name */
    protected final D5.j f8227c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f8228d;

    public q(D5.j jVar, String str) {
        super(Object.class);
        this.f8227c = jVar;
        this.f8228d = str;
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        b10.i(this.f8227c, this.f8228d);
    }
}
