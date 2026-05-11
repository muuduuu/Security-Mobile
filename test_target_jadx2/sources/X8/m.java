package X8;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import o8.C3766c;
import o8.InterfaceC3767d;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final C3766c f11822b = C3766c.c(m.class).b(o8.q.j(C1303i.class)).b(o8.q.j(Context.class)).f(new o8.g() { // from class: X8.E
        @Override // o8.g
        public final Object a(InterfaceC3767d interfaceC3767d) {
            return new m((Context) interfaceC3767d.a(Context.class));
        }
    }).d();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f11823a;

    public m(Context context) {
        this.f11823a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    protected final SharedPreferences b() {
        return this.f11823a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
