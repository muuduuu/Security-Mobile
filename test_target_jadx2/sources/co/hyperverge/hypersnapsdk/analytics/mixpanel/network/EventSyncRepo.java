package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import android.content.Context;
import android.util.Log;
import ba.AbstractC1664b;
import ba.C1665c;
import com.google.gson.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class EventSyncRepo {
    private static final String EVENT_SYNC_FILENAME = "events_queue";
    private static final String EVENT_SYNC_FOLDER = "events";
    private static final String TAG = "co.hyperverge.hypersnapsdk.analytics.mixpanel.network.EventSyncRepo";
    private AbstractC1664b eventQueue;

    public static class EventConverter implements AbstractC1664b.a {
        private final e gson;

        public EventConverter(e eVar) {
            this.gson = eVar;
        }

        @Override // ba.AbstractC1664b.a
        public MixPanelEvent from(byte[] bArr) {
            return (MixPanelEvent) this.gson.i(new InputStreamReader(new ByteArrayInputStream(bArr)), MixPanelEvent.class);
        }

        @Override // ba.AbstractC1664b.a
        public void toStream(MixPanelEvent mixPanelEvent, OutputStream outputStream) {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            this.gson.x(mixPanelEvent, outputStreamWriter);
            outputStreamWriter.close();
        }
    }

    public EventSyncRepo(Context context) {
        this.eventQueue = null;
        try {
            File syncFile = getSyncFile(context);
            if (syncFile != null) {
                this.eventQueue = AbstractC1664b.j(new C1665c.a(syncFile).a(), new EventConverter(new e()));
            }
        } catch (IOException e10) {
            Log.e(TAG, "EventSyncHelper: ", e10);
        }
        if (this.eventQueue == null) {
            throw new IOException("Error in creating Events Queue: eventQueue is null");
        }
    }

    private File getSyncFile(Context context) {
        File file = new File(context.getFilesDir(), EVENT_SYNC_FOLDER);
        if (file.exists() || file.mkdirs()) {
            return new File(file, EVENT_SYNC_FILENAME);
        }
        Log.e(TAG, "getSyncFile: ", new IllegalStateException("Sync dir: " + file.getPath() + " could not be created"));
        return null;
    }

    boolean addEvent(MixPanelEvent mixPanelEvent) {
        Log.v(TAG, "addEvent() called with: event = [" + mixPanelEvent + "]");
        try {
            this.eventQueue.c(mixPanelEvent);
            return true;
        } catch (IOException e10) {
            Log.e(TAG, "add: ", e10);
            return false;
        }
    }

    boolean addEvents(List<MixPanelEvent> list) {
        Log.v(TAG, "addEvents() called with: events = [" + list + "]");
        try {
            Iterator<MixPanelEvent> it = list.iterator();
            while (it.hasNext()) {
                this.eventQueue.c(it.next());
            }
            return true;
        } catch (IOException e10) {
            Log.e(TAG, "addEvents: ", e10);
            return false;
        }
    }

    Iterator<MixPanelEvent> getEvents() {
        Log.v(TAG, "getEvents() called");
        return this.eventQueue.iterator();
    }

    int getEventsCount() {
        return this.eventQueue.size();
    }

    List<MixPanelEvent> getEventsList() {
        Log.v(TAG, "peekEvents() called when count = [" + this.eventQueue.size() + "]");
        Math.min(50, this.eventQueue.size());
        return this.eventQueue.e();
    }

    boolean hasPendingEvents() {
        return !this.eventQueue.isEmpty();
    }

    MixPanelEvent peek() {
        try {
            return (MixPanelEvent) this.eventQueue.peek();
        } catch (IOException e10) {
            Log.e(TAG, "peek: ", e10);
            return null;
        }
    }

    void removeEvents(int i10) {
        Log.v(TAG, "removeEvents() called with: count = [" + i10 + "]");
        this.eventQueue.t(Math.min(i10, this.eventQueue.size()));
    }
}
