package F5;

import D5.AbstractC0776b;
import D5.x;
import K5.AbstractC0920a;
import K5.t;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    private static final TimeZone f2498k = TimeZone.getTimeZone("UTC");

    /* renamed from: a, reason: collision with root package name */
    protected final S5.o f2499a;

    /* renamed from: b, reason: collision with root package name */
    protected final t f2500b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC0776b f2501c;

    /* renamed from: d, reason: collision with root package name */
    protected final AbstractC0920a.AbstractC0101a f2502d;

    /* renamed from: e, reason: collision with root package name */
    protected final M5.f f2503e;

    /* renamed from: f, reason: collision with root package name */
    protected final M5.c f2504f;

    /* renamed from: g, reason: collision with root package name */
    protected final DateFormat f2505g;

    /* renamed from: h, reason: collision with root package name */
    protected final Locale f2506h;

    /* renamed from: i, reason: collision with root package name */
    protected final TimeZone f2507i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.a f2508j;

    public a(t tVar, AbstractC0776b abstractC0776b, x xVar, S5.o oVar, M5.f fVar, DateFormat dateFormat, k kVar, Locale locale, TimeZone timeZone, com.fasterxml.jackson.core.a aVar, M5.c cVar, AbstractC0920a.AbstractC0101a abstractC0101a) {
        this.f2500b = tVar;
        this.f2501c = abstractC0776b;
        this.f2499a = oVar;
        this.f2503e = fVar;
        this.f2505g = dateFormat;
        this.f2506h = locale;
        this.f2507i = timeZone;
        this.f2508j = aVar;
        this.f2504f = cVar;
        this.f2502d = abstractC0101a;
    }

    public AbstractC0920a.AbstractC0101a a() {
        return this.f2502d;
    }

    public AbstractC0776b b() {
        return this.f2501c;
    }

    public com.fasterxml.jackson.core.a c() {
        return this.f2508j;
    }

    public t d() {
        return this.f2500b;
    }

    public DateFormat e() {
        return this.f2505g;
    }

    public k f() {
        return null;
    }

    public Locale g() {
        return this.f2506h;
    }

    public M5.c h() {
        return this.f2504f;
    }

    public x i() {
        return null;
    }

    public TimeZone j() {
        TimeZone timeZone = this.f2507i;
        return timeZone == null ? f2498k : timeZone;
    }

    public S5.o k() {
        return this.f2499a;
    }

    public M5.f l() {
        return this.f2503e;
    }

    public a m(t tVar) {
        return this.f2500b == tVar ? this : new a(tVar, this.f2501c, null, this.f2499a, this.f2503e, this.f2505g, null, this.f2506h, this.f2507i, this.f2508j, this.f2504f, this.f2502d);
    }
}
