package C5;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f extends ConcurrentHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final f f909b = new f();

    /* renamed from: a, reason: collision with root package name */
    private final Object f910a;

    private f() {
        super(180, 0.8f, 4);
        this.f910a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f910a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
