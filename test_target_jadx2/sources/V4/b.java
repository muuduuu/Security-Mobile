package V4;

import V4.e;
import android.net.Uri;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.Map;
import org.json.JSONObject;
import pe.C3880h;

/* loaded from: classes.dex */
public final class b implements e.c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f10827c = "b";

    /* renamed from: a, reason: collision with root package name */
    private e f10828a;

    /* renamed from: b, reason: collision with root package name */
    private Map f10829b;

    private class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private Object f10830a;

        public a(Object obj) {
            this.f10830a = obj;
        }

        @Override // V4.h
        public void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f10830a);
                jSONObject.put("result", obj);
                b.this.f10828a.n(jSONObject.toString());
            } catch (Exception e10) {
                AbstractC1721a.n(b.f10827c, "Responding failed", e10);
            }
        }

        @Override // V4.h
        public void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f10830a);
                jSONObject.put(AppConstants.VIDEO_RECORDING_ERROR, obj);
                b.this.f10828a.n(jSONObject.toString());
            } catch (Exception e10) {
                AbstractC1721a.n(b.f10827c, "Responding with error failed", e10);
            }
        }
    }

    public b(String str, d dVar, Map map, e.b bVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(dVar.b()).appendPath("message").appendQueryParameter("device", S4.a.d()).appendQueryParameter("app", dVar.c()).appendQueryParameter("clientid", str);
        this.f10828a = new e(builder.build().toString(), this, bVar);
        this.f10829b = map;
    }

    private void d(Object obj, String str) {
        if (obj != null) {
            new a(obj).b(str);
        }
        AbstractC1721a.m(f10827c, "Handling the message failed with reason: " + str);
    }

    @Override // V4.e.c
    public void a(C3880h c3880h) {
        AbstractC1721a.J(f10827c, "Websocket received message with payload of unexpected type binary");
    }

    public void e() {
        this.f10828a.i();
    }

    public void f() {
        this.f10828a.k();
    }

    @Override // V4.e.c
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("version");
            String optString = jSONObject.optString("method");
            Object opt = jSONObject.opt("id");
            Object opt2 = jSONObject.opt("params");
            if (optInt != 2) {
                AbstractC1721a.m(f10827c, "Message with incompatible or missing version of protocol received: " + optInt);
                return;
            }
            if (optString == null) {
                d(opt, "No method provided");
                return;
            }
            f fVar = (f) this.f10829b.get(optString);
            if (fVar == null) {
                d(opt, "No request handler for method: " + optString);
                return;
            }
            if (opt == null) {
                fVar.b(opt2);
            } else {
                fVar.a(opt2, new a(opt));
            }
        } catch (Exception e10) {
            AbstractC1721a.n(f10827c, "Handling the message failed", e10);
        }
    }
}
