package com.webengage.sdk.android.utils.http;

import android.content.Context;
import com.webengage.sdk.android.m1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final List<m1> f30996c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    protected Context f30997a;

    /* renamed from: b, reason: collision with root package name */
    protected RequestObject f30998b;

    public a(Context context, RequestObject requestObject) {
        this.f30997a = context.getApplicationContext();
        this.f30998b = requestObject;
    }

    protected Response a() {
        try {
            switch (this.f30998b.getCachePolicy()) {
                case 1:
                    Response c10 = c();
                    return c10.isReadable() ? c10 : a(c10);
                case 2:
                    if (!f()) {
                        return c();
                    }
                    if (e()) {
                        return a((Response) null);
                    }
                    Response g10 = g();
                    if (!g10.isReadable()) {
                        return a(g10);
                    }
                    b();
                    return g10;
                case 3:
                    return c();
                case 4:
                    return a((Response) null);
                case 5:
                    if (!f()) {
                        return c();
                    }
                    if (e()) {
                        return a((Response) null);
                    }
                    Response g11 = g();
                    if (g11.isReadable()) {
                        b();
                        return g11;
                    }
                    if (g11.getErrorStream() == null && g11.getException() == null) {
                        if (!g11.g()) {
                            return a(g11);
                        }
                        b();
                        return g11;
                    }
                    b();
                    return g11;
                case 6:
                    return f() ? a((Response) null) : c();
                default:
                    return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    abstract Response a(Response response);

    protected void b() {
        Response d10 = d();
        if (d10 != null) {
            d10.a();
            d10.b();
        }
    }

    abstract Response c();

    abstract Response d();

    abstract boolean e();

    abstract boolean f();

    abstract Response g();

    public static void a(m1 m1Var) {
        List<m1> list = f30996c;
        synchronized (list) {
            list.add(m1Var);
        }
    }
}
