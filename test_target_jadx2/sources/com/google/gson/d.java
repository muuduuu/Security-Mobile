package com.google.gson;

import java.util.Objects;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f28450d = new d(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f28451e = new d("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f28452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28453b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28454c;

    private d(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f28452a = str;
        this.f28453b = str2;
        this.f28454c = z10;
    }

    public String a() {
        return this.f28453b;
    }

    public String b() {
        return this.f28452a;
    }

    public boolean c() {
        return this.f28454c;
    }
}
