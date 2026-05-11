package io.sentry;

/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f35222a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f35223b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f35224c;

    /* renamed from: d, reason: collision with root package name */
    private final Double f35225d;

    public n2(Boolean bool) {
        this(bool, null);
    }

    public Boolean a() {
        return this.f35224c;
    }

    public Double b() {
        return this.f35223b;
    }

    public Boolean c() {
        return this.f35222a;
    }

    public n2(Boolean bool, Double d10) {
        this(bool, d10, Boolean.FALSE, null);
    }

    public n2(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this.f35222a = bool;
        this.f35223b = d10;
        this.f35224c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f35225d = d11;
    }
}
