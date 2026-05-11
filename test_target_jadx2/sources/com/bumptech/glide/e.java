package com.bumptech.glide;

import D2.f;
import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final m f20233k = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3600b f20234a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b f20235b;

    /* renamed from: c, reason: collision with root package name */
    private final A2.b f20236c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f20237d;

    /* renamed from: e, reason: collision with root package name */
    private final List f20238e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f20239f;

    /* renamed from: g, reason: collision with root package name */
    private final k2.k f20240g;

    /* renamed from: h, reason: collision with root package name */
    private final f f20241h;

    /* renamed from: i, reason: collision with root package name */
    private final int f20242i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.h f20243j;

    public e(Context context, InterfaceC3600b interfaceC3600b, f.b bVar, A2.b bVar2, c.a aVar, Map map, List list, k2.k kVar, f fVar, int i10) {
        super(context.getApplicationContext());
        this.f20234a = interfaceC3600b;
        this.f20236c = bVar2;
        this.f20237d = aVar;
        this.f20238e = list;
        this.f20239f = map;
        this.f20240g = kVar;
        this.f20241h = fVar;
        this.f20242i = i10;
        this.f20235b = D2.f.a(bVar);
    }

    public InterfaceC3600b a() {
        return this.f20234a;
    }

    public List b() {
        return this.f20238e;
    }

    public synchronized com.bumptech.glide.request.h c() {
        try {
            if (this.f20243j == null) {
                this.f20243j = (com.bumptech.glide.request.h) this.f20237d.c().V();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20243j;
    }

    public m d(Class cls) {
        m mVar = (m) this.f20239f.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : this.f20239f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? f20233k : mVar;
    }

    public k2.k e() {
        return this.f20240g;
    }

    public f f() {
        return this.f20241h;
    }

    public int g() {
        return this.f20242i;
    }

    public i h() {
        return (i) this.f20235b.get();
    }
}
