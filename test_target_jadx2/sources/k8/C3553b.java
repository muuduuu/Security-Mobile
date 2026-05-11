package k8;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import m8.InterfaceC3657a;
import org.conscrypt.BuildConfig;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3553b {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f36270g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    static final DateFormat f36271h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f36272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36274c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f36275d;

    /* renamed from: e, reason: collision with root package name */
    private final long f36276e;

    /* renamed from: f, reason: collision with root package name */
    private final long f36277f;

    public C3553b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f36272a = str;
        this.f36273b = str2;
        this.f36274c = str3;
        this.f36275d = date;
        this.f36276e = j10;
        this.f36277f = j11;
    }

    static C3553b a(InterfaceC3657a.C0559a c0559a) {
        String str = c0559a.f37405d;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return new C3553b(c0559a.f37403b, String.valueOf(c0559a.f37404c), str, new Date(c0559a.f37414m), c0559a.f37406e, c0559a.f37411j);
    }

    static C3553b b(Map map) {
        g(map);
        try {
            return new C3553b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : BuildConfig.FLAVOR, f36271h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new C3552a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new C3552a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f36270g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C3552a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f36272a;
    }

    long d() {
        return this.f36275d.getTime();
    }

    String e() {
        return this.f36273b;
    }

    InterfaceC3657a.C0559a f(String str) {
        InterfaceC3657a.C0559a c0559a = new InterfaceC3657a.C0559a();
        c0559a.f37402a = str;
        c0559a.f37414m = d();
        c0559a.f37403b = this.f36272a;
        c0559a.f37404c = this.f36273b;
        c0559a.f37405d = TextUtils.isEmpty(this.f36274c) ? null : this.f36274c;
        c0559a.f37406e = this.f36276e;
        c0559a.f37411j = this.f36277f;
        return c0559a;
    }
}
