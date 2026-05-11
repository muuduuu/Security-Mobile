package com.google.gson.internal.bind;

import com.google.gson.n;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends S8.c {

    /* renamed from: r, reason: collision with root package name */
    private static final Writer f28527r = new a();

    /* renamed from: s, reason: collision with root package name */
    private static final n f28528s = new n("closed");

    /* renamed from: o, reason: collision with root package name */
    private final List f28529o;

    /* renamed from: p, reason: collision with root package name */
    private String f28530p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.gson.h f28531q;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public e() {
        super(f28527r);
        this.f28529o = new ArrayList();
        this.f28531q = com.google.gson.j.f28655a;
    }

    private com.google.gson.h A0() {
        return (com.google.gson.h) this.f28529o.get(r0.size() - 1);
    }

    private void O0(com.google.gson.h hVar) {
        if (this.f28530p != null) {
            if (!hVar.r() || i()) {
                ((com.google.gson.k) A0()).v(this.f28530p, hVar);
            }
            this.f28530p = null;
            return;
        }
        if (this.f28529o.isEmpty()) {
            this.f28531q = hVar;
            return;
        }
        com.google.gson.h A02 = A0();
        if (!(A02 instanceof com.google.gson.g)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.g) A02).v(hVar);
    }

    @Override // S8.c
    public S8.c I(double d10) {
        if (n() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            O0(new n(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // S8.c
    public S8.c K(long j10) {
        O0(new n(Long.valueOf(j10)));
        return this;
    }

    @Override // S8.c
    public S8.c N(Boolean bool) {
        if (bool == null) {
            return r();
        }
        O0(new n(bool));
        return this;
    }

    @Override // S8.c
    public S8.c Q(Number number) {
        if (number == null) {
            return r();
        }
        if (!n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        O0(new n(number));
        return this;
    }

    @Override // S8.c
    public S8.c c() {
        com.google.gson.g gVar = new com.google.gson.g();
        O0(gVar);
        this.f28529o.add(gVar);
        return this;
    }

    @Override // S8.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f28529o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f28529o.add(f28528s);
    }

    @Override // S8.c
    public S8.c d() {
        com.google.gson.k kVar = new com.google.gson.k();
        O0(kVar);
        this.f28529o.add(kVar);
        return this;
    }

    @Override // S8.c
    public S8.c f() {
        if (this.f28529o.isEmpty() || this.f28530p != null) {
            throw new IllegalStateException();
        }
        if (!(A0() instanceof com.google.gson.g)) {
            throw new IllegalStateException();
        }
        this.f28529o.remove(r0.size() - 1);
        return this;
    }

    @Override // S8.c, java.io.Flushable
    public void flush() {
    }

    @Override // S8.c
    public S8.c g() {
        if (this.f28529o.isEmpty() || this.f28530p != null) {
            throw new IllegalStateException();
        }
        if (!(A0() instanceof com.google.gson.k)) {
            throw new IllegalStateException();
        }
        this.f28529o.remove(r0.size() - 1);
        return this;
    }

    @Override // S8.c
    public S8.c i0(String str) {
        if (str == null) {
            return r();
        }
        O0(new n(str));
        return this;
    }

    @Override // S8.c
    public S8.c o0(boolean z10) {
        O0(new n(Boolean.valueOf(z10)));
        return this;
    }

    @Override // S8.c
    public S8.c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f28529o.isEmpty() || this.f28530p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(A0() instanceof com.google.gson.k)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f28530p = str;
        return this;
    }

    @Override // S8.c
    public S8.c r() {
        O0(com.google.gson.j.f28655a);
        return this;
    }

    public com.google.gson.h z0() {
        if (this.f28529o.isEmpty()) {
            return this.f28531q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f28529o);
    }
}
