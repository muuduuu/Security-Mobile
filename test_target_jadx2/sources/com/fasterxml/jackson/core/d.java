package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.h;
import java.io.Serializable;
import java.io.Writer;
import y5.C5175b;
import y5.C5176c;
import z5.C5258d;

/* loaded from: classes2.dex */
public abstract class d extends p implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    protected static final int f23126j = a.collectDefaults();

    /* renamed from: k, reason: collision with root package name */
    protected static final int f23127k = h.a.collectDefaults();

    /* renamed from: l, reason: collision with root package name */
    protected static final int f23128l = f.b.collectDefaults();

    /* renamed from: m, reason: collision with root package name */
    public static final n f23129m = C5.d.f899h;

    /* renamed from: f, reason: collision with root package name */
    protected l f23135f;

    /* renamed from: h, reason: collision with root package name */
    protected int f23137h;

    /* renamed from: a, reason: collision with root package name */
    protected final transient A5.b f23130a = A5.b.a();

    /* renamed from: b, reason: collision with root package name */
    protected final transient A5.a f23131b = A5.a.c();

    /* renamed from: c, reason: collision with root package name */
    protected int f23132c = f23126j;

    /* renamed from: d, reason: collision with root package name */
    protected int f23133d = f23127k;

    /* renamed from: e, reason: collision with root package name */
    protected int f23134e = f23128l;

    /* renamed from: g, reason: collision with root package name */
    protected n f23136g = f23129m;

    /* renamed from: i, reason: collision with root package name */
    protected final char f23138i = '\"';

    public enum a implements C5.g {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        a(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            int i10 = 0;
            for (a aVar : values()) {
                if (aVar.enabledByDefault()) {
                    i10 |= aVar.getMask();
                }
            }
            return i10;
        }

        @Override // C5.g
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (i10 & getMask()) != 0;
        }

        @Override // C5.g
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public d(l lVar) {
        this.f23135f = lVar;
    }

    protected C5175b a(Object obj) {
        return C5175b.a(!f(), obj);
    }

    protected C5176c b(C5175b c5175b, boolean z10) {
        if (c5175b == null) {
            c5175b = C5175b.c();
        }
        return new C5176c(e(), c5175b, z10);
    }

    protected f c(Writer writer, C5176c c5176c) {
        C5258d c5258d = new C5258d(c5176c, this.f23134e, this.f23135f, writer, this.f23138i);
        int i10 = this.f23137h;
        if (i10 > 0) {
            c5258d.r(i10);
        }
        n nVar = this.f23136g;
        if (nVar != f23129m) {
            c5258d.s2(nVar);
        }
        return c5258d;
    }

    public C5.a e() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this.f23132c) ? C5.b.a() : new C5.a();
    }

    public boolean f() {
        return false;
    }

    public f g(Writer writer) {
        C5176c b10 = b(a(writer), false);
        return c(d(writer, b10), b10);
    }

    public abstract l h();

    public boolean i() {
        return false;
    }

    public d j(l lVar) {
        this.f23135f = lVar;
        return this;
    }

    protected final Writer d(Writer writer, C5176c c5176c) {
        return writer;
    }
}
