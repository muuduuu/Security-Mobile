package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
class e3 {

    /* renamed from: a, reason: collision with root package name */
    q2 f30510a;

    /* renamed from: c, reason: collision with root package name */
    private Context f30512c;

    /* renamed from: b, reason: collision with root package name */
    private int f30511b = 5;

    /* renamed from: d, reason: collision with root package name */
    private u f30513d = null;

    /* renamed from: e, reason: collision with root package name */
    private z1 f30514e = null;

    /* renamed from: f, reason: collision with root package name */
    private t0 f30515f = null;

    e3(q2 q2Var, Context context) {
        this.f30510a = q2Var;
        this.f30512c = context;
    }

    private int a(p0 p0Var) {
        if (p0Var == null) {
            return 1;
        }
        if ("application".equals(p0Var.b())) {
            return (p0Var.f() == null || !((Boolean) p0Var.f().get("high_reporting_priority")).booleanValue()) ? 1 : 2;
        }
        Integer num = WebEngageConstant.f30865d.get(p0Var.d());
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    private ReportingStrategy b() {
        return WebEngage.get().getWebEngageConfig().getEventReportingStrategy();
    }

    private z1 d() {
        if (this.f30514e == null) {
            this.f30514e = new z1(this.f30512c);
        }
        return this.f30514e;
    }

    public t0 c() {
        if (this.f30515f == null) {
            this.f30515f = new t0(this.f30512c, d());
        }
        return this.f30515f;
    }

    public q2 e() {
        return this.f30510a;
    }

    private d3 a(int i10) {
        return (this.f30510a.a() || this.f30510a.b() <= this.f30511b) ? (i10 >= 2 || b() == ReportingStrategy.FORCE_SYNC) ? new s(a(), c()) : new t(a(), d(), this.f30512c) : a();
    }

    public d3 b(p0 p0Var) {
        return a(a(p0Var));
    }

    private u a() {
        if (this.f30513d == null) {
            this.f30513d = new u(this.f30512c);
        }
        return this.f30513d;
    }
}
