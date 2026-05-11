package O6;

import T6.C1190u;
import V6.AbstractC1287s;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final Y6.a f7089c = new Y6.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    private final String f7090a;

    /* renamed from: b, reason: collision with root package name */
    private final C1190u f7091b = new C1190u(null);

    public f(String str) {
        this.f7090a = AbstractC1287s.g(str);
    }

    public static S6.k a(String str) {
        if (str == null) {
            return S6.l.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f7091b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f23341h;
        try {
            String str = this.f7090a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            URL url = new URL(sb2.toString());
            int i10 = j7.n.f35887a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f23339f;
            } else {
                f7089c.b("Unable to revoke access!", new Object[0]);
            }
            Y6.a aVar = f7089c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            aVar.a(sb3.toString(), new Object[0]);
        } catch (IOException e10) {
            f7089c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f7089c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f7091b.k(status);
    }
}
