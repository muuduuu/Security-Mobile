package R5;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public class J extends G {
    public J() {
        super(TimeZone.class);
    }

    @Override // R5.H, D5.o
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(TimeZone timeZone, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.h2(timeZone.getID());
    }

    @Override // R5.G, D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(TimeZone timeZone, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.f(timeZone, TimeZone.class, com.fasterxml.jackson.core.k.VALUE_STRING));
        f(timeZone, fVar, b10);
        gVar.h(fVar, g10);
    }
}
