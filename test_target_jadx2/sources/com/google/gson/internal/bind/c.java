package com.google.gson.internal.bind;

import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class c extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final v f28518c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f28519a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28520b;

    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public u a(com.google.gson.e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.f28521b, i10, i10, aVar);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f28521b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f28522a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f28522a = cls;
        }

        private v c(c cVar) {
            return l.a(this.f28522a, cVar);
        }

        public final v a(int i10, int i11) {
            return c(new c(this, i10, i11, null));
        }

        public final v b(String str) {
            return c(new c(this, str, (a) null));
        }

        protected abstract Date d(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date e(S8.a aVar) {
        String I10 = aVar.I();
        synchronized (this.f28520b) {
            try {
                for (DateFormat dateFormat : this.f28520b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(I10);
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return Q8.a.c(I10, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new o("Failed parsing '" + I10 + "' as Date; at path " + aVar.n(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.u
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(S8.a aVar) {
        if (aVar.N() == S8.b.NULL) {
            aVar.F();
            return null;
        }
        return this.f28519a.d(e(aVar));
    }

    @Override // com.google.gson.u
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(S8.c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.r();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f28520b.get(0);
        synchronized (this.f28520b) {
            format = dateFormat.format(date);
        }
        cVar.i0(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f28520b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f28520b = arrayList;
        Objects.requireNonNull(bVar);
        this.f28519a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f28520b = arrayList;
        Objects.requireNonNull(bVar);
        this.f28519a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (P8.e.c()) {
            arrayList.add(P8.k.c(i10, i11));
        }
    }
}
