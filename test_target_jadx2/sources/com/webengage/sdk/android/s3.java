package com.webengage.sdk.android;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public class s3 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private u0 f30806a = new u0(null, null);

    /* renamed from: b, reason: collision with root package name */
    private u0 f30807b = new u0("serif", Typeface.SERIF);

    /* renamed from: c, reason: collision with root package name */
    private u0 f30808c = new u0("sans-serif", Typeface.SANS_SERIF);

    /* renamed from: d, reason: collision with root package name */
    private final u0 f30809d = new u0("monospace", Typeface.MONOSPACE);

    @Override // com.webengage.sdk.android.x0
    public u0 a() {
        return this.f30809d;
    }

    @Override // com.webengage.sdk.android.x0
    public u0 b() {
        return this.f30806a;
    }

    public u0 c() {
        return this.f30808c;
    }

    public u0 d() {
        return this.f30807b;
    }

    @Override // com.webengage.sdk.android.x0
    public u0 a(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(",(\\s)*");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str2 = split[i10];
                if (str2.startsWith("\"") && str2.endsWith("\"")) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                if (str2.startsWith("'") && str2.endsWith("'")) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                u0 b10 = b(str2);
                if (b10 != null) {
                    return b10;
                }
            }
        }
        return b();
    }

    protected u0 b(String str) {
        if (str.equalsIgnoreCase("serif")) {
            return d();
        }
        if (str.equalsIgnoreCase("sans-serif")) {
            return c();
        }
        if (str.equalsIgnoreCase("monospace")) {
            return this.f30809d;
        }
        return null;
    }
}
