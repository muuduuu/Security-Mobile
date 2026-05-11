package ze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class G {

    /* renamed from: e, reason: collision with root package name */
    public static String f45903e = "${";

    /* renamed from: f, reason: collision with root package name */
    public static String f45904f = "}";

    /* renamed from: a, reason: collision with root package name */
    private String f45905a;

    /* renamed from: c, reason: collision with root package name */
    private Map f45907c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private List f45908d = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f45906b = true;

    public Map a(Map map) {
        boolean f10 = f();
        boolean e10 = e();
        if (!e10 && f10) {
            return map;
        }
        LinkedHashMap linkedHashMap = f10 ? new LinkedHashMap(map) : new LinkedHashMap();
        if (e10) {
            for (Map.Entry entry : c().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    linkedHashMap.remove(str);
                } else {
                    linkedHashMap.put(str, b(str2, map));
                }
            }
            Iterator it = this.f45908d.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                Iterator it2 = map.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    throw null;
                }
            }
        }
        return linkedHashMap;
    }

    public String b(String str, Map map) {
        if (str == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int indexOf = str.indexOf(f45903e);
        int i10 = -1;
        while (indexOf >= 0 && indexOf < str.length()) {
            stringBuffer.append(str.substring(i10 + 1, indexOf));
            i10 = str.indexOf(f45904f, indexOf);
            if (i10 > indexOf) {
                String substring = str.substring(f45903e.length() + indexOf, i10);
                String str2 = BuildConfig.FLAVOR;
                String str3 = map != null ? (String) map.get(substring.toLowerCase()) : BuildConfig.FLAVOR;
                if (str3 != null) {
                    str2 = str3.toString();
                }
                stringBuffer.append(str2);
            }
            indexOf = str.indexOf(f45903e, Math.max(f45904f.length() + i10, indexOf + 1));
        }
        stringBuffer.append(str.substring(i10 + 1));
        return stringBuffer.toString();
    }

    Map c() {
        return this.f45907c;
    }

    String d() {
        return this.f45905a;
    }

    boolean e() {
        return (this.f45907c == null && this.f45908d == null) ? false : true;
    }

    boolean f() {
        return this.f45906b;
    }
}
