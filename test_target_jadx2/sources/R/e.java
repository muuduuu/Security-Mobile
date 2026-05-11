package R;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8360a = d(1, 0, 0, BuildConfig.FLAVOR);

    /* renamed from: b, reason: collision with root package name */
    public static final e f8361b = d(1, 1, 0, BuildConfig.FLAVOR);

    /* renamed from: c, reason: collision with root package name */
    public static final e f8362c = d(1, 2, 0, BuildConfig.FLAVOR);

    /* renamed from: d, reason: collision with root package name */
    public static final e f8363d = d(1, 3, 0, BuildConfig.FLAVOR);

    /* renamed from: e, reason: collision with root package name */
    public static final e f8364e = d(1, 4, 0, BuildConfig.FLAVOR);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f8365f = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    e() {
    }

    public static e d(int i10, int i11, int i12, String str) {
        return new a(i10, i11, i12, str);
    }

    private static BigInteger e(e eVar) {
        return BigInteger.valueOf(eVar.o()).shiftLeft(32).or(BigInteger.valueOf(eVar.p())).shiftLeft(32).or(BigInteger.valueOf(eVar.q()));
    }

    public static e r(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f8365f.matcher(str);
        if (matcher.matches()) {
            return d(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : BuildConfig.FLAVOR);
        }
        return null;
    }

    public int b(int i10, int i11) {
        return o() == i10 ? Integer.compare(p(), i11) : Integer.compare(o(), i10);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return e(this).compareTo(e(eVar));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Integer.valueOf(o()).equals(Integer.valueOf(eVar.o())) && Integer.valueOf(p()).equals(Integer.valueOf(eVar.p())) && Integer.valueOf(q()).equals(Integer.valueOf(eVar.q()));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(o()), Integer.valueOf(p()), Integer.valueOf(q()));
    }

    abstract String n();

    public abstract int o();

    abstract int p();

    abstract int q();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(o() + "." + p() + "." + q());
        if (!TextUtils.isEmpty(n())) {
            sb2.append("-" + n());
        }
        return sb2.toString();
    }
}
