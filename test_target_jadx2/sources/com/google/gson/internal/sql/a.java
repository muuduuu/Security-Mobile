package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class a extends u {

    /* renamed from: b, reason: collision with root package name */
    static final v f28643b = new C0421a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f28644a;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0421a implements v {
        C0421a() {
        }

        @Override // com.google.gson.v
        public u a(e eVar, TypeToken typeToken) {
            C0421a c0421a = null;
            if (typeToken.getRawType() == Date.class) {
                return new a(c0421a);
            }
            return null;
        }
    }

    /* synthetic */ a(C0421a c0421a) {
        this();
    }

    @Override // com.google.gson.u
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(S8.a aVar) {
        Date date;
        if (aVar.N() == S8.b.NULL) {
            aVar.F();
            return null;
        }
        String I10 = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f28644a.getTimeZone();
            try {
                try {
                    date = new Date(this.f28644a.parse(I10).getTime());
                } catch (ParseException e10) {
                    throw new o("Failed parsing '" + I10 + "' as SQL Date; at path " + aVar.n(), e10);
                }
            } finally {
                this.f28644a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.u
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(S8.c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.r();
            return;
        }
        synchronized (this) {
            format = this.f28644a.format((java.util.Date) date);
        }
        cVar.i0(format);
    }

    private a() {
        this.f28644a = new SimpleDateFormat("MMM d, yyyy");
    }
}
