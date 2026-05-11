package com.squareup.picasso;

import Td.B;
import Td.C1227c;
import Td.InterfaceC1229e;
import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1229e.a f29620a;

    /* renamed from: b, reason: collision with root package name */
    private final C1227c f29621b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29622c;

    public t(Context context) {
        this(G.e(context));
    }

    @Override // com.squareup.picasso.j
    public Td.F a(Td.D d10) {
        return this.f29620a.a(d10).j();
    }

    public t(File file) {
        this(file, G.a(file));
    }

    public t(File file, long j10) {
        this(new B.a().d(new C1227c(file, j10)).c());
        this.f29622c = false;
    }

    public t(Td.B b10) {
        this.f29622c = true;
        this.f29620a = b10;
        this.f29621b = b10.g();
    }
}
