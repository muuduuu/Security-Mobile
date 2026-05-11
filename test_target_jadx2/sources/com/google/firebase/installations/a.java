package com.google.firebase.installations;

import com.google.firebase.installations.g;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f28010a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28011b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28012c;

    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f28013a;

        /* renamed from: b, reason: collision with root package name */
        private Long f28014b;

        /* renamed from: c, reason: collision with root package name */
        private Long f28015c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = this.f28013a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " token";
            }
            if (this.f28014b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f28015c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new a(this.f28013a, this.f28014b.longValue(), this.f28015c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f28013a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f28015c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f28014b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f28010a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f28012c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f28011b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f28010a.equals(gVar.b()) && this.f28011b == gVar.d() && this.f28012c == gVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f28010a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f28011b;
        long j11 = this.f28012c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f28010a + ", tokenExpirationTimestamp=" + this.f28011b + ", tokenCreationTimestamp=" + this.f28012c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f28010a = str;
        this.f28011b = j10;
        this.f28012c = j11;
    }
}
