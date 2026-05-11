package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23122a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23123b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f23124c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f23125d;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f23122a = aVar;
        f23123b = new a(aVar, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f23124c = new a(aVar, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f23125d = new a("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static a a() {
        return f23123b;
    }
}
