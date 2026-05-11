package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class q3 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30780c;

    /* renamed from: d, reason: collision with root package name */
    private String f30781d;

    /* renamed from: e, reason: collision with root package name */
    private Object f30782e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f30783f;

    protected q3(Context context) {
        super(context);
        this.f30780c = null;
        this.f30781d = null;
        this.f30782e = null;
        this.f30783f = new ArrayList<>();
        this.f30780c = context.getApplicationContext();
    }

    private String a(ArrayList<p0> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        try {
            return DataType.convert(arrayList, DataType.STRING, true).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public Object d(Object obj) {
        if (obj != null) {
            String a10 = ((p0) ((ArrayList) this.f30782e).get(0)).a();
            if (q2.d()) {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "application/transit+json");
                RequestObject build = new RequestObject.Builder(this.f30781d, RequestMethod.POST, this.f30780c).setParams(obj).setHeaders(hashMap).build();
                new HashMap();
                try {
                    return WENetworkUtil.makeRequest(this.f30780c, build, true, false, a10);
                } catch (Exception e10) {
                    Logger.d("WebEngage", "Exception occured at Network utils while Event syncing");
                    e10.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public Object e(Map<String, Object> map) {
        this.f30782e = map.get("action_data");
        this.f30781d = (String) map.get("server_url");
        return a((ArrayList<p0>) this.f30782e);
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public void e(Object obj) {
        ArrayList arrayList = (ArrayList) this.f30782e;
        ArrayList arrayList2 = new ArrayList();
        if (obj == null) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.toString(((p0) it.next()).g().intValue()));
                }
                m0.b(this.f30780c).b(arrayList2);
                return;
            }
            return;
        }
        HashMap hashMap = (HashMap) obj;
        int intValue = ((Integer) hashMap.get("status")).intValue();
        String a10 = ((p0) arrayList.get(0)).a();
        String i10 = ((p0) arrayList.get(0)).i();
        String h10 = h();
        if (intValue < 200 || intValue >= 400) {
            if (intValue == 401) {
                new ArrayList();
                if (m0.b(this.f30780c).d().booleanValue()) {
                    m0.b(this.f30780c).b(h10);
                    e(a10);
                } else {
                    x.a(this.f30780c).onSecurityException(hashMap);
                }
            }
            if (q2.d()) {
                q2.c(false);
                p2.f30762b.e().a(false);
                p2.f30762b.e().e();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.toString(((p0) it2.next()).g().intValue()));
            }
            m0.b(this.f30780c).b(arrayList2);
            Logger.d("WebEngage", "Event Logging failed, scheduling next sync");
            if (hashMap.get("exception") != null) {
                Logger.e("WebEngage", "Event sync failed due to Exception: " + String.valueOf(hashMap.get("exception")), (Throwable) hashMap.get("exception"));
                return;
            }
            return;
        }
        p2.f30762b.e().a(true);
        p2.f30762b.e().f();
        Logger.d("WebEngage", "Events successfully Logged to server, scheduling next sync");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.toString(((p0) it3.next()).g().intValue()));
        }
        if (hashMap.containsKey("data")) {
            InputStream inputStream = (InputStream) hashMap.get("data");
            try {
                if (inputStream != null) {
                    inputStream.close();
                } else {
                    Logger.d("WebEngage", "Input Stream with invalid data. result -> " + hashMap);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            Logger.d("WebEngage", "result.data is not Available  " + hashMap);
        }
        m0.b(this.f30780c).a((List<String>) arrayList3);
        if (i10.equals(h10) || !m0.b(this.f30780c).a(i10).booleanValue()) {
            return;
        }
        e(a10);
    }
}
