package y8;

import M0.f;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.measurement.internal.f7;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class v {

    /* renamed from: b, reason: collision with root package name */
    private static final f.a f45373b = M0.i.f("fire-global");

    /* renamed from: c, reason: collision with root package name */
    private static final f.a f45374c = M0.i.f("fire-count");

    /* renamed from: d, reason: collision with root package name */
    private static final f.a f45375d = M0.i.g("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    private final q8.c f45376a;

    public v(Context context, String str) {
        this.f45376a = new q8.c(context, "FirebaseHeartBeat" + str);
    }

    private synchronized long e(M0.c cVar) {
        long j10;
        try {
            long longValue = ((Long) q8.d.a(cVar, f45374c, 0L)).longValue();
            String str = BuildConfig.FLAVOR;
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = ((f.a) entry.getKey()).a();
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            cVar.i(M0.i.h(str), hashSet2);
            j10 = longValue - 1;
            cVar.i(f45374c, Long.valueOf(j10));
        } catch (Throwable th) {
            throw th;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
        }
        instant = new Date(j10).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    private synchronized f.a i(M0.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return M0.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit k(M0.c cVar) {
        Set a10;
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String h10 = h(System.currentTimeMillis());
                if (set.contains(h10)) {
                    a10 = f7.a(new Object[]{h10});
                    cVar.i(aVar, a10);
                    j10++;
                } else {
                    cVar.h(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f45374c);
            return null;
        }
        cVar.i(f45374c, Long.valueOf(j10));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit l(String str, M0.c cVar) {
        cVar.i(f45375d, str);
        p(cVar, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit m(String str, String str2, f.a aVar, M0.c cVar) {
        f.a aVar2 = f45375d;
        if (((String) q8.d.a(cVar, aVar2, BuildConfig.FLAVOR)).equals(str)) {
            f.a i10 = i(cVar, str);
            if (i10 == null || i10.a().equals(str2)) {
                return null;
            }
            u(cVar, aVar, str);
            return null;
        }
        f.a aVar3 = f45374c;
        long longValue = ((Long) q8.d.a(cVar, aVar3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) q8.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(longValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit n(long j10, M0.c cVar) {
        cVar.i(f45373b, Long.valueOf(j10));
        return null;
    }

    private synchronized void p(M0.c cVar, String str) {
        try {
            f.a i10 = i(cVar, str);
            if (i10 == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) q8.d.a(cVar, i10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(i10);
            } else {
                cVar.i(i10, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void u(M0.c cVar, f.a aVar, String str) {
        p(cVar, str);
        HashSet hashSet = new HashSet((Collection) q8.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void f() {
        this.f45376a.g(new Function1() { // from class: y8.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit k10;
                k10 = v.this.k((M0.c) obj);
                return k10;
            }
        });
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String h10 = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f45376a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(h10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(w.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            t(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void o() {
        final String h10 = h(System.currentTimeMillis());
        this.f45376a.g(new Function1() { // from class: y8.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = v.this.l(h10, (M0.c) obj);
                return l10;
            }
        });
    }

    synchronized boolean q(long j10) {
        return r(f45373b, j10);
    }

    synchronized boolean r(f.a aVar, long j10) {
        if (j(((Long) this.f45376a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f45376a.k(aVar, Long.valueOf(j10));
        return true;
    }

    synchronized void s(long j10, final String str) {
        final String h10 = h(j10);
        final f.a h11 = M0.i.h(str);
        this.f45376a.g(new Function1() { // from class: y8.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit m10;
                m10 = v.this.m(h10, str, h11, (M0.c) obj);
                return m10;
            }
        });
    }

    synchronized void t(final long j10) {
        this.f45376a.g(new Function1() { // from class: y8.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit n10;
                n10 = v.n(j10, (M0.c) obj);
                return n10;
            }
        });
    }
}
