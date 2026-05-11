package io.nlopez.smartlocation.activity.providers;

import S6.h;
import S6.p;
import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import x7.C5119b;

/* loaded from: classes2.dex */
public abstract class ActivityGooglePlayServicesProvider implements h.b, h.c, p {

    /* renamed from: f, reason: collision with root package name */
    private static final String f34400f = ActivityGooglePlayServicesProvider.class.getCanonicalName() + ".DETECTED_ACTIVITY";

    public static class ActivityRecognitionService extends IntentService {
        public ActivityRecognitionService() {
            super(ActivityRecognitionService.class.getSimpleName());
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            if (ActivityRecognitionResult.F(intent)) {
                C5119b u10 = ActivityRecognitionResult.j(intent).u();
                Intent intent2 = new Intent(ActivityGooglePlayServicesProvider.f34400f);
                intent2.putExtra("activity", u10);
                sendBroadcast(intent2);
            }
        }
    }
}
