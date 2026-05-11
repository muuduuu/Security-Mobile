package R5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import v5.InterfaceC4942i;

/* renamed from: R5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1139l extends G implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final Boolean f8501c;

    /* renamed from: d, reason: collision with root package name */
    protected final DateFormat f8502d;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicReference f8503e;

    protected AbstractC1139l(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f8501c = bool;
        this.f8502d = dateFormat;
        this.f8503e = dateFormat == null ? null : new AtomicReference();
    }

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        if (p10 == null) {
            return this;
        }
        InterfaceC4942i.c h10 = p10.h();
        if (h10.isNumeric()) {
            return x(Boolean.TRUE, null);
        }
        if (p10.l()) {
            DateFormat simpleDateFormat = new SimpleDateFormat(p10.g(), p10.k() ? p10.f() : b10.R());
            simpleDateFormat.setTimeZone(p10.n() ? p10.i() : b10.S());
            return x(Boolean.FALSE, simpleDateFormat);
        }
        boolean k10 = p10.k();
        boolean n10 = p10.n();
        boolean z10 = h10 == InterfaceC4942i.c.STRING;
        if (!k10 && !n10 && !z10) {
            return this;
        }
        DateFormat k11 = b10.f().k();
        if (k11 instanceof T5.p) {
            T5.p pVar = (T5.p) k11;
            if (p10.k()) {
                pVar = pVar.A(p10.f());
            }
            if (p10.n()) {
                pVar = pVar.B(p10.i());
            }
            return x(Boolean.FALSE, pVar);
        }
        if (!(k11 instanceof SimpleDateFormat)) {
            b10.j(c(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", k11.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) k11;
        DateFormat simpleDateFormat3 = k10 ? new SimpleDateFormat(simpleDateFormat2.toPattern(), p10.f()) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone i10 = p10.i();
        if (i10 != null && !i10.equals(simpleDateFormat3.getTimeZone())) {
            simpleDateFormat3.setTimeZone(i10);
        }
        return x(Boolean.FALSE, simpleDateFormat3);
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        return false;
    }

    protected boolean v(D5.B b10) {
        Boolean bool = this.f8501c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f8502d != null) {
            return false;
        }
        if (b10 != null) {
            return b10.Z(D5.A.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + c().getName());
    }

    protected void w(Date date, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (this.f8502d == null) {
            b10.u(date, fVar);
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f8503e.getAndSet(null);
        if (dateFormat == null) {
            dateFormat = (DateFormat) this.f8502d.clone();
        }
        fVar.h2(dateFormat.format(date));
        androidx.camera.view.i.a(this.f8503e, null, dateFormat);
    }

    public abstract AbstractC1139l x(Boolean bool, DateFormat dateFormat);
}
