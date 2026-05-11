package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public class h0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f28739a;

    public h0(N n10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f28739a = null;
    }

    public C2894z a() {
        return new C2894z(getMessage());
    }
}
