package R5;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class D {

    public static class a extends G {
    }

    public static class b extends G {
    }

    public static class c extends G {
    }

    public static Collection a() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new L(URL.class));
        hashMap.put(URI.class, new L(URI.class));
        hashMap.put(Currency.class, new L(Currency.class));
        hashMap.put(UUID.class, new O());
        hashMap.put(Pattern.class, new L(Pattern.class));
        hashMap.put(Locale.class, new L(Locale.class));
        hashMap.put(AtomicBoolean.class, a.class);
        hashMap.put(AtomicInteger.class, b.class);
        hashMap.put(AtomicLong.class, c.class);
        hashMap.put(File.class, AbstractC1142o.class);
        hashMap.put(Class.class, AbstractC1136i.class);
        u uVar = u.f8534c;
        hashMap.put(Void.class, uVar);
        hashMap.put(Void.TYPE, uVar);
        return hashMap.entrySet();
    }
}
