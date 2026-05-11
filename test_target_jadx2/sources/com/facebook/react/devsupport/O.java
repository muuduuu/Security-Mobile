package com.facebook.react.devsupport;

import Td.B;
import Td.D;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Inspector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class O implements N {

    /* renamed from: a, reason: collision with root package name */
    private final b f21528a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21529b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final String f21530c;

    class a implements Inspector.RemoteConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21531a;

        a(String str) {
            this.f21531a = str;
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onDisconnect() {
            try {
                O.this.f21529b.remove(this.f21531a);
                O o10 = O.this;
                o10.l("disconnect", o10.k(this.f21531a));
            } catch (JSONException e10) {
                AbstractC1721a.K("InspectorPackagerConnection", "Couldn't send event to packager", e10);
            }
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onMessage(String str) {
            try {
                O.this.m(this.f21531a, str);
            } catch (JSONException e10) {
                AbstractC1721a.K("InspectorPackagerConnection", "Couldn't send event to packager", e10);
            }
        }
    }

    private class b extends Td.K {

        /* renamed from: a, reason: collision with root package name */
        private final String f21533a;

        /* renamed from: b, reason: collision with root package name */
        private Td.B f21534b;

        /* renamed from: c, reason: collision with root package name */
        private Td.J f21535c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f21536d = new Handler(Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        private boolean f21537e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f21538f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f21537e) {
                    return;
                }
                b.this.k();
            }
        }

        /* renamed from: com.facebook.react.devsupport.O$b$b, reason: collision with other inner class name */
        class AsyncTaskC0376b extends AsyncTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f21541a;

            AsyncTaskC0376b(JSONObject jSONObject) {
                this.f21541a = jSONObject;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Td.J... jArr) {
                if (jArr != null && jArr.length != 0) {
                    try {
                        jArr[0].a(this.f21541a.toString());
                    } catch (Exception e10) {
                        AbstractC1721a.K("InspectorPackagerConnection", "Couldn't send event to packager", e10);
                    }
                }
                return null;
            }
        }

        public b(String str) {
            this.f21533a = str;
        }

        private void h(String str, Throwable th) {
            AbstractC1721a.n("InspectorPackagerConnection", "Error occurred, shutting down websocket connection: " + str, th);
            O.this.e();
            j();
        }

        private void j() {
            Td.J j10 = this.f21535c;
            if (j10 != null) {
                try {
                    j10.f(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f21535c = null;
            }
        }

        private void l() {
            if (this.f21537e) {
                throw new IllegalStateException("Can't reconnect closed client");
            }
            if (!this.f21538f) {
                AbstractC1721a.J("InspectorPackagerConnection", "Couldn't connect to packager, will silently retry");
                this.f21538f = true;
            }
            this.f21536d.postDelayed(new a(), 2000L);
        }

        @Override // Td.K
        public void a(Td.J j10, int i10, String str) {
            this.f21535c = null;
            O.this.e();
            if (this.f21537e) {
                return;
            }
            l();
        }

        @Override // Td.K
        public void c(Td.J j10, Throwable th, Td.F f10) {
            if (this.f21535c != null) {
                h("Websocket exception", th);
            }
            if (this.f21537e) {
                return;
            }
            l();
        }

        @Override // Td.K
        public void d(Td.J j10, String str) {
            try {
                O.this.i(new JSONObject(str));
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // Td.K
        public void f(Td.J j10, Td.F f10) {
            this.f21535c = j10;
        }

        public void i() {
            this.f21537e = true;
            Td.J j10 = this.f21535c;
            if (j10 != null) {
                try {
                    j10.f(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f21535c = null;
            }
        }

        public void k() {
            if (this.f21537e) {
                throw new IllegalStateException("Can't connect closed client");
            }
            if (this.f21534b == null) {
                B.a aVar = new B.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f21534b = aVar.g(10L, timeUnit).i0(10L, timeUnit).d0(0L, TimeUnit.MINUTES).c();
            }
            this.f21534b.B(new D.a().x(this.f21533a).b(), this);
        }

        public void m(JSONObject jSONObject) {
            new AsyncTaskC0376b(jSONObject).execute(this.f21535c);
        }
    }

    public O(String str, String str2) {
        this.f21528a = new b(str);
        this.f21530c = str2;
    }

    private JSONArray f() {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        for (Inspector.Page page : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(page.getId()));
            jSONObject.put("title", page.getTitle());
            jSONObject.put("app", this.f21530c);
            jSONObject.put("vm", page.getVM());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void g(JSONObject jSONObject) {
        String string = jSONObject.getString("pageId");
        if (((Inspector.LocalConnection) this.f21529b.remove(string)) != null) {
            throw new IllegalStateException("Already connected: " + string);
        }
        try {
            this.f21529b.put(string, Inspector.connect(Integer.parseInt(string), new a(string)));
        } catch (Exception e10) {
            AbstractC1721a.K("InspectorPackagerConnection", "Failed to open page: " + string, e10);
            l("disconnect", k(string));
        }
    }

    private void h(JSONObject jSONObject) {
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f21529b.remove(jSONObject.getString("pageId"));
        if (localConnection == null) {
            return;
        }
        localConnection.disconnect();
    }

    private void j(JSONObject jSONObject) {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = (Inspector.LocalConnection) this.f21529b.get(string);
        if (localConnection != null) {
            localConnection.sendMessage(string2);
            return;
        }
        AbstractC1721a.J("InspectorPackagerConnection", "PageID " + string + " is disconnected. Dropping event: " + string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject k(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Keys.EVENT, str);
        jSONObject.put("payload", obj);
        this.f21528a.m(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        l("wrappedEvent", jSONObject);
    }

    @Override // com.facebook.react.devsupport.N
    public void closeQuietly() {
        this.f21528a.i();
    }

    @Override // com.facebook.react.devsupport.N
    public void connect() {
        this.f21528a.k();
    }

    void e() {
        Iterator it = this.f21529b.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).disconnect();
        }
        this.f21529b.clear();
    }

    void i(JSONObject jSONObject) {
        String string;
        string = jSONObject.getString(Keys.EVENT);
        string.hashCode();
        switch (string) {
            case "disconnect":
                h(jSONObject.getJSONObject("payload"));
                return;
            case "connect":
                g(jSONObject.getJSONObject("payload"));
                return;
            case "wrappedEvent":
                j(jSONObject.getJSONObject("payload"));
                return;
            case "getPages":
                l("getPages", f());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    @Override // com.facebook.react.devsupport.N
    public void sendEventToAllConnections(String str) {
        Iterator it = this.f21529b.entrySet().iterator();
        while (it.hasNext()) {
            ((Inspector.LocalConnection) ((Map.Entry) it.next()).getValue()).sendMessage(str);
        }
    }
}
