package io.nlopez.smartlocation.geocoding.providers;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import bc.InterfaceC1671a;
import bc.c;
import cc.InterfaceC1749a;
import dc.C3023a;
import ic.InterfaceC3364b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AndroidGeocodingProvider implements InterfaceC1749a {

    /* renamed from: h, reason: collision with root package name */
    private static final String f34401h = AndroidGeocodingProvider.class.getCanonicalName() + ".DIRECT_GEOCODE_ACTION";

    /* renamed from: i, reason: collision with root package name */
    private static final String f34402i = AndroidGeocodingProvider.class.getCanonicalName() + ".REVERSE_GEOCODE_ACTION";

    /* renamed from: a, reason: collision with root package name */
    private Locale f34403a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f34404b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f34405c;

    /* renamed from: d, reason: collision with root package name */
    private Context f34406d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3364b f34407e;

    /* renamed from: f, reason: collision with root package name */
    private BroadcastReceiver f34408f;

    /* renamed from: g, reason: collision with root package name */
    private BroadcastReceiver f34409g;

    public static class AndroidGeocodingService extends IntentService {

        /* renamed from: a, reason: collision with root package name */
        private Geocoder f34410a;

        public AndroidGeocodingService() {
            super(AndroidGeocodingService.class.getSimpleName());
        }

        private ArrayList a(Location location, int i10) {
            try {
                return new ArrayList(this.f34410a.getFromLocation(location.getLatitude(), location.getLongitude(), i10));
            } catch (IOException unused) {
                return new ArrayList();
            }
        }

        private ArrayList b(String str, int i10) {
            try {
                List<Address> fromLocationName = this.f34410a.getFromLocationName(str, i10);
                ArrayList arrayList = new ArrayList();
                Iterator<Address> it = fromLocationName.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3023a(it.next()));
                }
                return arrayList;
            } catch (IOException unused) {
                return new ArrayList();
            }
        }

        private void c(String str, ArrayList arrayList) {
            Intent intent = new Intent(AndroidGeocodingProvider.f34401h);
            intent.putExtra("name", str);
            intent.putExtra("result", arrayList);
            sendBroadcast(intent);
        }

        private void d(Location location, ArrayList arrayList) {
            Intent intent = new Intent(AndroidGeocodingProvider.f34402i);
            intent.putExtra("location", location);
            intent.putExtra("result", arrayList);
            sendBroadcast(intent);
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            Locale locale = (Locale) intent.getSerializableExtra("locale");
            if (locale == null) {
                this.f34410a = new Geocoder(this);
            } else {
                this.f34410a = new Geocoder(this, locale);
            }
            if (intent.hasExtra("direct")) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("direct");
                for (String str : hashMap.keySet()) {
                    c(str, b(str, ((Integer) hashMap.get(str)).intValue()));
                }
            }
            if (intent.hasExtra("reverse")) {
                HashMap hashMap2 = (HashMap) intent.getSerializableExtra("reverse");
                for (Location location : hashMap2.keySet()) {
                    d(location, a(location, ((Integer) hashMap2.get(location)).intValue()));
                }
            }
        }
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f34401h.equals(intent.getAction())) {
                AndroidGeocodingProvider.this.f34407e.a("sending new direct geocoding response", new Object[0]);
                AndroidGeocodingProvider.d(AndroidGeocodingProvider.this);
            }
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f34402i.equals(intent.getAction())) {
                AndroidGeocodingProvider.this.f34407e.a("sending new reverse geocoding response", new Object[0]);
                AndroidGeocodingProvider.f(AndroidGeocodingProvider.this);
            }
        }
    }

    public AndroidGeocodingProvider() {
        this(Locale.getDefault());
    }

    static /* synthetic */ InterfaceC1671a d(AndroidGeocodingProvider androidGeocodingProvider) {
        androidGeocodingProvider.getClass();
        return null;
    }

    static /* synthetic */ c f(AndroidGeocodingProvider androidGeocodingProvider) {
        androidGeocodingProvider.getClass();
        return null;
    }

    @Override // cc.InterfaceC1749a
    public void a(Context context, InterfaceC3364b interfaceC3364b) {
        this.f34407e = interfaceC3364b;
        this.f34406d = context;
    }

    @Override // cc.InterfaceC1749a
    public void stop() {
        try {
            this.f34406d.unregisterReceiver(this.f34408f);
        } catch (IllegalArgumentException unused) {
            this.f34407e.a("Silenced 'receiver not registered' stuff (calling stop more times than necessary did this)", new Object[0]);
        }
        try {
            this.f34406d.unregisterReceiver(this.f34409g);
        } catch (IllegalArgumentException unused2) {
            this.f34407e.a("Silenced 'receiver not registered' stuff (calling stop more times than necessary did this)", new Object[0]);
        }
    }

    public AndroidGeocodingProvider(Locale locale) {
        this.f34408f = new a();
        this.f34409g = new b();
        if (locale == null) {
            throw new RuntimeException("Locale is null");
        }
        this.f34403a = locale;
        this.f34404b = new HashMap();
        this.f34405c = new HashMap();
        if (!Geocoder.isPresent()) {
            throw new RuntimeException("Android Geocoder not present. Please check if Geocoder.isPresent() before invoking the search");
        }
    }
}
