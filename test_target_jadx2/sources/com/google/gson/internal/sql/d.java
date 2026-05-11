package com.google.gson.internal.sql;

import com.google.gson.internal.bind.c;
import com.google.gson.v;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f28649a;

    /* renamed from: b, reason: collision with root package name */
    public static final c.b f28650b;

    /* renamed from: c, reason: collision with root package name */
    public static final c.b f28651c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f28652d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f28653e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f28654f;

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends c.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f28649a = z10;
        if (z10) {
            f28650b = new a(Date.class);
            f28651c = new b(Timestamp.class);
            f28652d = com.google.gson.internal.sql.a.f28643b;
            f28653e = com.google.gson.internal.sql.b.f28645b;
            f28654f = c.f28647b;
            return;
        }
        f28650b = null;
        f28651c = null;
        f28652d = null;
        f28653e = null;
        f28654f = null;
    }
}
