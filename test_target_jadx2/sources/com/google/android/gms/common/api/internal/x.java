package com.google.android.gms.common.api.internal;

import S6.a;
import T6.C0;
import T6.D0;
import T6.F;
import T6.InterfaceC1188s;
import T6.W;
import T6.Y;
import V6.AbstractC1287s;
import V6.C1271e;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2018j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class x implements Y, D0 {

    /* renamed from: f, reason: collision with root package name */
    private final Lock f23455f;

    /* renamed from: g, reason: collision with root package name */
    private final Condition f23456g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f23457h;

    /* renamed from: i, reason: collision with root package name */
    private final C2018j f23458i;

    /* renamed from: j, reason: collision with root package name */
    private final w f23459j;

    /* renamed from: k, reason: collision with root package name */
    final Map f23460k;

    /* renamed from: m, reason: collision with root package name */
    final C1271e f23462m;

    /* renamed from: n, reason: collision with root package name */
    final Map f23463n;

    /* renamed from: o, reason: collision with root package name */
    final a.AbstractC0172a f23464o;

    /* renamed from: p, reason: collision with root package name */
    private volatile F f23465p;

    /* renamed from: r, reason: collision with root package name */
    int f23467r;

    /* renamed from: s, reason: collision with root package name */
    final u f23468s;

    /* renamed from: t, reason: collision with root package name */
    final W f23469t;

    /* renamed from: l, reason: collision with root package name */
    final Map f23461l = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private C2010b f23466q = null;

    public x(Context context, u uVar, Lock lock, Looper looper, C2018j c2018j, Map map, C1271e c1271e, Map map2, a.AbstractC0172a abstractC0172a, ArrayList arrayList, W w10) {
        this.f23457h = context;
        this.f23455f = lock;
        this.f23458i = c2018j;
        this.f23460k = map;
        this.f23462m = c1271e;
        this.f23463n = map2;
        this.f23464o = abstractC0172a;
        this.f23468s = uVar;
        this.f23469t = w10;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0) arrayList.get(i10)).a(this);
        }
        this.f23459j = new w(this, looper);
        this.f23456g = lock.newCondition();
        this.f23465p = new q(this);
    }

    @Override // T6.Y
    public final void a() {
        this.f23465p.b();
    }

    @Override // T6.Y
    public final boolean b(InterfaceC1188s interfaceC1188s) {
        return false;
    }

    @Override // T6.Y
    public final AbstractC2006a c(AbstractC2006a abstractC2006a) {
        abstractC2006a.n();
        this.f23465p.f(abstractC2006a);
        return abstractC2006a;
    }

    @Override // T6.Y
    public final boolean d() {
        return this.f23465p instanceof e;
    }

    @Override // T6.Y
    public final AbstractC2006a e(AbstractC2006a abstractC2006a) {
        abstractC2006a.n();
        return this.f23465p.h(abstractC2006a);
    }

    @Override // T6.Y
    public final void f() {
    }

    @Override // T6.Y
    public final void g() {
        if (this.f23465p.g()) {
            this.f23461l.clear();
        }
    }

    @Override // T6.Y
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f23465p);
        for (S6.a aVar : this.f23463n.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((a.f) AbstractC1287s.m((a.f) this.f23460k.get(aVar.b()))).k(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    final void k() {
        this.f23455f.lock();
        try {
            this.f23468s.w();
            this.f23465p = new e(this);
            this.f23465p.d();
            this.f23456g.signalAll();
        } finally {
            this.f23455f.unlock();
        }
    }

    final void l() {
        this.f23455f.lock();
        try {
            this.f23465p = new p(this, this.f23462m, this.f23463n, this.f23458i, this.f23464o, this.f23455f, this.f23457h);
            this.f23465p.d();
            this.f23456g.signalAll();
        } finally {
            this.f23455f.unlock();
        }
    }

    final void m(C2010b c2010b) {
        this.f23455f.lock();
        try {
            this.f23466q = c2010b;
            this.f23465p = new q(this);
            this.f23465p.d();
            this.f23456g.signalAll();
        } finally {
            this.f23455f.unlock();
        }
    }

    final void n(v vVar) {
        w wVar = this.f23459j;
        wVar.sendMessage(wVar.obtainMessage(1, vVar));
    }

    final void o(RuntimeException runtimeException) {
        w wVar = this.f23459j;
        wVar.sendMessage(wVar.obtainMessage(2, runtimeException));
    }

    @Override // T6.InterfaceC1169e
    public final void onConnected(Bundle bundle) {
        this.f23455f.lock();
        try {
            this.f23465p.a(bundle);
        } finally {
            this.f23455f.unlock();
        }
    }

    @Override // T6.InterfaceC1169e
    public final void onConnectionSuspended(int i10) {
        this.f23455f.lock();
        try {
            this.f23465p.c(i10);
        } finally {
            this.f23455f.unlock();
        }
    }

    @Override // T6.D0
    public final void p(C2010b c2010b, S6.a aVar, boolean z10) {
        this.f23455f.lock();
        try {
            this.f23465p.e(c2010b, aVar, z10);
        } finally {
            this.f23455f.unlock();
        }
    }
}
