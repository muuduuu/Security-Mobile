package com.google.firebase.messaging;

import V6.AbstractC1286q;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class g0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f28185d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f28186a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28187b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28188c;

    private g0(String str, String str2) {
        this.f28186a = d(str2, str);
        this.f28187b = str;
        this.f28188c = str + "!" + str2;
    }

    static g0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new g0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f28185d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static g0 f(String str) {
        return new g0("S", str);
    }

    public static g0 g(String str) {
        return new g0("U", str);
    }

    public String b() {
        return this.f28187b;
    }

    public String c() {
        return this.f28186a;
    }

    public String e() {
        return this.f28188c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f28186a.equals(g0Var.f28186a) && this.f28187b.equals(g0Var.f28187b);
    }

    public int hashCode() {
        return AbstractC1286q.b(this.f28187b, this.f28186a);
    }
}
