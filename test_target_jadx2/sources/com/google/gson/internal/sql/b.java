package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class b extends u {

    /* renamed from: b, reason: collision with root package name */
    static final v f28645b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f28646a;

    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public u a(e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Time.class) {
                return new b(aVar);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.u
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(S8.a aVar) {
        Time time;
        if (aVar.N() == S8.b.NULL) {
            aVar.F();
            return null;
        }
        String I10 = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f28646a.getTimeZone();
            try {
                try {
                    time = new Time(this.f28646a.parse(I10).getTime());
                } catch (ParseException e10) {
                    throw new o("Failed parsing '" + I10 + "' as SQL Time; at path " + aVar.n(), e10);
                }
            } finally {
                this.f28646a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.u
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(S8.c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.r();
            return;
        }
        synchronized (this) {
            format = this.f28646a.format((Date) time);
        }
        cVar.i0(format);
    }

    private b() {
        this.f28646a = new SimpleDateFormat("hh:mm:ss a");
    }
}
