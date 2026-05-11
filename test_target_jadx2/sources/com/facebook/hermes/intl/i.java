package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public class i implements com.facebook.hermes.intl.b {

    /* renamed from: a, reason: collision with root package name */
    private DateFormat f20677a = null;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20678a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20679b;

        static {
            int[] iArr = new int[b.k.values().length];
            f20679b = iArr;
            try {
                iArr[b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20679b[b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20679b[b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20679b[b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20679b[b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.EnumC0365b.values().length];
            f20678a = iArr2;
            try {
                iArr2[b.EnumC0365b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20678a[b.EnumC0365b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20678a[b.EnumC0365b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20678a[b.EnumC0365b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20678a[b.EnumC0365b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '\'') {
                    z10 = !z10;
                } else if (!z10 && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb2.append(str.charAt(i10));
                }
            }
            return sb2.toString();
        }
    }

    i() {
    }

    private static String i(Q3.b bVar, b.EnumC0365b enumC0365b, b.k kVar) {
        return enumC0365b == b.EnumC0365b.UNDEFINED ? ((SimpleDateFormat) DateFormat.getTimeInstance(m(kVar), (ULocale) bVar.h())).toLocalizedPattern() : kVar == b.k.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(l(enumC0365b), (ULocale) bVar.h())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(l(enumC0365b), m(kVar), (ULocale) bVar.h())).toLocalizedPattern();
    }

    private static String j(Q3.b bVar, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, b.EnumC0365b enumC0365b, b.k kVar, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (enumC0365b == b.EnumC0365b.UNDEFINED && kVar == b.k.UNDEFINED) {
            sb2.append(mVar.getSkeleonSymbol());
            sb2.append(dVar.getSkeleonSymbol());
            sb2.append(nVar.getSkeleonSymbol());
            sb2.append(iVar.getSkeleonSymbol());
            sb2.append(cVar.getSkeleonSymbol());
            if (gVar == b.g.H11 || gVar == b.g.H12) {
                sb2.append(fVar.getSkeleonSymbol12());
            } else {
                sb2.append(fVar.getSkeleonSymbol24());
            }
            sb2.append(hVar.getSkeleonSymbol());
            sb2.append(jVar.getSkeleonSymbol());
            sb2.append(lVar.getSkeleonSymbol());
        } else {
            sb2.append(i(bVar, enumC0365b, kVar));
            HashMap b10 = bVar.b();
            if (b10.containsKey("hc")) {
                String str = (String) b10.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == b.g.H11 || gVar == b.g.H12) {
                k(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == b.g.H23 || gVar == b.g.H24) {
                k(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!Q3.d.n(obj) && !Q3.d.j(obj)) {
                if (Q3.d.e(obj)) {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb2.toString();
    }

    private static void k(StringBuilder sb2, char[] cArr, char c10) {
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (sb2.charAt(i10) == cArr[i11]) {
                        sb2.setCharAt(i10, c10);
                        break;
                    }
                    i11++;
                }
            }
        }
    }

    static int l(b.EnumC0365b enumC0365b) {
        int i10 = a.f20678a[enumC0365b.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new Q3.e("Invalid DateStyle: " + enumC0365b.toString());
    }

    static int m(b.k kVar) {
        int i10 = a.f20679b[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new Q3.e("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d10) {
        return this.f20677a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(Q3.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String c(double d10) {
        return this.f20677a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String d(Q3.b bVar) {
        return Calendar.getInstance((ULocale) bVar.h()).getTimeZone().getID();
    }

    @Override // com.facebook.hermes.intl.b
    public void e(Q3.b bVar, String str, String str2, b.e eVar, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, Object obj, b.EnumC0365b enumC0365b, b.k kVar, Object obj2) {
        Calendar calendar;
        String j10 = j(bVar, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0365b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Q3.d.h(str));
            Q3.b e10 = bVar.e();
            e10.g("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) e10.h());
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(Q3.d.h(str2)) == null) {
                    throw new Q3.e("Invalid numbering system: " + str2);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Q3.d.h(str2));
                bVar.g("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new Q3.e("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f20677a = DateFormat.getPatternInstance(calendar, j10, (ULocale) bVar.h());
        } else {
            this.f20677a = DateFormat.getPatternInstance(j10, (ULocale) bVar.h());
        }
        if (Q3.d.n(obj) || Q3.d.j(obj)) {
            return;
        }
        this.f20677a.setTimeZone(TimeZone.getTimeZone(Q3.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String f(Q3.b bVar) {
        return Q3.h.d(DateFormat.getDateInstance(3, (ULocale) bVar.h()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public String g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.b
    public b.g h(Q3.b bVar) {
        try {
            String a10 = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.h())).toPattern());
            return a10.contains(String.valueOf('h')) ? b.g.H12 : a10.contains(String.valueOf('K')) ? b.g.H11 : a10.contains(String.valueOf('H')) ? b.g.H23 : b.g.H24;
        } catch (ClassCastException unused) {
            return b.g.H24;
        }
    }
}
