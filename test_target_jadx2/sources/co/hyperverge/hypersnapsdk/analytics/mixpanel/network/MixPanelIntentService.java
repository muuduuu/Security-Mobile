package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import De.z;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.i;
import co.hyperverge.hypersnapsdk.data.remote.ApiClient;
import co.hyperverge.hypersnapsdk.helpers.NetworkHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class MixPanelIntentService extends i {
    private static final String ARG_EVENTS = "events";
    private static final int MIX_PANEL_JOB_ID = 328;
    private static final String TAG = "MixPanelIntentService";
    private static EventSyncRepo eventSyncRepo = null;
    private static boolean isEnqueueingOldEvents = false;
    private List<MixPanelEvent> currentEvents;
    private MixPanelApiInterface mixPanelApiClient;

    public static void enqueueEvent(Context context, String str, JSONObject jSONObject) {
        Log.v(TAG, "enqueueEvent() called with: eventName = [" + str + "], props = [" + jSONObject.toString() + "]");
        try {
            EventSyncRepo eventSyncRepo2 = getEventSyncRepo(context);
            MixPanelEvent mixPanelEvent = new MixPanelEvent(str, (Map) new e().l(jSONObject.toString(), new TypeToken<HashMap<String, Object>>() { // from class: co.hyperverge.hypersnapsdk.analytics.mixpanel.network.MixPanelIntentService.1
            }.getType()));
            if (!eventSyncRepo2.addEvent(mixPanelEvent)) {
                Log.d(TAG, "enqueueEvent: error adding event: [" + mixPanelEvent.toString() + "] to eventQueue");
            }
            enqueuePendingEvents(context);
        } catch (IOException e10) {
            Log.e(TAG, "enqueueEvent: failed to create eventSyncRepo " + e10.getLocalizedMessage());
        }
    }

    public static void enqueuePendingEvents(Context context) {
        int i10;
        try {
            EventSyncRepo eventSyncRepo2 = getEventSyncRepo(context);
            Log.v(TAG, "enqueuePendingEvents: pending events in queue: " + eventSyncRepo2.getEventsCount());
            if (!eventSyncRepo2.hasPendingEvents()) {
                Log.v(TAG, "No pending events to be pushed in eventQueue.");
                return;
            }
            if (!NetworkHelper.isNetworkAvailable(context)) {
                Log.d(TAG, "enqueuePendingEvents: Not connected to the internet, aborting events push");
                return;
            }
            if (isEnqueueingOldEvents) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList(eventSyncRepo2.getEventsList());
                int size = arrayList.size();
                Log.v(TAG, "enqueuePendingEvents: size: " + size + ", thread - " + Thread.currentThread().getName());
                int i11 = 0;
                i10 = 0;
                while (i11 < size) {
                    try {
                        int min = Math.min(size - i11, 50);
                        isEnqueueingOldEvents = true;
                        int i12 = i11 + min;
                        i.enqueueWork(context, (Class<?>) MixPanelIntentService.class, MIX_PANEL_JOB_ID, eventsToIntent(context, arrayList.subList(i11, i12)));
                        eventSyncRepo2.removeEvents(min);
                        i10 += min;
                        i11 = i12;
                    } catch (IOException e10) {
                        e = e10;
                        Log.e(TAG, Utils.getErrorMessage(e));
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                        }
                        Log.v(TAG, "enqueuePendingEvents: enqueued " + i10 + " events");
                        isEnqueueingOldEvents = false;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                i10 = 0;
            }
            Log.v(TAG, "enqueuePendingEvents: enqueued " + i10 + " events");
            isEnqueueingOldEvents = false;
        } catch (IOException e12) {
            Log.e(TAG, "enqueuePendingEvents: failed to create eventSyncRepo " + e12.getLocalizedMessage());
        }
    }

    private static Intent eventsToIntent(Context context, List<MixPanelEvent> list) {
        Log.v(TAG, "eventToIntent() called with: events = [" + list + "]");
        e eVar = new e();
        Intent intent = new Intent(context, (Class<?>) MixPanelIntentService.class);
        intent.putExtra(ARG_EVENTS, eVar.t(list));
        return intent;
    }

    private static EventSyncRepo getEventSyncRepo(Context context) {
        if (eventSyncRepo == null) {
            eventSyncRepo = new EventSyncRepo(context);
        }
        return eventSyncRepo;
    }

    private z<Object> postEvents(String str) {
        Log.v(TAG, "postEvents() called with: requestString = [" + str + "]");
        try {
            return this.mixPanelApiClient.postEvents(str).j();
        } catch (IOException e10) {
            Log.e(TAG, "postEvents: ", e10);
            if (eventSyncRepo.addEvents(this.currentEvents)) {
                return null;
            }
            Log.d(TAG, "postEvents: Error adding events to file: " + this.currentEvents.size());
            return null;
        }
    }

    @Override // androidx.core.app.i, android.app.Service
    public void onDestroy() {
        List<MixPanelEvent> list;
        super.onDestroy();
        Log.v(TAG, "onDestroy() called: All events processed");
        EventSyncRepo eventSyncRepo2 = eventSyncRepo;
        if (eventSyncRepo2 != null && (list = this.currentEvents) != null) {
            eventSyncRepo2.addEvents(list);
        }
        eventSyncRepo = null;
    }

    @Override // androidx.core.app.i
    protected void onHandleWork(Intent intent) {
        Log.v(TAG, "onHandleWork() called with: intent = [" + intent + "]");
        if (this.mixPanelApiClient == null) {
            this.mixPanelApiClient = ApiClient.getMixPanelService();
        }
        try {
            e eVar = new e();
            this.currentEvents = (List) eVar.l(intent.getStringExtra(ARG_EVENTS), new TypeToken<List<MixPanelEvent>>() { // from class: co.hyperverge.hypersnapsdk.analytics.mixpanel.network.MixPanelIntentService.2
            }.getType());
            Log.v(TAG, "onHandleWork() : posting mixPanelEvents = [" + this.currentEvents + "]");
            z<Object> postEvents = postEvents(eVar.t(this.currentEvents));
            this.currentEvents = null;
            Log.v(TAG, "onHandleWork() response = [" + postEvents + "]");
            if (postEvents == null) {
                return;
            }
            Object a10 = postEvents.a();
            if (a10 instanceof Double) {
                if (((Double) a10).doubleValue() == 0.0d) {
                    Log.d(TAG, "onResponse: error response 0 from MixPanel API");
                    return;
                } else {
                    if (((Double) a10).doubleValue() == 1.0d) {
                        Log.v(TAG, "onResponse: success response 1 from MixPanel API");
                        return;
                    }
                    return;
                }
            }
            if (a10 != null) {
                Log.d(TAG, "onResponse: errorResponse: " + ((MixPanelErrorResponse) eVar.k(a10.toString(), MixPanelErrorResponse.class)));
            }
        } catch (Exception e10) {
            Log.e(TAG, "onHandleWork: ", e10);
        }
    }
}
