package Y6;

import V6.C1279j;
import android.util.Log;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f12022a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12023b;

    /* renamed from: c, reason: collision with root package name */
    private final C1279j f12024c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12025d;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f12023b = sb2;
        this.f12022a = str;
        this.f12024c = new C1279j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f12022a, i10)) {
            i10++;
        }
        this.f12025d = i10;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f12022a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f12022a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f12023b.concat(str);
    }

    public boolean d(int i10) {
        return this.f12025d <= i10;
    }

    public void e(String str, Object... objArr) {
        Log.w(this.f12022a, c(str, objArr));
    }
}
