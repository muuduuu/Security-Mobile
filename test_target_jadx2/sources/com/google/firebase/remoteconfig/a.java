package com.google.firebase.remoteconfig;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final Map f28265a;

    /* renamed from: com.google.firebase.remoteconfig.a$a, reason: collision with other inner class name */
    public static class C0416a {

        /* renamed from: a, reason: collision with root package name */
        private Map f28266a = new HashMap();

        public a b() {
            return new a(this);
        }

        public C0416a c(String str, double d10) {
            this.f28266a.put(str, Double.toString(d10));
            return this;
        }

        public C0416a d(String str, long j10) {
            this.f28266a.put(str, Long.toString(j10));
            return this;
        }

        public C0416a e(String str, String str2) {
            this.f28266a.put(str, str2);
            return this;
        }
    }

    a(C0416a c0416a) {
        this.f28265a = c0416a.f28266a;
    }
}
