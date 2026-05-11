package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class w implements J8.s {

    /* renamed from: a, reason: collision with root package name */
    private final long f28439a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28440b;

    /* renamed from: c, reason: collision with root package name */
    private final J8.u f28441c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f28442a;

        /* renamed from: b, reason: collision with root package name */
        private int f28443b;

        /* renamed from: c, reason: collision with root package name */
        private J8.u f28444c;

        public w a() {
            return new w(this.f28442a, this.f28443b, this.f28444c);
        }

        b b(J8.u uVar) {
            this.f28444c = uVar;
            return this;
        }

        b c(int i10) {
            this.f28443b = i10;
            return this;
        }

        public b d(long j10) {
            this.f28442a = j10;
            return this;
        }

        private b() {
        }
    }

    static b d() {
        return new b();
    }

    @Override // J8.s
    public int a() {
        return this.f28440b;
    }

    @Override // J8.s
    public long b() {
        return this.f28439a;
    }

    @Override // J8.s
    public J8.u c() {
        return this.f28441c;
    }

    private w(long j10, int i10, J8.u uVar) {
        this.f28439a = j10;
        this.f28440b = i10;
        this.f28441c = uVar;
    }
}
