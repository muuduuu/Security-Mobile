package K8;

import J8.p;
import M8.d;
import M8.e;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.HashSet;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    f f5464a;

    /* renamed from: b, reason: collision with root package name */
    f f5465b;

    a(f fVar, f fVar2) {
        this.f5464a = fVar;
        this.f5465b = fVar2;
    }

    public static a a(f fVar, f fVar2) {
        return new a(fVar, fVar2);
    }

    private String c(String str) {
        String d10 = d(this.f5464a, str);
        if (d10 != null) {
            return d10;
        }
        String d11 = d(this.f5465b, str);
        return d11 != null ? d11 : BuildConfig.FLAVOR;
    }

    private static String d(f fVar, String str) {
        g f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        try {
            return f10.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    e b(g gVar) {
        JSONArray j10 = gVar.j();
        long k10 = gVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < j10.length(); i10++) {
            try {
                JSONObject jSONObject = j10.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, BuildConfig.FLAVOR);
                hashSet.add(d.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k10).a());
            } catch (JSONException e10) {
                throw new p("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return e.a(hashSet);
    }
}
