package io.nlopez.smartlocation.geofencing.providers;

import S6.h;
import S6.p;
import android.app.IntentService;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import x7.C5126i;
import x7.InterfaceC5122e;

/* loaded from: classes2.dex */
public abstract class GeofencingGooglePlayServicesProvider implements h.b, h.c, p {

    /* renamed from: f, reason: collision with root package name */
    public static final String f34413f = GeofencingGooglePlayServicesProvider.class.getCanonicalName() + ".GEOFENCE_TRANSITION";

    public static class GeofencingService extends IntentService {
        public GeofencingService() {
            super(GeofencingService.class.getSimpleName());
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            C5126i a10 = C5126i.a(intent);
            if (a10 == null || a10.e()) {
                return;
            }
            int b10 = a10.b();
            Intent intent2 = new Intent(GeofencingGooglePlayServicesProvider.f34413f);
            intent2.putExtra("transition", b10);
            intent2.putExtra("location", a10.d());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = a10.c().iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5122e) it.next()).e());
            }
            intent2.putStringArrayListExtra("geofences", arrayList);
            sendBroadcast(intent2);
        }
    }
}
