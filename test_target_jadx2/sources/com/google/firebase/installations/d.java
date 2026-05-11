package com.google.firebase.installations;

import j8.AbstractC3516j;

/* loaded from: classes2.dex */
public class d extends AbstractC3516j {

    /* renamed from: a, reason: collision with root package name */
    private final a f28035a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f28035a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f28035a = aVar;
    }
}
